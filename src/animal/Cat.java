package animal;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {
        try {
            Class cl = Animal.class;
            Animal cat = new Animal();

            Field field = cl.getDeclaredField("age");
            Field field1 = cl.getField("name");
            Field field2 = cl.getDeclaredField("ears");

            field.setAccessible(true);
            field2.setAccessible(true);

            System.out.println("Private field value: " + field.getInt(cat));
            System.out.println("Public field1 value: " + field1.get(cat));
            System.out.println("Protected field2 value: " + field2.getInt(cat));
            System.out.println();

            field.setInt(cat, 10);
            field1.set(cat, "Hoho");
            field2.setInt(cat, 1);

            System.out.println("New private field value: " + field.getInt(cat));
            System.out.println("New public field1 value: " + field1.get(cat));
            System.out.println("New protected field2 value: " + field2.getInt(cat));

            field.setAccessible(false);
            field2.setAccessible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
