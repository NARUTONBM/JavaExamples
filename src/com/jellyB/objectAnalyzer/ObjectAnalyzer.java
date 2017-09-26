package com.jellyB.objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 22:09.
 */
public class ObjectAnalyzer {

    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj) {

        if (obj == null) return "null";
        if (visited.contains(obj)) return "...";
        visited.add(obj);
        Class<?> aClass = obj.getClass();

        if (aClass == String.class) return (String) obj;

        if (aClass.isArray()) {

            String name = aClass.getComponentType() + "[]{";
            for (int i = 0; i < Array.getLength(obj); i++) {

                if (i > 0) name += ",";
                Object val = Array.get(obj, i);
                if (aClass.getComponentType().isPrimitive()) name += val;
                else name += toString(val);
            }

            return name + "}";
        }

        String name = aClass.getName();
        do {

            name += "[";
            Field[] fields = aClass.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);
            for (Field field : fields) {

                if (!Modifier.isStatic(field.getModifiers())) {

                    if (!name.endsWith("[")) name += ",";
                    name += field.getName() + "=";
                    Class<?> type = field.getType();
                    Object val = null;
                    try {

                        val = field.get(obj);
                        if (type.isPrimitive()) name += val;
                        else name += toString(val);
                    } catch (IllegalAccessException e) {

                        e.printStackTrace();
                    }
                }
            }
            name += "]";
            aClass = aClass.getSuperclass();
        } while (aClass != null);

        return name;
    }
}