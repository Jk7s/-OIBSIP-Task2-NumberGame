import java.util.Scanner;
public class NumberGame {
    public static void Start()
    {
        Scanner sc = new Scanner(System.in);
        int K = 5,i, guess;
        String playAgain="y";
        while(playAgain.equals("y") || playAgain.equals("Y")){
          int number = 1 + (int)(100 * Math.random());
          int score=100;
          System.out.println( "A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");
          for (i = 0; i < K; i++) {
              System.out.println("Guess the number:");
              guess = sc.nextInt();
              if (number == guess) {
                  System.out.println("Congratulations!"+ " You guessed the number.your score:"+(score-(i*10)));
                  System.out.println("Want to Play again?(y/n)");
                  playAgain =sc.next();
                  break;
                }
                else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
               }
               else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
               }
            }
            if (i == K) {
              System.out.println("Oops! You have exhausted" + " 5 trials.");
              System.out.println("The number was " + number+", your score: 0");
              System.out.println("Want to Play again?(y/n)");
              playAgain =sc.next();
            }
        }
        System.out.println("Thanks for playing!");
    }
    public static void main(String arg[])
    {
        Start();
    }
}