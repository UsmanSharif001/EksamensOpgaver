package UserØvelse12;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        User user1 = new User("Usman Sharif", "Usma0411");


        boolean isValid = user1.validUserID();
        System.out.println(isValid);


        //Virker ikke.

        User user2 = new User("aa am","BamW0010");

        boolean createUser = user2.createUserID();
        System.out.println(createUser);





    }
}
