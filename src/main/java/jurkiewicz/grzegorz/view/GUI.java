package jurkiewicz.grzegorz.view;

import java.util.Scanner;

public class GUI {
    public static void helloScreen() {
        System.out.println(" 1- Zaloguj");
        System.out.println(" 2- Zarejstruj");

        String choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextLine();

        if (choose.equals("1")) {
            //
            System.out.println("Logowanie");
        } else if (choose.equals("2")) {
            //Rejestracja
            System.out.println("Rejestracja");
        } else {
            System.out.println("Niepoprawny wybór - spróbuj jeszcze raz:");
            helloScreen();
        }
    }
    public static  void loginScrean(){
        System.out.println( "podaj login");

        String login;
        Scanner scanner = new Scanner(System.in);
        login = scanner.nextLine();

        System.out.println( "podaj haslo");

        String pass;
        Scanner scanner1 = new Scanner(System.in);

        pass = scanner1.nextLine();

        if(login.equals("admin") && pass.equals(("login")){
            System.out.println("Jest Git");
        } else {
            System.out.println("Nie jest git");
    }
}
