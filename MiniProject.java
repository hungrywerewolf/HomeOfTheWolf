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
        System.out.print("\nInsert width: ");
        return width = sc.nextDouble();
    }

    static double length(){
        double length;
        System.out.print("\nInsert length: ");
        return length = sc.nextDouble();
    }

    static void displayShape(String shapetype){
        System.out.print("\nYou have selected "+shapetype);
    }

    static void displayShapeEnd(String shapetype, double area, double parameter){
        System.out.print("the "+shapetype+" area is "+area);
        System.out.print("\nthe "+shapetype+" parameter is "+parameter); 
    }

    public static void main (String args []){
        //declairation
        char render;
        int shapeSelector;
        double area;
        double parameter;
        String shapetype = "null";

        Scanner sc = new Scanner (System.in);

        System.out.print("Would you like to do a calculation on 2D or 3D object?: ");
        render = sc.next().charAt(0);

        if(render == '2'){
            System.out.print("You have selected 2D type");
            System.out.print("\nPlease select your shape");
            System.out.print("\n1. Rectangle");
            System.out.print("\n2. Square");
            System.out.print("\n3. Triangle");
            System.out.print("\n4. Circle");
            System.out.print("\n5. Trapezium");
            System.out.print("\nEnter the shape number: ");
            shapeSelector = sc.nextInt();

                switch(shapeSelector){
                    case 1: shapetype = "Rectangle";
                            displayShape(shapetype);
                            double rectangleWidth = width();
                            double rectangleHeight = height();

                            area = rectangleHeight * rectangleWidth;
                            parameter = sqd(rectangleHeight)+sqd(rectangleWidth);

                            displayShapeEnd(shapetype, area, parameter);
                          
                    break;
                    case 2: displayShape("Square");
                    break;
                    case 3: displayShape("Triangle");
                    break;
                    case 4: displayShape("Circle");
                    break;
                    case 5: displayShape("Trapezium");
                    break;
                }


        }

        else if(render == '3'){
            System.out.print("You have selected 3D shape");
        }

a
    }

 }