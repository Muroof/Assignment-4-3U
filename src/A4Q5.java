
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // scanner to get user input
        Scanner input = new Scanner(System.in);

        // ask the user to input measurement in inches
        // use this to calculate the measurement into centimetres
        
        System.out.println("Enter your name:");
        String name = input.nextLine();
        
        
        
        System.out.println("What was your first test out of?:");
        double testTotal1 = input.nextInt();
        
        System.out.println("What mark did you get?:");
        double testMark1 = input.nextInt();
        
        
        
        System.out.println("What was your second test out of?:");
        double testTotal2 = input.nextInt();
        
        System.out.println("What mark did you get?:");
        double testMark2 = input.nextInt();
        
        
        
        System.out.println("What was your third test out of?:");
        double testTotal3 = input.nextInt();
        
        System.out.println("What mark did you get?:");
        double testMark3 = input.nextInt();
        
        
        
        System.out.println("What was your fourth test out of?:");
        double testTotal4 = input.nextInt();
        
        System.out.println("What mark did you get?:");
        double testMark4 = input.nextInt();
        
        
        
        System.out.println("What was your fifth test out of?:");
        double testTotal5 = input.nextInt();
        
        System.out.println("What mark did you get?:");
        double testMark5 = input.nextInt();
        
        
        
        
        
        
        
        double testPercentage1 = (testMark1/testTotal1) * 100;
        double testPercentage2 = (testMark2/testTotal2) * 100;
        double testPercentage3 = (testMark3/testTotal3) * 100;
        double testPercentage4 = (testMark4/testTotal4) * 100;
        double testPercentage5 = (testMark5/testTotal5) * 100;
        
        double totalAverage = ((testPercentage1 + testPercentage2 + testPercentage3 + testPercentage4 + testPercentage5)/5);
        
        
        System.out.println("Test scores for " + name + ":");
        
        System.out.println("Test 1: " + testPercentage1);
        System.out.println("Test 2: " + testPercentage2);
        System.out.println("Test 3: " + testPercentage3);
        System.out.println("Test 4: " + testPercentage4);
        System.out.println("Test 5: " + testPercentage5);
        
        System.out.println("Average: " + totalAverage);
    }
}
