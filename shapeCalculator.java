/** Author: Syahir 52052418006
 *          Amirul 52052418004
 * 
 *  Date Created: 09022019
 * 
 ********************************************************************************************
 *                                                                                          *
 *                                                                                          *
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
 *      ShapeCalculator
 * 
 *  
 * 
 */

 import java.util.*;
 import java.lang.Math.*;
import java.text.*;

 public class shapeCalculator{

    static Scanner sc = new Scanner (System.in);
    static DecimalFormat numberFormat = new DecimalFormat("#.000");

    public shapeCalculator(){}

    //Prompt user for height and gave output
    static double heightInput(){

        double heightOutput;

        System.out.print("\nInsert height: ");
        return heightOutput = sc.nextDouble();
    }



    //Prompt user for width and gave output
    static double widthInput(){

        double widthOutput;

        System.out.print("\nInsert width: ");
        return widthOutput = sc.nextDouble();
    }



    //Prompt user for length and gave output
    static double lengthInput(){

        double lengthOutput;

        System.out.print("\nInsert length: ");
        return lengthOutput = sc.nextDouble();
    }


    
    //Prompt user for radius and gave output
    static double radiusInput(){

        double radiusOutput;

        System.out.print("\nInsert radius: ");
        return radiusOutput = sc.nextDouble();
    }


    //Prompt user for top value and gave output
    static double topInput(){

        double topOutput;

        System.out.print("\nInsert top value: ");
        return topOutput = sc.nextDouble();
    }


    
    //Prompt user for base value and gave output
    static double baseInput(){

        double baseOutput;

        System.out.print("\nInsert base value: ");
        return baseOutput = sc.nextDouble();
    }


    //Prompt user selected shape type
    static void displayShape(String shapetype){

        System.out.print("\nYou have selected " + shapetype);
    }



    //Prompt user for end result for 2D shape
    static void displayShapeEnd(char render, String shapetype, double surfaceAreaOutput, double volParOutput){


        if(render == '2'){
            System.out.print("the " + shapetype + " area is " + numberFormat.format(surfaceAreaOutput));
            System.out.print("\nthe " + shapetype + " parameter is " + numberFormat.format(volParOutput));
        }
        
        else if(render == '3'){
            System.out.print("The " + shapetype + " volume is " + numberFormat.format(volParOutput));
            System.out.print("\nThe " + shapetype + " surface area is " + numberFormat.format(surfaceAreaOutput));

        }
    }
    
    
    public static void main (String args []){

        //declaration
        char render;
        int shapeSelector;
        boolean errorMessage = true;
        char choice = 'y';

        //2D declaration
        double area;
        double parameter;

        //3D declaration
        double volume;
        double surfaceArea;

        System.out.print("\n\t==================================");
        System.out.print("\n\t|   Welcome to Shape Calculator\t |");
        System.out.print("\n\t|Made possible by Syahir & Amirul|");
        System.out.print("\n\t==================================");

        //start loop
        do{
            
            System.out.print("\n\nWould you like to do a calculation on 2D or 3D object?: ");
            render = sc.next().charAt(0);

            if(render == '2'){

                /************ Main menu for 2D Shape ************/
                System.out.print("\n2D shape has been selected!");
                System.out.print("\n\n-----------------------------");
                System.out.print("\nPlease select your shape:");
                System.out.print("\n1. Rectangle\t4. Circle");
                System.out.print("\n2. Square\t5. Trapezium");
                System.out.print("\n3. Triangle");
                System.out.print("\n-----------------------------");
                System.out.print("\n\nEnter the shape number: ");
                shapeSelector = sc.nextInt();

                switch(shapeSelector){

                    case 1: 
                        displayShape("Rectangle");
                        double rectangleWidth = widthInput();
                        double rectangleHeight = heightInput();

                        area = rectangleHeight * rectangleWidth;
                        parameter = Math.pow(rectangleHeight, 2) + Math.pow(rectangleWidth, 2);

                        displayShapeEnd(render,"Rectangle", area, parameter);
                    break;



                    case 2: 
                        displayShape("Square");
                        double squareWidth = widthInput();
                        double squareHeight = heightInput();

                        area = squareHeight * squareWidth;
                        parameter = Math.pow(squareHeight, 2) + Math.pow(squareWidth, 2);

                        displayShapeEnd(render, "Square", area, parameter);
                    break;



                    case 3: 
                        displayShape("Triangle");
                        System.out.print("First side of the triangle: ");
                        double triangleS1= sc.nextDouble();
                        System.out.print("Second side of the triangle: ");
                        double triangleS2= sc.nextDouble();
                        System.out.print("Third side of the triangle: ");
                         double triangleS3 = sc.nextDouble();

                        area = (triangleS1 + triangleS2 + triangleS3) /2;
                        parameter = triangleS1 + triangleS2 + triangleS3;

                        displayShapeEnd(render, "Triangle", area, parameter);
                    break;



                    case 4: 
                        displayShape("Circle");
                        double circleRadius = radiusInput();

                        area = Math.PI * Math.pow(circleRadius, 2);
                        parameter = 2 * Math.PI * circleRadius ;

                        displayShapeEnd(render, "Circle", area, parameter);
                    break;



                    case 5: 
                        displayShape("Trapezium");

                        System.out.print("Base value: ");
                        double trapeziumTop = sc.nextDouble();

                        System.out.print("Top value: ");
                        double trapeziumBase = sc.nextDouble();

                        System.out.print("One Side value: ");
                        double trapeziumSide1 = sc.nextDouble();

                        System.out.print("Another Side value: ");
                        double trapeziumSide2 = sc.nextDouble();

                        System.out.print("Height value: ");
                        double trapeziumHeight = sc.nextDouble();


                        area = (trapeziumTop + trapeziumBase) * trapeziumHeight /2 ;
                        parameter = trapeziumTop + trapeziumBase + trapeziumSide1 + trapeziumSide2;

                        displayShapeEnd(render, "Trapezium", area, parameter);
                    break;
                }


            }  


            else if(render == '3'){

                /********* Main menu for 3D shape ***********/
                System.out.print("3D shape has been selected!");
                System.out.print("\n\n-----------------------------");
                System.out.print("\nPlease select your shape");
                System.out.print("\n1. Cylinder");
                System.out.print("\n2. Pyramid");
                System.out.print("\n3. Sphere");
                System.out.print("\n4. Cuboid");
                System.out.print("\n5. Cone");
                System.out.print("\n-----------------------------");
                System.out.print("\nEnter the shape number: ");
                shapeSelector = sc.nextInt();

                switch(shapeSelector){

                    case 1: 
                        displayShape("Cylinder");
                        double cylinderHeight = heightInput();
                        double cylinderRadius = radiusInput();

                        volume = Math.PI * ((cylinderRadius * cylinderRadius) * cylinderHeight);
                        surfaceArea = (2 * Math.PI * cylinderRadius * cylinderHeight) + (2 * Math.PI * cylinderRadius * cylinderRadius);

                        displayShapeEnd(render, "Cylinder", surfaceArea, volume);
                    break;
                    


                    case 2: 
                        displayShape("Pyramid");
                        double pyramidWidth = widthInput();
                        double pyramidHeight = heightInput();
                        double pyramidBase = baseInput();

                        volume = (pyramidBase * pyramidWidth * pyramidHeight) / 3;
                        surfaceArea = (pyramidBase * pyramidWidth) + (pyramidBase * Math.sqrt(((pyramidWidth / 2) * (pyramidWidth / 2)) + (pyramidHeight * pyramidHeight))) + (pyramidWidth * Math.sqrt(((1 / 2) * (1 / 2)) + (pyramidHeight * pyramidHeight)));

                        displayShapeEnd(render, "Pyramid", surfaceArea, volume);
                    break;


                    
                    case 3: 
                        displayShape("Sphere");
                        double sphereRadius = radiusInput();

                        volume = 4 / 3 * (Math.PI * (sphereRadius * sphereRadius * sphereRadius));
                        surfaceArea = 4 * (Math.PI * (sphereRadius * sphereRadius));

                        displayShapeEnd(render, "Sphere", surfaceArea, volume);
                    break;



                    case 4: 
                        displayShape("Cuboid");
                        double cuboidBase = radiusInput();
                        double cuboidHeight = heightInput();
                        double cuboidWidth = widthInput();

                        volume = cuboidBase * cuboidHeight * cuboidWidth;
                        surfaceArea = (2 * cuboidBase * cuboidWidth) + (2 * cuboidBase * cuboidHeight) + (2 * cuboidHeight * cuboidWidth);

                        displayShapeEnd(render, "Cuboid", surfaceArea, volume);
                    break;



                    case 5: 
                        displayShape("Cone");
                        double coneRadius = radiusInput();
                        double coneHeight = heightInput();

                        volume = Math.PI * ((coneRadius * coneRadius) * (coneHeight / 3));
                        surfaceArea = Math.PI * coneRadius * (coneRadius + Math.sqrt((coneHeight * coneHeight) + (coneRadius * coneRadius)));

                        displayShapeEnd(render, "Cone", surfaceArea, volume);
                    break;
                }


            }

            
            while(errorMessage){

                System.out.print("\nDo you wish to continue? [Y or N]: ");
                choice = sc.next().charAt(0);
                if (choice=='y' || choice =='Y' ||choice=='n' || choice =='N')
                errorMessage = false;

                else {
                System.out.print("Invalid Input!");
                errorMessage = true;}
            }

        }while(choice == 'Y' || choice == 'y');

        System.out.print("Thank you for using Shape Calculator, have a nice day!");


    }

}