// Method Overloading
// Method Signature (data type of parameters, no of parameters and order of parameters)
// should be different for different methods
// name and return type of the method remains same.

public class MethodOverloading {

    public static int calculateScore(String name, int score){
        System.out.println("Player "+name+" scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored "+score+" points");
        return score*1000;
    }

    public static int calculateScore(){
        System.out.println("No Player name, no player score");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("New score is "+calculateScore("Tim",500));
        System.out.println("New score is "+calculateScore(10));
        calculateScore();
    }
}
