package UserØvelse12;

import java.util.ArrayList;

public class User {

    private String fullName;
    private String userID;

    public User(String fullName, String userID) {
        this.fullName = fullName;
        this.userID = userID;
    }



    public boolean validUserID() {

        return userID.matches("[a-zA-Z]{4}\\d{4}");

    }



///Virker ikke
    public boolean createUserID() {
        fullName = userID;
        return userID.matches("[a-zA-Z][2][a-zA-Z][2]");
    }


    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }
}
