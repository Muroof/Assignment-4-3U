
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // Ask the user for dice stuff

        // first square
        int square = 1;

        // game ends at the 100th sqaure
        while (square < 100) {
            // ask for the sum of the dice
            System.out.println("Enter sum of dice:");
            int roll = input.nextInt();
            
            if (roll < 2 && roll > 12) {
                System.out.println("YOU QUIT HAHAHA");
            }
            
            // allow only legal rolls between 2 and 12
            if (roll >= 2 && roll <= 12) {

                square = roll + square;
            } 




            // ALL SNAKES
            // if you land on 54, you'll slide down to 19
            if (square == 54) {
                square = square - 35;
            }
            // if you land on 90, you'll slide down to 48
            if (square == 90) {
                square = square - 42;
            }
            // if you land on 99, you'll slide down to 77
            if (square == 99) {
                square = square - 22;
            }

            // ALL LADDERS
            // if you land on 9, you'll climb up to 34
            if (square == 9) {
                square = square + 25;
            }
            // if you land on 40, you'll climb up to 64
            if (square == 40) {
                square = square + 24;
            }
            // if you land on 67, you'll climb up to 86
            if (square == 67) {
                square = square + 19;
            }



            // if you land on a sqaure past 100, stay put
            if (square > 100) {
                square = square - roll;
                System.out.println("Whoops, you rolled past 100, so you'll stay at " + square );
            }

            // outputs what sqaure you a currently on
            System.out.println("You have moved to square " + square);
            // if you land on sqaure 100, output that player has won!
            if (square == 100) {
                System.out.println("YOU WIN!");
            }





        }







    }
}
