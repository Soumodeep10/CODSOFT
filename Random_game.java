import java.util.*;

public class Random_game     // class Random_game
{
    public static void main(String args[])   // main method
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int max = 100;
        int min = 1;
        int random_no = random.nextInt(max - min + 1) + min;
        boolean continuePlaying = true;

        while (continuePlaying) {
            random_no = random.nextInt(max - min + 1) + min; // generate a new random number for each round
            continuePlaying = guessing_game(sc, random_no);  // calling guessing_game function  
        }

        sc.close();
    }

    public static boolean guessing_game(Scanner sc, int random_no)  // specifying guessing_game method
    {
        int flag = 0;
        int chance = 3;
        System.out.println("You have three chances");

        while (chance != 0) {
            System.out.print("Enter the Guessing Number: ");
            int guess_no = sc.nextInt();
            System.out.println();

            if (guess_no == random_no) {
                flag = 1;
                break;
            } else {
                System.out.println("Try Again");
                System.out.println("HINT: try close to this number " + (random_no + 1));
            }
            chance--;
        }

        if (flag == 1) {
            System.out.println("Congratulations, you guessed right!");
        } else {
            System.out.println("Oops, Better Luck Next Time");
        }

        System.out.println("Random No " + random_no);
        System.out.println("");


        System.out.print("Enter 1 to play another round or 2 to exit: ");   // asking the user whether to go for another round or not
        int playAgain = sc.nextInt();
        System.out.println("");

        return (playAgain == 1);
    }
}
