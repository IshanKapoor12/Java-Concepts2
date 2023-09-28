public class Methods {

    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver){
            finalScore += levelCompleted*bonus;
            finalScore += 1000;
        }
        return finalScore;
    }

    public static void main(String[] args) {
        System.out.println("Your final score is "+CalculateScore(true,800,5,100 ));
        System.out.println("Your final score is "+CalculateScore(true,10000,8,200 ));
    }
}
