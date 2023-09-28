public class Conditionals {
    public static void main(String[] args) {
        int score = 5000;

        // if conditional
        if(score == 5000){
            System.out.println("Your score was 5000");
        }

        // if-else conditional
        if(score < 5000){
            System.out.println("Your score is less than 5000");
        }
        else{
            System.out.println("Your score is greater than or equal to 5000");
        }

        // if-elseif-else conditional
        if(score < 5000){
            System.out.println("Your score is less than 5000");
        }
        else if(score == 5000){
            System.out.println("Your score is 5000");
        }
        else{
            System.out.println("Your score is more than 5000");
        }


    }
}
