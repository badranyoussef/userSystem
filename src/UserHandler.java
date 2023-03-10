import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserHandler {

    private File file;
    private FileWriter fileWriter;
    private Scanner scanner;
    private ArrayList<User> users = new ArrayList<>();

    public UserHandler() {

        try {
            file = new File("users.txt");
            scanner = new Scanner(file);
            fileWriter = new FileWriter(file);
        }
        //hvis filen ikke findes så gør følgende
        catch (FileNotFoundException e) {
            System.out.println("Filen du ønsker at læse fra findes ikke");
        } catch (IOException e) {
            System.out.println("Systemet virker ikk");
        }

    }


    //a method to load users
    public void loadUsers() {
        // try {
        //Loop... while... så længe der er en line. kør
        while (scanner.hasNextLine()) {
            //gem next line i string tmp
            String tmp = scanner.nextLine();
            //split string tmp ved ","
            String[] elements = tmp.split(",");
            //for at lave en ny instans af user med navne og password gør følgende
            User user = new User(elements[0], elements[1]);
            //gem users i en ARRAYLISTEN som er lavet tidligere
            users.add(user);
        }
    }
     /*   catch(IOException e){
           System.out.println("Systemet virker ikke");
        } */


    public void saveUsers() {
        try {
            for (User user : users) {
                fileWriter.write(user.getName() + "," + user.getPassword());
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("systemet virker ikke");
        }
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


}
