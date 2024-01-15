package UserØvelse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Users {
  private List<User> userList;

  public Users() {
      this.userList = new ArrayList<>();
  }


    //Del af opgave 2 om at de skal kunne få et unikt ID - her er metoden til det.
    private int generateUniqueID() {
      if (!userList.isEmpty()) {
          return userList.stream().mapToInt(User::getUserID).max().orElse(0) + 1;
      } else {
          return 100;
      }
    }

        //Opgave 2 som handler om at de skal create og få et unikt ID
    public User createUser (String userName, UserRole userRole) {
        int YourUniqueID = generateUniqueID();
        User newUser = new User(userName, userRole, YourUniqueID);
        userList.add(newUser);
        return newUser;

    }

    public List<User> getUserList() {
        return userList;
    }

    public void deleteUser(int uniqueID) {
        userList.removeIf(user -> user.getUserID() == uniqueID);
    }


    //Opgave om at sortere efter hvilken rolle de har baseret på deres ENUM
    public void sortSpecificRole() {
      Comparator<User> sortSpecificRole = Comparator.comparing(user -> user.getUserRole().ordinal());

      Collections.sort(userList, sortSpecificRole);



    }


}
