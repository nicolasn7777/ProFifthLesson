package information_of_class;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
            System.out.println("Введіть назву класу: ");
            Scanner scanner = new Scanner(System.in);
            String nameOfClass = scanner.nextLine();
            infoOfClass(nameOfClass);
    }
    static class ShowClassInfo {
        private void show(Member[] members) {
            for (int i = 0; i < members.length; i++) {
                String m = members[i].toString();
                System.out.println("\t" + m);
            }
        }
    }
    private static void modifier(Class<?> cl) {
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods)) {
            System.out.print("private ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("final ");
        }
    }
    static void infoOfClass (String nameOfClass) throws ClassNotFoundException {
            ShowClassInfo check = new ShowClassInfo();

            Class <?> classInstance;
        try {
            classInstance = Class.forName("java.lang." + nameOfClass);
        } catch (ClassNotFoundException e) {
            classInstance = Class.forName("java.util." + nameOfClass);
        }
            System.out.println(classInstance);
            check.show(classInstance.getDeclaredFields());
            check.show(classInstance.getDeclaredConstructors());
            check.show(classInstance.getDeclaredMethods());
            modifier(classInstance);
    }
}
