
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask the user to input measurement in inches
        // use this to calculate the measurement into centimetres
        
        System.out.println("Please enter the measurement in inches you wish to convert:");
        int inches = input.nextInt();
        // calculate how many centimetres
        double cm = inches * 2.54;
        if (cm > 0) {
            System.out.println("OKAY HERE YOU GO: " + cm);
        }
        
        
    }
}
