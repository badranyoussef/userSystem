package userSystem;

import java.util.Scanner;

public class TextUI {

    Scanner scanner = new Scanner(System.in);
    UserHandler userHandler;


    public TextUI(UserHandler userHandler) {
        this.userHandler = userHandler;
    }

    public String getUserInput() {
        System.out.println("Hej bruger \n"+
                "Tast 1 for at logge ind\nTast 2 for at oprette en bruger\nAfslut med enter");
        String input = scanner.nextLine();
        return input;
    }

    public void loginMenu() {
        System.out.println("Indtast venligst brugernavn");
        String username = scanner.nextLine();
        System.out.println("Indtast venligst password");
        String password = scanner.nextLine();
        boolean loggedIn = userHandler.login(username, password);
        if(loggedIn){
            System.out.println("velkommen" + username);
        }
        else{
            System.out.println("Brugeren eller password er forkert");
        }

    }


    public void createUserMenu() {
        System.out.println("Create a new user\nType your username");
        String userName = scanner.nextLine();
        System.out.println("Type your password");
        String passWord = scanner.nextLine();
        System.out.println("Welcome onboard "+userName+" :D");
        userHandler.saveUsers();
    }
}
