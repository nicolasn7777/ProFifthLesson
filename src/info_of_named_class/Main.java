package info_of_named_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";

        Class cl = Dog.class;
        System.out.println(s + "Public Reflection fields: " + s1);
        Field[] fields = cl.getFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldType.getName());
        }

        System.out.println(s + "All Modifiers Reflection fields: " + s1);
        fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldType.getName());
            System.out.println();
        }

        System.out.println(s + "Constructors: " + s1);
        Constructor[] constructors = cl.getConstructors();
        for (Constructor ctr : constructors) {
            System.out.println(ctr);
            System.out.println();
        }

        System.out.println(s + "Methods: " + s1);
        Method[] method = cl.getMethods();
        for (Method temp : method) {
            System.out.println(temp);
            System.out.println();
        }

        System.out.print(s + "Modifiers of class: " + s1);
        Class cl1 = Dog.DogModifier.class;
        int mods = cl1.getModifiers();
        if (Modifier.isPrivate(mods))
            System.out.print("private ");
        if (Modifier.isAbstract(mods))
            System.out.print("abstract ");
        if (Modifier.isStatic(mods))
            System.out.print("static ");
        if (Modifier.isFinal(mods))
            System.out.print("final ");
    }
}
