package Topics;

public class BreakContinue {
    public static void main(String[] args) {
        //Break = break out of a loop (stop)
        // continue = skip current iteration of a loop (skip)
        for(int i=0; i<10; i++){
            if(i == 4){
                continue;
            }
            else if (i==8){
                break;
            }
            System.out.print(i+ " ");
        }
    }
}
