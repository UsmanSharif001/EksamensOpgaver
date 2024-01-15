package UserØvelse;

public class User {
    private String userName;

    private int userID;

    private UserRole userRole;



    public User (String userName, UserRole userRole, int userID) {
        this.userName = userName;
        this.userRole = userRole;
        this.userID = userID;

    }

    public UserRole getUserRole() {
        return userRole;

    }

    public String getUserName() {
        return userName;
    }

    public int getUserID() {
        return userID;
    }


    @Override
    public String toString() {
        return "User: " +
                "userName = '" + userName + '\'' +
                ", role = " + userRole +
                ", uniqueID = " + userID;
    }
}
