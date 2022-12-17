package Apteka.interfaces;

import Apteka.Data.Storage;
import Apteka.models.User;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RoyxatdanOtish {
    public static void registration(){
        System.out.println("Telefon Raqami:");
        System.out.print("+998-");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        if(phoneNumber.matches("(33|77|88|90|91|93|94|95|97|98|99)[0-9]{7}")){
            User user = new User();
            if(!user.isExist(Storage.userList,phoneNumber)){
                System.out.println("Ismingiz:");
                String name = scanner.nextLine();
                user.setName(name);
                user.setPhoneNumber(phoneNumber);
                user.setId(User.currentId);
                Storage.userList.add(user);
                System.out.println("Muvafaqqiyatli ro'yxatdan o'tdingiz!");
                Application.startProject();
            }else {
                System.out.println("Bu Raqam oldin ro'yxatdan o'tqazilgan!");
                Application.startProject();
            }
        }else {
            System.out.println("Telefon Raqamingni to'g'ri kirgiz!");
            Application.startProject();
        }
    }
}
