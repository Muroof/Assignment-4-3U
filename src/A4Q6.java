
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask the user to input measurement in inches
        // use this to calculate the measurement into centimetres

        System.out.println("Enter the speed limit:");
        double limit = input.nextInt();

        System.out.println("Enter your speed:");
        double speed = input.nextInt();



        if (speed <= limit) {

            System.out.println("Congratulations, you are within the speed limit!");

        } else if (speed >= limit + 20 & speed <= limit + 31) {

            System.out.println("You are speeding and your fine is $270");


        } else if (speed >= limit + 31) {

            System.out.println("You are speeding and your fine is $500");

        }

        else if (speed > limit) {
            System.out.println("You are speeding and your fine is $100");



        }




    }
}
