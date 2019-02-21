/** Author: Syahir 52052418006
 *          Amirul 52052418004
 * 
 *  Date Created: 09022019
 * 
 ********************************************************************************************
 * Design and code a program to develop a Geometric Calculator.                             *
 * The calculator will display certain geometric object’s volume, area and perimeter.       *
 *                                                                                          *
 * Geometric object that will involved is                                                   *
 * i.	2D – Rectangle, Square, Triangle, Circle, Trapezium                                 *
 * ii.	3D – Cylinder, Pyramid, Sphere, Cuboid, Cone                                        *
 *                                                                                          *
 *                                                                                          *
 ********************************************************************************************
 *
 * MiniProject
 * 
 * Prompt user for render
 * Get render
 * 
 * IF render == 1 THEN
 *          Display selected 2D
 *          Prompt user for shape
 *          Get shape
 *          CASE OF shape
 *              1: Display selected rectangle
 *                  Prompt user for width
 *                  Get width
 *                  Prompt user for height
 *                  Get height
 *                  area = legth * width
 *                  perimeter = (length * length)+(width * width)
 *                  
 * 
 *              2: Display selected square
 *                  Prompt user for width
 *                  Get width
 *                  area = width * width
 *                  perimeter = width * width * width * width                 
 * 
 *              3: Display selected triangle
 *                  Prompt user for shapet
 *                  Get shapet
 *                  IF triangleShape = 1 THEN
 *                      Display selected triangle
 *                      Prompt user for height
 *                      Get height
 *                      Prompt user for base
 *                      Get base
 *                      Prompt user for cSide
 *                      Get cSide
 *                      area = 1/2*(base*height)
 *                      perimeter = base + height + cside
 * 
 *                  ELSE IF triangleShape = 0 THEN
 *                      Display selected equilateralTriangle
 *                      Prompt user for width
 *                      Get width
 *                      Prompt user for height
 *                      Get height
 *                      area = legth * width
 *                      perimeter = (length * length)+(width * width)
 * 
 *                  ELSE
 *                      Display invalid input
 *                  END IF
 * 
 * 
 *              4: Display selected circle
 *                  Prompt user for radius
 *                  Get radius
 *                  area = 
 *                  perimeter = 3.142
 * 
 *              5: Display selected trapezium
 *                  Prompt user for width
 *                  Get width
 *                  Prompt user for height
 *                  Get height
 *                  area = legth * width
 *                  perimeter = (length * length)+(width * width)
 * 
 *              END CASE
 * ELSE IF render == 0 THEN
 *          Display Selected 3D
 *          Prompt user for shape
 *          Get shape
 *          CASE OF shape
 *              1: Display Selected cylinder
 * 
 *              2: Display Selected pyramid
 * 
 *              3: Display Selected sphere
 * 
 *              4: Display Selected cuboid
 * 
 *              5: Display Selected cone
 * 
 *              END CASE
 * ELSE
 *          Display incorrect input
 * END IF
 * 
 * 
 * 
 */

 import java.util.*;
 public class MiniProject{

    static Scanner sc = new Scanner (System.in);

    public MiniProject(){}


    //math equation methods
    static double sqd(double value){   
        
        return value*value;
    }

    static double sqrt(int value) {
        double t;
     
        double sqrtvalue = value / 2;
     
        do {
            t = sqrtvalue;
            sqrtvalue = (t + (value / t)) / 2;
        } while ((t - sqrtvalue) != 0);
     
        return sqrtvalue;
    }

    //reuseable variable methods
    static double height(){
        double height;
        System.out.print("Insert height: ");
        return height = sc.nextDouble();
    }

    static double width(){
        double width;
        System.out.print("Insert width: ");
        return width = sc.nextDouble();
    }

    static double length(){
        double length;
        System.out.print("Insert length: ");
        return length = sc.nextDouble();
    }

    //shape methods
    static void rectangle(double height, double width){
        double area;
        double parameter;

        area = height * width;
        parameter = sqd(height)+sqd(width);

        System.out.print("the rectangle area is "+area);
        System.out.print("\nthe rectangle parameter is "+parameter);  
    }

    static void square(double height){
        double area;
        double parameter;

        area = height * height;
        parameter = sqd(height)+sqd(height);

        System.out.print("the square area is "+area);
        System.out.print("\nthe square parameter is "+parameter);
    }

    public static void main (String args []){
        //declairation
        int shapeSelector;
        char loop;

        Scanner sc = new Scanner (System.in);

        do{
        System.out.print("Welcome to 2D or 3D Calculator!");
        System.out.print("\n2D options:\t\t3D options:");
        System.out.print("\n\n1. Rectangle\t\t6. Cylinder");
        System.out.print("\n2. Square\t\t7. Pyramid");
        System.out.print("\n3. Triangle\t\t8. Sphere");
        System.out.print("\n4. Circle\t\t9. Cuboid");
        System.out.print("\n5. Trapezium\t\t10. Cone\n\n");
        System.out.print("\nTo select a shape, please insert the number for the corresponding shape: ");
        shapeSelector = sc.nextInt();
        
        switch (shapeSelector){

            case 1: System.out.print("You have selected a rectangle.\n");
                    double recheight = height();
                    double recwidth = width();
                    rectangle(recheight, recwidth);

            break;
            case 2: System.out.print("You have selected a square.\n");
                    double squareheight = height();
                    square(squareheight);

            break;
            case 3: System.out.print("You have selected a triangle.\n");
                System.out.print(sqrt(900));
            break;
            case 4: System.out.print("You have selected a circle.\n");
            break;
            case 5: System.out.print("You have selected a trapezium.\n");
            break;
            case 6:
            break;
            case 7:
            break;
            case 8:
            break;
            case 9:
            break;
            case 10:
            break;
        }
        System.out.print("\nWould you like to try again? [Y/N]");
        loop = sc.next().charAt(0);        
        }while (loop !='N');

    }

 }