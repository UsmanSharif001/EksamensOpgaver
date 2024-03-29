package UserØvelse;

import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Users userManager = new Users();


        User newUser1 = userManager.createUser("John Stan", UserRole.EDITOR);
        User newUser2 = userManager.createUser("Kelly Clark", UserRole.Admin); //Kelly er slettet
        User newUser3 = userManager.createUser("Ben Timothy", UserRole.READER);
        User newUser4 = userManager.createUser("Healen Glen", UserRole.EDITOR);

        newUser1.getUserID();
        newUser2.getUserID();
        newUser3.getUserID();
        newUser4.getUserID();



        //Kelly slettes her
        userManager.deleteUser(1);
       List<User> userList = userManager.getUserList();

        //userList.addAll(List.of(newUser1, newUser2, newUser3, newUser4));
        System.out.println("Her er brugerne: ");

        //ForEach løkke istedet for den traditionnelle måde at skrive det både
        userList.forEach(System.out::println);

        //Sortere efter hvilken rolle de har ADMIN/READER/EDITOR
        userManager.sortSpecificRole();
        userList.forEach(user -> System.out.println(user.getUserRole()));

        List<Integer> id = userList.stream().map(User::getUserID).toList();
       id.forEach(userID-> System.out.println("User id " + userID));

       List<Integer> ids = userList.stream().map(User::getUserID).toList();
        System.out.println("Ids given: ");
       ids.forEach(System.out::println);

       List<User> userIDsAndNames = userList.stream().sorted(Comparator.comparing(User::getUserID).thenComparing(User::getUserName)).toList();
       userIDsAndNames.forEach(iii -> System.out.println("IDS given: "  + iii.getUserID() + " Names: " + iii.getUserName()));


        List<String>name = userList.stream().map(User::getUserName).toList();
        name.forEach(nameList-> System.out.println("Names: " + nameList));

        Spliterator<User> spliterato1 = userList.spliterator();
        Spliterator<User>spliterator2 = userList.spliterator();
        Spliterator<User> spliterator3 = userList.spliterator();

        spliterato1.forEachRemaining(user -> System.out.println(user.getUserName()));
        spliterator2.forEachRemaining(user -> System.out.println(user.getUserID()));
        spliterator3.forEachRemaining(user -> System.out.println(user.getUserRole()));



        userList.forEach(System.out::println);

        Spliterator<User> test4 = userList.spliterator();

        System.out.println("Test: ");

        test4.forEachRemaining(user -> System.out.println("Username: " + user.getUserName().toLowerCase().toUpperCase().trim()
                + " User role: " + user.getUserRole() + " ID: " + user.getUserID()));


        Spliterator<User> test5 = userList.spliterator();

        test5.forEachRemaining(user -> System.out.println(user.getUserName().trim() + user.getUserRole().name()));


    }
}
