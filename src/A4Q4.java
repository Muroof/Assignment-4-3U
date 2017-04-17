
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask the user to input measurement in inches
        // use this to calculate the measurement into centimetres
        System.out.println("How much does the food for prom cost?:");
        int food = input.nextInt();

        System.out.println("How much does the DJ cost?:");
        int dj = input.nextInt();

        System.out.println("How much does it cost to rent the hall?:");
        int hall = input.nextInt();

        System.out.println("How much does decorations cost?:");
        int decorations = input.nextInt();

        System.out.println("How much does it cost for staff?:");
        int staff = input.nextInt();

        System.out.println("How much for miscellaneous costs?:");
        int extra = input.nextInt();

        int total = food + dj + hall + decorations + staff + extra;

        int tickets = total / 35;

        System.out.println("The total cost is: " + total + ". You will need to sell " + tickets + " to break even boo.");
    }
}
