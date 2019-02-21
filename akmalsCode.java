/*

 *  @(#) CalculateShapes.java

 *

 *  @author AKMAL 'AISY BIN RUDY

 *

 *  CalculateShapes

 *      DO

 *          DISPLAY "====================================="

 *          DISPLAY "\t\t\t\t 1: 2D \t\t 2: 3D \t\t\t\t"

 *          DISPLAY "====================================="

 *

 *          PROMPT "Which dimensions do you wish to calculate?"

 *          GET userDimension

 *

 *          IF userDimension == 2

 *

 *

 *          ELSE IF userDimension == 3

 *              DISPLAY "===================================="

 *              DISPLAY "shape code list"

 *              DISPLAY "===================================="

 *

 *              CASE OF shapeCode

 *              'a' :

 *                  DISPLAY Cylinder

 *                  PROMPT shapeRadius

 *                  GET shapeRadius

 *

 *                  PROMPT shapeHeight

 *                  GET shapeHeight

 * *

 *                  shapeVolume     <-  pi * ((shapeRadius * shapeRadius) * shapeHeight)

 *

 *

 *              'b' :   DISPLAY Pyramid

 *              'c' :   DISPLAY Sphere

 *              'd' :

 *                  DISPLAY Cuboid

 *                  PROMPT shapeBase

 *                  GET shapeBase

 *

 *                  PROMPT shapeHeight

 *                  GET shapeHeight

 *

 *                  PROMPT shapeWidth

 *                  GET shapeWidth

 *

 *                  shapeVolume     <-  shapeBase * shapeHeight * shapeWidth

 *                  shapeArea       <-  (2 * shapeBase * shapeWidth) + (2 * shapeBase * shapeHeight) + (2 * shapeHeight * shapeWidth)

 *                  shapePerimeter  <-  (2 * shapeBase) + (2 * shapeWidth)

 *

 *                  DISPLAY shapeVolume

 *                  DISPLAY shapeArea

 *                  DISPLAY shapePerimeter

 *

 *              'e' :   DISPLAY Cone

 *

 *          ENDIF

 *          ENDIF

 *

 *      WHILE ( repeat != 'N' AND 'n' )

 *      END DO

 *  END

 *

 *  @version 1.0.0  2019/1/15

 */

import java.util.*;



public class CalculateShapes

{

    //  Global file-wide input scanner declaration.

    private static Scanner scShapes     =   new Scanner(System.in);





    /*

     *  The basic user input that are repeated

     *  has been made into a function in order to avoid,

     *  longer and repeated code.

     *

     *  Improves future maintainability and implementation.

     */

    private static double userBaseInput()

    {

        double baseValue;



        System.out.print("Enter the base measurement: ");

        baseValue                       =   scShapes.nextDouble();



        return baseValue;

    }



    private static double userHeightInput()

    {

        double heightValue;



        System.out.print("Enter the height measurement: ");

        heightValue                     =   scShapes.nextDouble();



        return heightValue;

    }



    private static double userWidthInput()

    {

        double widthValue;



        System.out.print("Enter the width measurement: ");

        widthValue                      =   scShapes.nextDouble();



        return widthValue;

    }





    /*

     *  Main program body

     */

    public static void main(String args[])

    {

        //  Main function variable declaration and initialization.

        char repeat                     =   'n';

        int userDimension;



        double shapeBase;

        double shapeHeight;

        double shapeWidth;

        double shapeDiameter;



        double shapePerimeter;

        double shapeVolume;

        double shapeSurfaceArea;



        //  constant value variable

        double  pi                      =   3.142;





        //  initialization loop

        do

        {

            System.out.print("===============================================\n");

            System.out.print("Dimensional List :\n");

            System.out.print("2 : 2D\t\t" + "3 : 3D\t\t\t\t\n");

            System.out.print("===============================================\n");



            System.out.print("Which dimensions do you wish to calculate ? ");

            userDimension               =   scShapes.nextInt();



            /*

             *  Code committed by Danish Imran

             *  2D shapes list and formula.

             */

            if (userDimension   ==  2)

            {

                char shapeCode          =   '0';



                //  Display user prompt for 2D shapes

                System.out.print("===============================================\n");

                System.out.print("\t\t2D shapes code List :\n");

                System.out.print("===============================================\n");



            }



            /*

             *  Code committed by Akmal 'Aisy.

             *  3D shapes list and formula.

             */

            else if (userDimension    ==  3)

            {

                char shapeCode          =   '0';

                //  Display user prompt for 3D shapes

                System.out.print("===============================================\n");

                System.out.print("3D shapes code List :\n");

                System.out.print("===============================================\n");



                System.out.print("Please enter a shape code from the list: ");

                shapeCode               =   scShapes.next().charAt(0);



                switch(shapeCode)

                {

                    case 'a':

                        System.out.print("You have choosen a Cylinder");



                    case 'd':



                        //  volume of cube  =   Base * width * height

                        System.out.print("You have choosen a Cuboid\n");

                        shapeBase       =   userBaseInput();

                        shapeHeight     =   userHeightInput();

                        shapeWidth      =   userWidthInput();



                        shapeVolume         =   shapeBase * shapeHeight * shapeWidth;

                        shapeSurfaceArea    =   (2 * shapeBase * shapeWidth) + (2 * shapeBase * shapeHeight) + ( 2 * shapeHeight * shapeWidth);

                        shapePerimeter      =   (2 * shapeBase) + (2 * shapeWidth);



                        System.out.print("The volume of the Cuboid: \t" + shapeVolume);

                        System.out.print("The Surface Area of the Cuboid: \t" + shapeSurfaceArea);

                        System.out.print("The Perimeter for the Cuboid: \t" + shapePerimeter);

                        break;



                }

            }



            else {

                System.out.print("You have entered an invalid dimension");

            }



            System.out.print("\nDo you wish to continue? y/n ");

            repeat                      =   scShapes.next().charAt(0);



        } while ( repeat != 'n');

    }

}