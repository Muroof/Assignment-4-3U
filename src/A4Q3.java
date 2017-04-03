
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask the user to input measurement in inches
        // use this to calculate the measurement into centimetres
        
        System.out.println("Please enter the digits you wish to organize:");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third= input.nextDouble();
        double fourth = input.nextDouble();
        // organize them digits
        
        
        System.out.println(first + ", " + second + ", " + third + ", " + fourth);
        
        
        
    }
}
