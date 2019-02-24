/**
 * @(#)geometricCalculator.java
 *52052418010
 * @author Riristanti Mohd Hasan
 * @version 1.00 2019/2/24
 */

import java.util.*;
public class irisCode {

    /**
     * Creates a new instance of <code>ICTCourses</code>.
     */
    public irisCode() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char type ;
        char choice = 'Y' ;


        Scanner sc = new Scanner (System.in);

        do{
            System.out.print ("Welcome to 2D Geometric Calculator");
            System.out.print ("\n********************************");
            System.out.print ("\nList of available shape :");
            System.out.print ("\n1. [A]Rectangle");
            System.out.print ("\n2. [B]Square");
            System.out.print ("\n3. [C]Triangle");
            System.out.print ("\n4. [D]Circle");
            System.out.print ("\n5. [E]Trapezium");
            System.out.print ("\nPlease select type of shape to calculate [A to E] :");

            type = sc.next().charAt(0);

            if (type == 'A')
            {
                System.out.print ("\nCalculating Rectangle Area");
                System.out.print ("\n-----------------------");
                System.out.print ("\nEnter width in centimeter: ");
                double  width = sc.nextInt();
                System.out.print ("\nEnter height in centimeter: ");
                double  height = sc.nextInt();

                double  result = (width*height);
                System.out.print ("\nYour rectangle area is : " + result+"cm\u00B2");

            }

            else if ( type == 'B')
            {
                System.out.print ("\nCalculating Square Area");
                System.out.print ("\n-----------------------");
                System.out.print ("\nEnter side length in centimeter: ");
                double  width = sc.nextInt();
                double  result = (width*width);
                System.out.print ("\nYour square area is : " + result+"cm\u00B2");
            }
            else if (type == 'C')
            {
                System.out.print ("\nCalculating Triangle Area");
                System.out.print ("\n-----------------------");
                System.out.print ("\nEnter base length in centimeter: ");
                double  length = sc.nextInt();
                System.out.print ("\nEnter height in centimeter: ");
                double  height = sc.nextInt();

                double  result = ((length*height)/2);
                System.out.print ("\nYour triangle area is : " + result+"cm\u00B2");            }
            else if (type == 'D')
            {
                System.out.print ("\nCalculating Circle Area");
                System.out.print ("\n-----------------------");
                System.out.print ("\nEnter circle radius in centimeter: ");
                double  radius = sc.nextInt();
                double  result = (Math.PI*radius*radius);
                System.out.print ("\nYour circle area is : " + result+"cm\u00B2");
            }
            else if (type == 'E')
            {
                System.out.print ("\nCalculating Trapezium Area");
                System.out.print ("\n-----------------------");
                System.out.print ("\nEnter top base length in centimeter: ");
                double  tlength = sc.nextInt();
                System.out.print ("\nEnter bottom base length in centimeter: ");
                double  blength = sc.nextInt();
                System.out.print ("\nEnter height in centimeter: ");
                double  height = sc.nextInt();

                double  result = (((tlength+blength)/2)*height);
                System.out.print ("\nYour trapezium area is : " + result+"cm\u00B2");
            }
            System.out.print ("\nDo you wish to continue [Y or N] :");
            choice = sc.next().charAt(0);
        } while (choice != 'N');

    }



}