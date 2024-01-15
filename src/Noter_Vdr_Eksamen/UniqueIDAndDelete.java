//Første del af opgave 2
//private int generateUniqueID() {
//    if (!userList.isEmpty()) {
//        return userList.stream().mapToInt(User::getUserID).max().orElse(0) + 1;
//    } else {
//        return 100;
//    }
//}
//
////Opgave 2 som handler om at de skal create og få et unikt ID

//public User createUser (String userName, UserRole userRole) {
//    int newUniqueID = generateUniqueID();
//    User newUser = new User(userName, userRole, newUniqueID);
//    userList.add(newUser);
//    return newUser;
//}
//
//public void deleteUser(int uniqueID) {
//    userList.removeIf(user -> user.getUserID() == uniqueID);
//}