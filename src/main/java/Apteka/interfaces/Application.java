package Apteka.interfaces;

import java.util.Scanner;

public class Application {
    public static void startProject() {
        System.out.println("* * * Dehqonobod Arzon Aptekalari * * *");
        System.out.println("'1' - \"Kirish\"  '2' - \"Ro'yxatdan o'tish\"  '0' - \"Chiqish\"");
        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();

        if (command == 1) {
            kirish();
        } else if (command == 2) {
            RoyxatdanOtish.registration();
        } else if (command == 0) {
            System.exit(077);
        } else {
            System.out.println("Noto'g'ri buyruq!");
            startProject();
        }
    }

    private static void kirish() {
        System.out.println("Telefon raqamingiz:");
        System.out.print("+998 - ");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();


    }

}
