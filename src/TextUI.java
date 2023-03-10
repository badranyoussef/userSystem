import java.util.Scanner;

public class TextUI {

    Scanner scanner = new Scanner(System.in);
    UserHandler userHandler;


    public TextUI(UserHandler userHandler) {
        this.userHandler = userHandler;
    }

    public String getUserInput() {
        System.out.println("Hej bruger"+
                "ønsker du 1) at logge ind eller 2) at oprette bruger?"+
                "Skrive 1 eller 2 og afslut med enter");
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
    }
}
