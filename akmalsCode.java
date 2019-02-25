/*
 *  @(#) CalculateShapes.java
 *
 *  @author AKMAL 'AISY BIN RUDY (52052418001)
 *          DANISH IMRAN BIN MOHD ARIF ARCHI (52052418005)
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
 *              CASE OF shapeCode
 *              'a' :
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
 *             'b' :
 *                 DISPLAY Triangle
 *                 PROMPT shapeBase
 *                 GET shapeBase
 *
 *                 PROMPT shapeHeight
 *                 GET shapeHeight
 *
 *                 shapeArea       <-
 *
 *
 *
 *          ELSE IF userDimension == 3
 *              DISPLAY "===================================="
 *              DISPLAY "3d shape code list"
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
 *              'b' :
 *                  DISPLAY Pyramid
 *
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
 *              'e' :
 *                  DISPLAY Cone
 *
 *                  PROMPT shapeHeight
 *                  GET shapeHeight
 *
 *                  PROMPT shapeRadius
 *                  GET shapeRadius
 *
 *                  shapeVolume         <-  pi * ((shapeRadius * shapeRadius) * (shapeHeight / 3))
 *                  shapeSurfaceArea    <-  pi * shapeRadius * ( shapeRadius +
 *                                                               Math.sqrt((shapeHeight * shapeHeight) +
 *                                                                         (shapeRadius * shapeRadius)))
 *              END CASE
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
import java.lang.Math;

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

        System.out.print("Enter the base : ");
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

        //  Trapezium Base B
        double shapeBaseB;

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
                //  Display user prompt for 2D shapes
                System.out.print("\n\n\n===============================================\n");
                System.out.print("\t\t2D shapes code List :\n");
                System.out.print("a. Rectangle\t\t");
                System.out.print("b. Triangle\n");
                System.out.print("c. Square\t\t\t");
                System.out.print("d. Circle\n");
                System.out.print("e. Trapezium\n");
                System.out.print("===============================================\n\n\n\n");


                System.out.print("Please enter a shape code from the list: ");
                shapeCode                       =   scShapes.next().charAt(0);

                switch(shapeCode)
                {
                    case 'a':

                        System.out.print("\n\nYou have chosen a Rectangle\n");

                        //Area of Rectangle    = Height * Base
                        //Perimeter            = (2 * Base) + (2 * Height)        

                        shapeHeight            = userHeightInput();
                        shapeBase              = userBaseInput();

                        shapeArea              = shapeHeight * shapeBase;

                        shapePerimeter         = (2 * shapeBase) + (2 * shapeHeight);

                        System.out.print("\nThe Area of Rectangle: " + shapeArea + "cm^2");
                        System.out.print("\nThe Perimeter of Rectangle: " + shapePerimeter + "cm");
                        break;

                    case 'b':
                        
                        System.out.print("\n\nYou have chosen Triangle\n");
                        
                        //Area of Triangle      = 1/2 * Base * Height
                        //Perimeter             = (2 * Base) * Height
                        
                        shapeBase               = userBaseInput();
                        shapeHeight             = userHeightInput();
                        
                        shapeArea               = (0.5) * (shapeBase * shapeHeight);
                        
                        shapePerimeter          = (2 * shapeBase) + shapeHeight;
                        
                        System.out.print("\nThe Area of Triangle: " + shapeArea + "cm^2");
                        System.out.print("\nThe Perimeter of Triangle: " + shapePerimeter + "cm");
                        break;

                    case 'c':
                        
                        System.out.print("\n\nYou have chosen Square\n");
                        
                        //Area of Square        = Base * Height
                        //Perimeter             = (2 * Base) + (2 * Height)
                        
                        shapeBase               = userBaseInput();
                        shapeHeight             = userHeightInput();
                        
                        shapeArea               = shapeBase * shapeHeight;
                        
                        shapePerimeter          = (2 * shapeBase) + (2 * shapeHeight);
                        
                        System.out.print("\nThe Area of Triange: " + shapeArea + "cm^2");
                        System.out.print("\nThe Perimeter of Triangle: " + shapePerimeter + "cm");
                        break;

                    case 'd':
                        
                        System.out.print("\n\nYou have chosen Circle\n");
                        
                        //Area of Circle         = pi * (Radius * Radius)
                        //Perimeter of Circle    = 2 * pi * Radius
                        
                        shapeRadius              = userRadiusInput();
                        
                        shapeArea                = pi * (shapeRadius * shapeRadius);
                        
                        shapePerimeter           = 2 * pi * shapeRadius;
                        
                        System.out.print("\nThe Area of Circle: " + shapeArea + "cm^2");
                        System.out.print("\nThe Perimeter of Cricle: " + shapePerimeter + "cm");
                        break;

                    case 'e':
                        
                        System.out.print("\n\nYou have chosen Trapezium\n");
                        
                        //Area of Trapezium      = ((BaseA + BaseB) /2) * Height
                        //Perimeter              = (2 * Base) + (2 * Height)

                        shapeHeight              = userHeightInput();
                        shapeBase                = userBaseInput();
                        shapeBaseB               = userBaseInput();

                        shapeArea                = (( shapeBase + shapeBaseB ) /2 ) * shapeHeight;

                        shapePerimeter           = (2 * shapeBase) + (2 * shapeHeight);

                        System.out.print("\nThe Area of Trapezium: " + shapeArea + " cm^2");
                        System.out.print("\nThe Perimeter of Trapezium: " + shapePerimeter + " cm^2");
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
                System.out.print("3D shapes code List :\n");
                System.out.print("a. Cylinder\t\t");
                System.out.print("b. Pyramid\n");
                System.out.print("c. Sphere\t\t");
                System.out.print("d. Cuboid\n");
                System.out.print("e. Cone\n");
                System.out.print("===============================================\n\n");

                //  PROMPT the user for shape code and GET shape code
                System.out.print("Please enter a shape code from the list: ");
                shapeCode                   =   scShapes.next().charAt(0);

                switch(shapeCode)
                {
                    case 'a':

                        System.out.print("\n\nYou have chosen a Cylinder\n");

                        shapeHeight         =   userHeightInput();
                        shapeRadius         =   userRadiusInput();

                        shapeVolume         =   pi * ((shapeRadius * shapeRadius) * shapeHeight);

                        shapeSurfaceArea    =   (2 * pi * shapeRadius * shapeHeight) +
                                                (2 * pi * (shapeRadius * shapeRadius));

                        shapePerimeter      =   2 * ( pi * ((shapeRadius * 2) + shapeHeight));

                        System.out.print("\nThe volume of the Cylinder: " + shapeVolume + " cm^3");
                        System.out.print("\nThe Surface Area of the Cylinder: " + shapeSurfaceArea + " cm^3");
                        System.out.print("\n The Circumference of the Cylinder: " + shapePerimeter + " cm");

                        break;

                    case 'b':

                        System.out.print("\n\nYou have chosen a Pyramid\n");

                        shapeBase           =   userBaseInput();
                        shapeHeight         =   userHeightInput();
                        shapeWidth          =   userWidthInput();

                        shapeVolume         =   (shapeBase * shapeWidth * shapeHeight) / 3;

                        //  Surface area of Pyramid : A = lw + (l * sqrt((w/2)^2 + h^2) + w * sqrt((1/2)^2 + h^2))
                        shapeSurfaceArea    =   (shapeBase * shapeWidth) +
                                                (shapeBase * Math.sqrt(
                                                                ((shapeWidth / 2) * (shapeWidth / 2)) +
                                                                (shapeHeight * shapeHeight))) +
                                                (shapeWidth * Math.sqrt(
                                                                ((0.5) * (0.5)) +
                                                                (shapeHeight * shapeHeight)));

                        System.out.print("\nThe volume of the Pyramid: \t\t\t" + shapeVolume + " cm^3");
                        System.out.print("\nThe Surface Area of the Pyramid: \t" + shapeSurfaceArea + " cm^3");
                        break;

                    case 'c':

                        System.out.print("\n\nYou have chosen a Sphere\n");

                        shapeRadius         =   userRadiusInput();

                        shapeVolume         =   1.333 * (pi * (shapeRadius * shapeRadius * shapeRadius));

                        shapeSurfaceArea    =   4 * (pi * (shapeRadius * shapeRadius));

                        System.out.print("\nThe volume of the Sphere: " + shapeVolume + " cm^3");
                        System.out.print("\nThe Surface Area of the Sphere: " + shapeSurfaceArea + " cm^3");
                        break;

                    case 'd':

                        //  volume of cube  =   Base * width * height
                        System.out.print("\n\nYou have chosen a Cuboid\n");
                        shapeBase           =   userBaseInput();
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

                        //  DISPLAY shapeVolume and shapeSurfaceArea
                        System.out.print("\nThe volume of the Cuboid: \t\t\t" + shapeVolume + " cm^3");
                        System.out.print("\nThe Surface Area of the Cuboid: \t" + shapeSurfaceArea + " cm^3");

                        break;

                    case 'e':

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

                        //  DISPLAY shapeVolume and shapeSurfaceArea
                        System.out.print("\nThe volume of the Cone: \t\t" + shapeVolume + " cm^3");
                        System.out.print("\nThe Surface Area of the Cone: \t" + shapeSurfaceArea + " cm^3");
                        break;

                    default:

                        System.out.print("You have entered an invalid shape code");
                        break;
                }
            }

            else {
                System.out.print("\nYou have entered an invalid dimension");
            }

            System.out.print("\n\nDo you wish to continue? y/n ");
            repeat                      =   scShapes.next().charAt(0);

        } while ( repeat != 'n');
    }
}