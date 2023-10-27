import Model.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static User user= new User("Peppe","1234");
    public static void main(String[] args) {
        System.out.println(user.getUsername()+" "+ user.getPassword());
        }
    }
