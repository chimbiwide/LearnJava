package ObjectOriented.StaticKeyWord;

public class Static {
    public static void main(String[] args) {

        //static = Makes a variable or method belong to the class
        //         Rather than the specific object
        //         Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Rudra");
        Friend friend2 = new Friend("CANK");
        Friend friend3 = new Friend("Ryan");
        Friend friend4 = new Friend("Fat");

        //they only print 1 when there is no "static" keyword when initializing the variable
        //access the static variable from the class and not objects
        System.out.println(Friend.numFriends);

        Friend.showFriends();
    }
}
