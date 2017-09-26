package com.jellyB.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * User: 35012.
 * Date: 2017-09-26.
 * Time: 19:32.
 */
public class ReflectionTest {

    public static void main(String[] args) {

        /*从命令行读取类名或者由用户输入*/
        String name;
        if (args.length > 0) name = args[0];
        else {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = scanner.next();
        }

        try {

            Class aClass = Class.forName(name);
            Class superclass = aClass.getSuperclass();
            String modifiers = Modifier.toString(aClass.getModifiers());

            if (modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.print("class " + name);
            if (superclass != null && superclass != Object.class) System.out.print(" extends " + superclass.getName());
            System.out.print("\n{\n");
            printConstructors(aClass);
            System.out.println();
            printMethods(aClass);
            System.out.println();
            printFields(aClass);
            System.out.println("}");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

        System.exit(0);
    }

    private static void printConstructors(Class aClass) {

        Constructor[] constructors = aClass.getDeclaredConstructors();

        for (Constructor c : constructors) {

            String name = c.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(c.getModifiers());

            if (modifiers.length() > 0) System.out.print(modifiers + " ");
            System.out.print(name + "(");
            Class[] parameterTypes = c.getParameterTypes();

            for (int j = 0; j < parameterTypes.length; j++) {

                if (j > 0) System.out.print(", ");
                System.out.print(parameterTypes[j].getName());
            }

            System.out.println(")");
        }
    }

    private static void printMethods(Class aClass) {

        Method[] methods = aClass.getDeclaredMethods();

        for (Method m : methods) {

            Class<?> returnType = m.getReturnType();
            String name = m.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(m.getModifiers());

            if (modifiers.length() > 0) {

                System.out.print(modifiers + " ");
            }
            System.out.print(returnType.getName() + " " + name + "(");
            Class<?>[] parameterTypes = m.getParameterTypes();

            for (int i = 0; i < parameterTypes.length; i++) {

                if (i > 0) {

                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }

            System.out.println(")");
        }
    }

    private static void printFields(Class aClass) {

        Field[] fields = aClass.getDeclaredFields();

        for (Field f : fields) {

            Class<?> type = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(f.getModifiers());

            if (modifiers.length() > 0) {

                System.out.print(modifiers + " ");
            }

            System.out.println(type.getName() + " " + name + ";");
        }
    }
}