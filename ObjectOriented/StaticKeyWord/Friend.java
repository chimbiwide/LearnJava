package ObjectOriented.StaticKeyWord;

public class Friend {
    String name;
    static int numFriends;

    Friend(String name) {
        this.name = name;
        numFriends++;
   }

   static void showFriends() {
       System.out.println("You have " + numFriends + " friends");
   }
}
