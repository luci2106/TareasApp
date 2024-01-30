import Modelo.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        user.insertar("(name,password,rol_idRol) values (?,?,?)","admin","1234",1);
    }

}