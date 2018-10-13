package jurkiewicz.grzegorz.repository;

import jurkiewicz.grzegorz.model.User;

import java.util.ArrayList;

public class UserRepo {
    private static ArrayList<User> userDB = new ArrayList<User>();

    public static void  addUser (User user) {
        UserRepo.userDB.add(user);
    }
    public  static boolean authenticate ( User user){
        for (User userFormDB: UserRepo.userDB) {
        if (userFormDB.getLogin().equals user.getLogin() && userFormDB.getPass().equals(user.getPass());{
            return true;
            }
        }
        return false;
    }
    }
