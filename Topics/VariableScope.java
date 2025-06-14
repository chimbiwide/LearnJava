package Topics;

public class VariableScope {
    static int x = 18; //class
    public static void main(String[] args) {
        // 2 types of variable: Local and Class
        int x = 114514; //Local Variable
        add();
    }
    static void add() {
         int x = 9; //Local Variable
        System.out.println(x);
    }
}
