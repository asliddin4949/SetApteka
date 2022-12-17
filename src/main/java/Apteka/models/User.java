package Apteka.models;

import Apteka.Data.Storage;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class User implements CheckStorage<User> {
    private int id;
    String name;
    String phoneNumber;

    public static int currentId = 0;

    {
        currentId++;
    }

    @Override
    public boolean isExist(List<User> list, String phoneNumber) {
        User checkUser = list.stream().filter(user ->
                        user.phoneNumber.equals(phoneNumber)).findFirst().orElse(null);
        return checkUser!=null;
    }
}
