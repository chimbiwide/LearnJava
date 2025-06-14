package Projects;

public class TelephoneNumPad {
    public static void main(String[] args) {
        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*','0','#'}};
        printNum(telephone);
    }
    static void printNum(char phone[][]){
        for (char[] row : phone){
            for (char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
