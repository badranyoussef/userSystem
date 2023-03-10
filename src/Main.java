public class Main {
    public static void main(String[] args) {
        //load fil med brugernavne/passwords
        UserHandler userHandler = new UserHandler();
        userHandler.loadUsers();

        TextUI textUI = new TextUI(userHandler);

        //Skriv til bruger og spørg om der skal logges ind eller oprettes bruger
        String input = textUI.getUserInput();

        //login eller opret bruger baseret på tidligere svar.
        switch (input){
            case "1": textUI.loginMenu(); break;
            case "2": textUI.createUserMenu(); break;
            default:
                System.out.println("Goodbye");

        }



        //Skriv velkommen til brugeren hvis det lykkes ellers skrive hvilken fejl der opstod

        //gemme alle brugernavn/password
        //userHandler.saveUsers();
    }
}