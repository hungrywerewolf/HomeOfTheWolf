/*
 *  @(#) CalculateShapes.java
 *
 *  @author AKMAL 'AISY BIN RUDY (52052418001)
 *          DANISH IMRAN BIN MOHD ARIF ARCHI (52052418005)
 *
 *  userBaseInput
 *      PROMPT user for baseValue
 *      GET baseValue
 *
 *      return baseValue
 *  END
 *
 *  userHeightInput
 *      PROMPT user for heightValue
 *      GET heightValue
 *
 *      return heightValue
 *  END
 *
 *  userWidthInput
 *      PROMPT user for widthValue
 *      GET widthValue
 *
 *      return widthValue
 *  END
 *
 *  userRadiusInput
 *      PROMPT user for radiusValue
 *      GET radiusValue
 *
 *      return radiusValue
 *  END
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
 *              DISPLAY "==================================="
 *              DISPLAY "2d shape code list"
 *              DISPLAY "==================================="
 *
 *              PROMPT shapeCode
 *              GET shapeCode
 *
 *              CASE OF shapeCode
 *              'A' :
 *                  DISPLAY Rectangle
 *                  PROMPT shapeHeight
 *                  GET shapeHeight
 *
 *                  PROMPT shapeBase
 *                  GET shapeBase
 *
 *                  shapeArea       <- shapeHeight *  shapeBase
 *                  shapePerimeter  <- (2 * shapeHeight) + (2 * shapeBase)
 *
 *                  DISPLAY shapeArea
 *                  DISPLAY shapePerimeter
 *
 *             'D' :
 *                 DISPLAY Triangle
 *                 PROMPT shapeBase
 *                 GET shapeBase
 *
 *                 PROMPT shapeHeight
 *                 GET shapeHeight
 *
 *                 PROMPT shapeBaseB
 *                 GET shapeBaseB
 *
 *                 PROMPT shapeBaseC
 *                 GET shapeBaseC
 *
 *                 shapeArea       <- 0.5 * (shapeBase * shapeHeight)
 *                 shapePerimeter  <- shapeBase + shapeBaseB + shapeBaseC
 *
 *                 DISPLAY shapeArea
 *                 DISPLAY shapePerimeter
 *
 *             'B' :
 *                 DISPLAY Square
 *                 PROMPT shapeBase
 *                 GET shapeBase
 *
 *                 PROMPT shapeHeight
 *                 GET shapeHeight
 *
 *                 shapeArea      <- shapeBase * shapeHeight
 *                 shapePerimeter <- (2 * shapeBase) + (2 * shapeHeight)
 *
 *                 DISPLAY shapeArea
 *                 DISPLAY shapePerimeter
 *
 *             'E' :
 *                 DISPLAY Circle
 *                 PROMPT shapeRadius
 *                 GET shapeRadius
 *
 *                 shapeArea      <- pi * (shapeRadius * shapeRadius)
 *                 shapePerimeter <- 2 * pi * shapeRadius
 *
 *                 DISPLAY shapeArea
 *                 DISPLAY shapePerimeter
 *
 *             'C' :
 *                 DISPLAY Trapezium
 *                 PROMPT shapeHeight
 *                 GET shapeHeight
 *
 *                 PROMPT shapeBaseA
 *                 GET shapeBaseA
 *
 *                 PROMPT shapeBaseB
 *                 GET shapeBaseB
 *
 *                 shapeArea      <- ((shapeBaseA + shapeBaseB) / 2) * shapeHeight
 *                 shapePerimeter <- shapeBase + shapeBaseB + shapeBaseC + shapeHeight
 *
 *                 DISPLAY shapeArea
 *                 DISPLAY shapePerimeter
 *
 *
 *
 *          ELSE IF userDimension == 3
 *              DISPLAY "===================================="
 *              DISPLAY "3d shape code list"
 *              DISPLAY "===================================="
 *
 *              CASE OF shapeCode
 *              'A' :
 *                  DISPLAY Cylinder
 *
 *                  shapeRadius         <-  userRadiusInput
 *                  shapeHeight         <-  userHeightInput
 *
 *
 *                  shapeVolume         <-  pi * ((shapeRadius * shapeRadius) * shapeHeight)
 *                  shapeSurfaceArea    <-  (2 * pi * shapeRadius * shapeHeight) +
 *                                          (2 * pi * (shapeRadius * shapeRadius))
 *
 *                  shapePerimeter      <-  (2 * (pi * (shapeRadius * 2) * shapeHeight))
 *
 *                  DISPLAY shapeVolume
 *                  DISPLAY shapeSurfaceArea
 *                  DISPLAY shapePerimeter
 *
 *              'D' :
 *                  DISPLAY Pyramid
 *
 *                  shapeBase           <-  userBaseInput
 *                  shapeHeight         <-  userHeightInput
 *                  shapeWidth          <-  userWidthInput
 *
 *
 *                  shapeVolume         <-  (shapeBase * shapeHeight * shapeWidth) / 3
 *
 *                  shapeSurfaceArea    <-  (shapeBase * shapeWidth) +
 *                                          (shapeBase * Math.sqrt(
 *                                                              (shapeWidth / 2) * (shapeWidth / 2)) +
 *                                                              (shapeHeight * shapeHeight))) +
 *                                          (shapeWidth * Math.sqrt(
 *                                                              ((0.5) * (0.5)) +
 *                                                              (shapeHeight * shapeHeight)))
 *
 *                  DISPLAY shapeVolume
 *                  DISPLAY shapeSurfaceArea
 *
 *              'B' :
 *                  DISPLAY Sphere
 *
 *                  shapeRadius         <-  userRadiusInput
 *
 *                  shapeVolume         <-  1.333 * (pi * (shapeRadius * shapeRadius * shapeRadius))
 *                  shapeSurfaceArea    <-  4 * (pi * (shapeRadius * shapeRadius)
 *
 *                  DISPLAY shapeVolume
 *                  DISPLAY shapeSurfaceArea
 *
 *              'E' :
 *                  DISPLAY Cuboid
 *
 *                  shapeBase           <-  userBaseInput
 *                  shapeHeight         <-  userHeightInput
 *                  shapeWidth          <-  userWidthInput
 *
 *
 *                  shapeVolume         <-  shapeBase * shapeHeight * shapeWidth
 *                  shapeSurfaceArea    <-  (2 * shapeBase * shapeWidth) + (2 * shapeBase * shapeHeight) +
 *                                          (2 * shapeHeight * shapeWidth)
 *
 *                  shapePerimeter      <-  (2 * shapeBase) + (2 * shapeWidth)
 *
 *
 *                  DISPLAY shapeVolume
 *                  DISPLAY shapeArea
 *                  DISPLAY shapePerimeter
 *
 *              'C' :
 *                  DISPLAY Cone
 *
 *                  shapeHeight         <-  userHeightInput
 *                  shapeRadius         <-  userRadiusInput
 *
 *
 *                  shapeVolume         <-  pi * ((shapeRadius * shapeRadius) * (shapeHeight / 3))
 *                  shapeSurfaceArea    <-  pi * shapeRadius * ( shapeRadius +
 *                                                               Math.sqrt((shapeHeight * shapeHeight) +
 *                                                                         (shapeRadius * shapeRadius)))
 *
 *                  DISPLAY shapeVolume
 *                  DISPLAY shapeSurfaceArea
 *
 *              END CASE
 *          ENDIF
 *          ENDIFs
 *
 *      PROMPT repeat
 *      GET repeat
 *
 *      WHILE ( repeat != 'N' AND 'n' )
 *      END DO
 *  END
 *
 *  @version 1.0.0  2019/1/15
 */
import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class akmalCode2
{
    //  Global file-wide input scanner declaration.
    private static DecimalFormat decimalFormat  =   new DecimalFormat(".###");

    private static Scanner scShapes             =   new Scanner(System.in);


    /*
     *  The basic user input that are repeated
     *  has been made into a function in order to avoid,
     *  longer and repeated code.
     *
     *  Improves future maintainability and implementation.
     */

    //  userBaseInput takes a char of side in-order to label
    //  multiple sides.
    private static double userBaseInput(char side)
    {
        double baseValue;

        System.out.print("Enter the base " + side + " : ");
        baseValue                       =   scShapes.nextDouble();

        return baseValue;
    }

    private static double userHeightInput()
    {
        double heightValue;

        System.out.print("Enter the height: ");
        heightValue                     =   scShapes.nextDouble();

        return heightValue;
    }

    private static double userWidthInput()
    {
        double widthValue;

        System.out.print("Enter the width: ");
        widthValue                      =   scShapes.nextDouble();

        return widthValue;
    }

    private static double userRadiusInput()
    {
        double radiusValue;

        System.out.print("Enter the radius: ");
        radiusValue                     =   scShapes.nextDouble();

        return radiusValue;
    }


    /*
     *  Main program body
     */
    public static void main(String args[])
    {
        //  Main function variable declaration and initialization.
        char repeat;
        char shapeCode;
        int userDimension;

        double shapeBase;
        double shapeHeight;
        double shapeWidth;
        double shapeRadius;

        //  Trapezium and Triangle base B, C, D
        double shapeBaseB;
        double shapeBaseC;
        double shapeBaseD;


        double shapePerimeter;
        double shapeVolume;
        double shapeSurfaceArea;
        double shapeArea;

        //  constant value variable
        double  pi                      =   3.142;


        //  initialization loop
        do
        {
            System.out.print("===============================================\n");
            System.out.print("\t\t\u001b[33mWelcome to the Shape calculator\u001b[0m\n");
            System.out.print("\t\t\t\tBy Akmal & Danish\n\n");
            System.out.print("Dimensional List :\n\n");
            System.out.print("\t\t1. \u001b[31;1m[2]2D\u001b[0m\t\t" + "2. \u001b[35;1m[3]3D\u001b[0m\n");
            System.out.print("===============================================\n");

            System.out.print("Which dimensions do you wish to calculate ? ");
            userDimension               =   scShapes.nextInt();

            /*
             *  Code committed by Danish Imran
             *  2D shapes list and formula.
             */
            if (userDimension   ==  2)
            {
                //  Display user prompt for 2D shapes
                System.out.print("\n\n\n===============================================\n");
                System.out.print("\t\t\u001b[34;1m2D shapes code List :\u001b[0m\n\n");
                System.out.print("1. \u001b[33;1m[A]Rectangle\u001b[0m\t\t");
                System.out.print("4. \u001b[36;1m[D]Triangle\u001b[0m\n");
                System.out.print("2. \u001b[31;1m[B]Square\u001b[0m\t\t");
                System.out.print("5. \u001b[30;1m[E]Circle\u001b[0m\n");
                System.out.print("3. \u001b[35;1m[C]Trapezium\u001b[0m\n");
                System.out.print("===============================================\n\n\n\n");


                System.out.print("Please enter a shape code from the list: ");
                shapeCode                       =   scShapes.next().charAt(0);

                switch(shapeCode)
                {
                    case 'A':

                        System.out.print("\n\nYou have chosen a \u001b[33;1mRectangle\u001b[0m\n");

                        //Area of Rectangle    =    Height * Base
                        //Perimeter            =    (2 * Base) + (2 * Height)

                        shapeHeight            =    userHeightInput();
                        shapeBase              =    userBaseInput(' ');

                        shapeArea              =    shapeHeight * shapeBase;

                        shapePerimeter         =    (2 * shapeBase) + (2 * shapeHeight);

                        System.out.print("\n\u001b[32;1mThe Area of Rectangle:\u001b[0m \t\t\t" +
                                                    decimalFormat.format(shapeArea) + "\u001b[33m cm\u00b2 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Perimeter of Rectangle:\u001b[0m \t" +
                                                    decimalFormat.format(shapePerimeter) + "\u001b[33m cm \u001b[0m");
                        break;

                    case 'D':
                        
                        System.out.print("\n\nYou have chosen \u001b[36;1mTriangle\u001b[0m\n");
                        
                        //Area of Triangle      =   1/2 * Base * Height
                        //Perimeter             =   shapeBaseA + shapeBaseB + shapeBaseC
                        
                        shapeBase               =   userBaseInput('A');
                        shapeBaseB              =   userBaseInput('B');
                        shapeBaseC              =   userBaseInput('C');
                        shapeHeight             =   userHeightInput();

                        
                        shapeArea               =   (0.5) * (shapeBase * shapeHeight);
                        
                        shapePerimeter          =   shapeBase + shapeBaseB + shapeBaseC;
                        
                        System.out.print("\n\u001b[32;1mThe Area of Triangle: \u001b[0m\t\t" +
                                                    decimalFormat.format(shapeArea) + "\u001b[33m cm\u00b2 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Perimeter of Triangle: \u001b[0m\t" +
                                                    decimalFormat.format(shapePerimeter) + "\u001b[33m cm \u001b[0m");
                        break;

                    case 'B':
                        
                        System.out.print("\n\nYou have chosen \u001b[31;1mSquare\u001b[0m\n");
                        
                        //Area of Square        =   Base * Height
                        //Perimeter             =   (2 * Base) + (2 * Height)
                        
                        shapeBase               =   userBaseInput(' ');

                        shapeArea               =   shapeBase * shapeBase;
                        
                        shapePerimeter          =   shapeBase * 4;
                        
                        System.out.print("\n\u001b[32;1mThe Area of Square: \u001b[0m\t\t" +
                                                    decimalFormat.format(shapeArea) + "\u001b[33m cm\u00b2 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Perimeter of Square: \u001b[0m\t" +
                                                    decimalFormat.format(shapePerimeter) + "\u001b[33m cm \u001b[0m");
                        break;

                    case 'E':
                        
                        System.out.print("\n\nYou have chosen \u001b[30;1mCircle\u001b[0m\n");
                        
                        //Area of Circle        =   pi * (Radius * Radius)
                        //Perimeter of Circle   =   2 * pi * Radius
                        
                        shapeRadius             =   userRadiusInput();
                        
                        shapeArea               =   pi * (shapeRadius * shapeRadius);
                        
                        shapePerimeter          =   2 * pi * shapeRadius;
                        
                        System.out.print("\n\u001b[32;1mThe Area of Circle: \u001b[0m\t\t" +
                                                    decimalFormat.format(shapeArea) + "\u001b[33m cm\u00b2 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Perimeter of Circle: \u001b[0m\t" +
                                                    decimalFormat.format(shapePerimeter) + "\u001b[33m cm \u001b[0m");
                        break;

                    case 'C':
                        
                        System.out.print("\n\nYou have chosen \u001b[35;1mTrapezium\u001b[0m\n");
                        
                        //Area of Trapezium     =   ((BaseA + BaseB) /2) * Height
                        //Perimeter             =   shapeBase + shapeBaseB + shapeBaseC + shapeHeight

                        shapeHeight             =   userHeightInput();
                        shapeBase               =   userBaseInput('A');
                        shapeBaseB              =   userBaseInput('B');
                        shapeBaseC              =   userBaseInput('C');
                        shapeBaseD              =   userBaseInput('D');


                        shapeArea               =   (( shapeBase + shapeBaseB ) /2 ) * shapeHeight;

                        shapePerimeter          =   shapeBase + shapeBaseB + shapeBaseC + shapeBaseD;

                        System.out.print("\n\u001b[32;1mThe Area of Trapezium: \u001b[0m\t\t\t" +
                                                    decimalFormat.format(shapeArea) + "\u001b[33m cm\u00b2 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Perimeter of Trapezium: \u001b[0m\t" +
                                                    decimalFormat.format(shapePerimeter) + "\u001b[33m cm \u001b[0m");
                        break;

                    default:
                        System.out.print("\n\u001b[31mYou have entered an invalid shape code");
                        break;
                }

            }

            /*
             *  Code committed by Akmal 'Aisy.
             *  3D shapes list and formula.
             */
            else if (userDimension    ==  3)
            {
                //  Display user prompt for 3D shapes
                System.out.print("\n\n===============================================\n");
                System.out.print("\t\t\t\u001b[34;1m3D shapes code List :\u001b[0m\n\n");
                System.out.print("1. \u001b[33;1m[A]Cylinder\u001b[0m\t\t");
                System.out.print("4. \u001b[36;1m[D]Pyramid\u001b[0m\n");
                System.out.print("2. \u001b[31;1m[B]Sphere\u001b[0m\t\t");
                System.out.print("5. \u001b[30;1m[E]Cuboid\u001b[0m\n");
                System.out.print("3. \u001b[35;1m[C]Cone\u001b[0m\n");
                System.out.print("===============================================\n\n");

                //  PROMPT the user for shape code and GET shape code
                System.out.print("Please enter a shape code from the list: ");
                shapeCode                   =   scShapes.next().charAt(0);

                switch(shapeCode)
                {
                    case 'A':

                        System.out.print("\n\nYou have chosen a Cylinder\n");

                        shapeHeight         =   userHeightInput();
                        shapeRadius         =   userRadiusInput();

                        shapeVolume         =   pi * ((shapeRadius * shapeRadius) * shapeHeight);

                        shapeSurfaceArea    =   (2 * pi * shapeRadius * shapeHeight) +
                                                (2 * pi * (shapeRadius * shapeRadius));

                        //  DISPLAY VOLUME AND SURFACE AREA
                        System.out.print("\n\u001b[32;1mThe volume of the Cylinder: \u001b[0m\t\t" +
                                                        decimalFormat.format(shapeVolume) + "\u001b[33m cm\u00b3 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Surface Area of the Cylinder: \u001b[0m\t" +
                                                        decimalFormat.format(shapeSurfaceArea) + "\u001b[33m cm\u00b3 \u001b[0m");

                        break;

                    case 'D':

                        System.out.print("\n\nYou have chosen a Pyramid\n");

                        shapeBase           =   userBaseInput(' ');
                        shapeHeight         =   userHeightInput();
                        shapeWidth          =   userWidthInput();

                        shapeVolume         =   (shapeBase * shapeWidth * shapeHeight) / 3;

                        //  Surface area of Pyramid : A = lw + (l * sqrt((w/2)^2 + h^2) + w * sqrt((1/2)^2 + h^2))
                        //
                        //  shapeSurfaceArea    <-  (shapeBase * shapeWidth) +
                        //                          (shapeBase * Math.sqrt(
                        //                                              (shapeWidth / 2) * (shapeWidth / 2)) +
                        //                                              (shapeHeight * shapeHeight))) +
                        //                          (shapeWidth * Math.sqrt(
                        //                                              ((0.5) * (0.5)) +
                        //                                              (shapeHeight * shapeHeight)))
                        //
                        shapeSurfaceArea    =   (shapeBase * shapeWidth) +
                                                (shapeBase * Math.sqrt(
                                                                ((shapeWidth / 2) * (shapeWidth / 2)) +
                                                                (shapeHeight * shapeHeight))) +
                                                (shapeWidth * Math.sqrt(
                                                                ((shapeBase / 2) * (shapeBase / 2)) +
                                                                (shapeHeight * shapeHeight)));

                        //  DISPLAY VOLUME AND SURFACE AREA
                        System.out.print("\n\u001b[32;1mThe volume of the Pyramid: \u001b[0m\t\t\t" +
                                                        decimalFormat.format(shapeVolume) +
                                                        "\u001b[33m cm\u00b3 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Surface Area of the Pyramid: \u001b[0m\t" +
                                                        decimalFormat.format(shapeSurfaceArea) +
                                                        "\u001b[33m cm\u00b3 \u001b[0m");
                        break;

                    case 'B':

                        System.out.print("\n\nYou have chosen a Sphere\n");

                        shapeRadius         =   userRadiusInput();

                        shapeVolume         =   1.333 * (pi * (shapeRadius * shapeRadius * shapeRadius));

                        shapeSurfaceArea    =   4 * (pi * (shapeRadius * shapeRadius));

                        //  DISPLAY VOLUME AND SURFACE AREA
                        System.out.print("\n\u001b[32;1mThe volume of the Sphere: \u001b[0m\t\t\t" +
                                                    decimalFormat.format(shapeVolume) +
                                                    "\u001b[33m cm\u00b3 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Surface Area of the Sphere: \u001b[0m\t" +
                                                    decimalFormat.format(shapeSurfaceArea) +
                                                    "\u001b[33m cm\u00b3 \u001b[0m");
                        break;

                    case 'E':

                        System.out.print("\n\nYou have chosen a Cuboid\n");
                        shapeBase           =   userBaseInput(' ');
                        shapeHeight         =   userHeightInput();
                        shapeWidth          =   userWidthInput();

                        //  Cuboid Formula Volume : V = bwh
                        //  Volume of Cuboid <- shapeBase * shapeWidth * shapeHeight
                        shapeVolume         =   shapeBase * shapeHeight * shapeWidth;


                        //  Cuboid Formula Surface Area : SA = (2bw) + (2bh) + (2hw)
                        //  Surface area of Cuboid <- (2 * shapeBase * shapeWidth) + (2 * shapeBase * shapeHeight) +
                        //                            (2 * shapeHeight * shapeWidth)
                        shapeSurfaceArea    =   (2 * shapeBase * shapeWidth) +
                                                (2 * shapeBase * shapeHeight) +
                                                (2 * shapeHeight * shapeWidth);

                        //  DISPLAY VOLUME AND SURFACE AREA
                        System.out.print("\n\u001b[32;1mThe volume of the Cuboid: \u001b[0m\t\t\t" +
                                                    decimalFormat.format(shapeVolume) +
                                                    " \u001b[33m cm\u00b3 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Surface Area of the Cuboid: \u001b[0m\t" +
                                                    decimalFormat.format(shapeSurfaceArea) +
                                                    "\u001b[33m cm\u00b3 \u001b[0m");

                        break;

                    case 'C':

                        System.out.print("\n\nYou have chosen a Cone\n");

                        shapeHeight         =   userHeightInput();
                        shapeRadius         =   userRadiusInput();

                        shapeVolume         =   pi * ((shapeRadius * shapeRadius) * (shapeHeight / 3));


                        //  Cone Formula Surface Area : SA = pi(R)(R + sqrt(H^2)+(R^2))
                        //  shapeSurfaceArea    <-  pi * shapeRadius * (shapeRadius +
                        //                                              Math.sqrt(shapeHeight * shapeHeight) +
                        //                                                       (shapeRadius * shapeRadius)
                        shapeSurfaceArea    =   pi * shapeRadius *
                                                (shapeRadius + Math.sqrt(
                                                                    (shapeHeight * shapeHeight) +
                                                                    (shapeRadius * shapeRadius))
                                                );

                        //  DISPLAY VOLUME AND SURFACE AREA
                        System.out.print("\n\u001b[32;1mThe volume of the Cone: \u001b[0m\t\t" +
                                                    decimalFormat.format(shapeVolume) +
                                                    "\u001b[33m cm\u00b3 \u001b[0m");

                        System.out.print("\n\u001b[32;1mThe Surface Area of the Cone: \u001b[0m\t" +
                                                    decimalFormat.format(shapeSurfaceArea) +
                                                    "\u001b[33m cm\u00b3 \u001b[0m");
                        break;

                    default:

                        System.out.print("\u001b[31mYou have entered an invalid shape code\u001b[0m");
                        break;
                }
            }

            else {
                System.out.print("\n\u001b[31mYou have entered an invalid dimension\u001b[0m");
            }

            System.out.print("\n\n\u001b[31mDo you wish to continue? [Y]/[N] \u001b[0m");
            repeat                      =   scShapes.next().charAt(0);

        } while ( repeat != 'N');
    }
}