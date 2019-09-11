/*
 *  Date:20th February 2019
 *
 *  @author RIRISTANTI BINTI MOHD HASAN (52052418010)
 *          NORFATONAH BINTI ZAILI (52052418003)
 *
 *
 *  #Psuedo
 *
 *  geometricCalculator
 *
 *
 *  END
 */


import java.util.*;

public class irisCode
{
    public static void main (String args []){

        /*
         * declaration
         * Math.sqrt = square root
         * Math.PI = 3.142
         * Math.pow(5,2) = 5^2
         * radius
         */
        double radius = 0;
        double height = 0;
        char type ;
        char choice = 'Y' ;
        char shape = 'n';



        Scanner sc = new Scanner (System.in);

        do{
            System.out.print ("\nWelcome to 2D Geometric Calculator");
            System.out.print ("\nDo you want to calculate [A]2D or [B]3D shape? ");
            shape = sc.next().charAt(0);



            if(shape == 'a' || shape == 'A'){
                System.out.print ("\nYou have selected 2D shapes!");
                System.out.print ("\nList of available shape :");
                System.out.print ("\n1. [A]Rectangle");
                System.out.print ("\n2. [B]Square");
                System.out.print ("\n3. [C]Triangle");
                System.out.print ("\n4. [D]Circle");
                System.out.print ("\n5. [E]Trapezium");
                System.out.print ("\nPlease select type of shape to calculate [A to E] :");

                type = sc.next().charAt(0);

                if (type == 'A'|| type == 'a')
                {
                    System.out.print ("\nCalculating Rectangle Area");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter width in centimeter: ");
                    double  width = sc.nextInt();
                    System.out.print ("\nEnter height in centimeter: ");
                    height = sc.nextInt();

                    double  result = (width * height);
                    System.out.print ("\nYour rectangle area is : " + result+"cm\u00B2");

                }

                else if ( type == 'B'|| type == 'b')
                {
                    System.out.print ("\nCalculating Square Area");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter side length in centimeter: ");
                    double  width = sc.nextInt();
                    double  result = (width * width);
                    System.out.print ("\nYour square area is : " + result+"cm\u00B2");
                }
                else if (type == 'C'|| type == 'c')
                {
                    System.out.print ("\nCalculating Triangle Area");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter base length in centimeter: ");
                    double  length = sc.nextInt();
                    System.out.print ("\nEnter height in centimeter: ");
                    height = sc.nextInt();

                    double  result = ((length * height)/2);
                    System.out.print ("\nYour triangle area is : " + result+"cm\u00B2");
                }
                else if (type == 'D'|| type == 'd')
                {
                    System.out.print ("\nCalculating Circle Area");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter circle radius in centimeter: ");
                    radius = sc.nextInt();

                    double  result = (Math.PI * radius * radius * height);
                    System.out.print ("\nYour circle area is : " + result+"cm\u00B2");
                }
                else if (type == 'E'|| type == 'e')
                {
                    System.out.print ("\nCalculating Trapezium Area");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter top base length in centimeter: ");
                    double  tlength = sc.nextInt();
                    System.out.print ("\nEnter bottom base length in centimeter: ");
                    double  blength = sc.nextInt();
                    System.out.print ("\nEnter height in centimeter: ");
                    height = sc.nextInt();

                    double  result = (((tlength + blength)/2)* height);
                    System.out.print ("\nYour trapezium area is : " + result+"cm\u00B2");
                }

            }

            else if(shape == 'B' || shape == 'b')
            {

                System.out.print ("\nYou have selected 3D shapes!");
                System.out.print ("\nList of available shape :");
                System.out.print ("\n1. [A]Cylinder");
                System.out.print ("\n2. [B]Pyramid");
                System.out.print ("\n3. [C]Sphere");
                System.out.print ("\n4. [D]Cuboid");
                System.out.print ("\n5. [E]Cone");
                System.out.print ("\nPlease select type of shape to calculate [A to E] :");

                type = sc.next().charAt(0);

                if (type == 'A'|| type == 'a')
                {
                    System.out.print ("\nCalculating Cylinder Volume");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter radius in centimeter: ");
                    radius = sc.nextInt();
                    System.out.print ("\nEnter height in centimeter: ");
                    height = sc.nextInt();

                    double  result = (Math.PI * radius * radius * height);
                    double surfacearea = ((2 * Math.PI * radius * height)+(2 * Math.PI * radius * radius));
                    System.out.print ("\nYour cylinder volume is : " + result);
                    System.out.print ("\nYour cylinder surface area is : " + surfacearea);

                }

                else if ( type == 'B'|| type == 'b')
                {
                    System.out.print ("\nCalculating Pyramid Volume");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter side length in centimeter: ");
                    double  length = sc.nextInt();
                    System.out.print ("\nEnter side width in centimeter: ");
                    double  width = sc.nextInt();
                    System.out.print ("\nEnter side height in centimeter: ");
                    height = sc.nextInt();

                    double  result = (length * width * height / 3);
                    double surfacearea= (length * width) + (length * Math.sqrt(((width / 2) *
                                        (width / 2)) + (height * height))) +
                                        (width * Math.sqrt(((0.5) * (0.5)) + (height * height)));
                    System.out.print ("\nYour pyramid volume is : " + result);
                    System.out.print ("\nYour pyramid surface area is : " + surfacearea);
                }
                else if (type == 'C' || type == 'c')
                {
                    System.out.print ("\nCalculating Sphere Volume");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter sphere radius in centimeter: ");
                    radius = sc.nextInt();

                    double  result = (1.33 * Math.PI * radius * radius * radius);
                    double surfacearea= (4 * Math.PI * radius * radius);
                    System.out.print ("\nYour sphere volume is : " + result);
                    System.out.print ("\nYour sphere surface area is : " + surfacearea);
                }
                else if (type == 'D' || type == 'd')
                {
                    System.out.print ("\nCalculating Cuboid Area");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter cuboid length in centimeter: ");
                    double length = sc.nextInt();
                    System.out.print ("\nEnter cuboid height in centimeter: ");
                    height = sc.nextInt();
                    System.out.print ("\nEnter cuboid width in centimeter: ");
                    double width = sc.nextInt();
                    System.out.print ("\nEnter base in centimeter: ");
                    double base = sc.nextInt();

                    double  result = (length * height * width);
                    double surfacearea= ((2 * base * width)+(2 * base * height)+(2 * height * width));

                    System.out.print ("\nYour cuboid area is : " + result);
                    System.out.print ("\nYour cuboid surface area is : " + surfacearea);
                }
                else if (type == 'E' || type == 'e')
                {
                    System.out.print ("\nCalculating Cone Volume");
                    System.out.print ("\n-----------------------");
                    System.out.print ("\nEnter radius in centimeter: ");
                    radius = sc.nextInt();
                    System.out.print ("\nEnter height in centimeter: ");
                    height = sc.nextInt();

                    double  result = (Math.PI * radius * radius * height/3);
                    double surfacearea = ((Math.PI * radius)*(Math.sqrt(height * height + radius * radius)));
                    System.out.print ("\nYour cone volume is : " + result);
                    System.out.print ("\nYour cone surface area is : " + surfacearea);
                }


            }

            System.out.print ("\nDo you wish to continue [Y or N] :");
            choice = sc.next().charAt(0);
        } while (choice != 'N');

    }
}