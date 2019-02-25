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
 import java.lang.Math.*;


 public class MiniProject{

    static Scanner sc = new Scanner (System.in);

    public MiniProject(){}


    //math equation methods
    static double sqd(double value){   
        
        return value * value;
    }



    static double sqrt(int value){
        double t;
     
        double sqrtvalue = value / 2;
     
        do {
            t = sqrtvalue;
            sqrtvalue = (t + (value / t)) / 2;
        } while ((t - sqrtvalue) != 0);
     
        return sqrtvalue;
    }



    //reuseable height method
    static double heightInput(){

        double heightOutput;

        System.out.print("Insert height: ");
        return heightOutput = sc.nextDouble();
    }



    //reuseable width method
    static double widthInput(){

        double widthOutput;

        System.out.print("\nInsert width: ");
        return widthOutput = sc.nextDouble();
    }



    //reuseable length method
    static double lengthInput(){

        double lengthOutput;

        System.out.print("\nInsert length: ");
        return lengthOutput = sc.nextDouble();
    }


    
    static double radiusInput(){

        double radiusOutput;

        System.out.print("\nInsert radius: ");
        return radiusOutput = sc.nextDouble();
    }



    static double topInput(){

        double topOutput;

        System.out.print("\nInsert top value: ");
        return topOutput = sc.nextDouble();
    }



    static double baseInput(){

        double baseOutput;

        System.out.print("\nInsert base value: ");
        return baseOutput = sc.nextDouble();
    }



    static void displayShape(String shapetype){

        System.out.print("\nYou have selected " + shapetype);
    }



    ////reuseable display at the end method
    static void displayShapeEnd2D(String shapetype, double areaInput, double parameterInput){

        System.out.print("the " + shapetype + " area is " + areaInput);
        System.out.print("\nthe " + shapetype + " parameter is " + parameterInput); 
    }



    ////reuseable display at the end method
    static void displayShapeEnd3D(String shapetype, double volumeInput, double surfaceAreaInput){

        System.out.print("the " + shapetype + " volume is " + volumeInput);
        System.out.print("\nthe " + shapetype + " surface area is " + surfaceAreaInput);
    } 
    
    

    public static void main (String args []){
        //declairation
        char render;
        int shapeSelector;
        boolean loop = true;
        char choice = 'y';

        //2D declairation
        double area;
        double parameter;

        //3D declairation
        double volume;
        double surfaceArea;


        do{

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

                case 1: displayShape("Rectangle");
                    double rectangleWidth = widthInput();
                        double rectangleHeight = heightInput();

                    area = rectangleHeight * rectangleWidth;
                    parameter = sqd(rectangleHeight)+sqd(rectangleWidth);

                    displayShapeEnd2D("Rectangle", area, parameter);
                          


                break;
                case 2: displayShape("Square");
                    double squareWidth = widthInput();
                    double squareHeight = heightInput();

                    area = squareHeight * squareWidth;
                    parameter = sqd(squareHeight)+sqd(squareWidth);

                    displayShapeEnd2D("Square", area, parameter);



                break;
                case 3: displayShape("Triangle");
                    double triangleLength = lengthInput();
                    double triangleHeight = heightInput();

                    area = ((triangleLength * triangleHeight)/2);
                    parameter = 0;

                    displayShapeEnd2D("Triangle", area, parameter);



                break;
                case 4: displayShape("Circle");
                    double circleRadius = radiusInput();

                    area = Math.PI * circleRadius;
                    parameter = 0;

                    displayShapeEnd2D("Circle", area, parameter);



                break;
                case 5: displayShape("Trapezium");
                    double trapeziumTop = topInput();
                    double trapeziumBase = baseInput();
                    double trapeziumHeight = heightInput();

                    area = (((trapeziumTop+trapeziumBase)/2)*trapeziumHeight);
                    parameter = 0;

                    displayShapeEnd2D("Trapezium", area, parameter);



                break;
                }


        }  


        else if(render == '3'){

            System.out.print("You have selected 3D shape");
            System.out.print("\nPlease select your shape");
            System.out.print("\n1. Cylinder");
            System.out.print("\n2. Pyramid");
            System.out.print("\n3. Sphere");
            System.out.print("\n4. Cuboid");
            System.out.print("\n5. Cone");
            System.out.print("\nEnter the shape number: ");
            shapeSelector = sc.nextInt();

                switch(shapeSelector){

                    case 1: displayShape("Cylinder");
                        double cylinderHeight = heightInput();
                        double cylinderRadius = radiusInput();

                        volume = Math.PI * ((cylinderRadius * cylinderRadius) * cylinderHeight);
                        surfaceArea = (2 * Math.PI * cylinderRadius * cylinderHeight) + (2 * Math.PI * (cylinderRadius * cylinderRadius));
                        parameter =  2 * ( Math.PI * ((cylinderRadius * 2) + cylinderHeight));

                        displayShapeEnd3D("Cylinder", surfaceArea,parameter);
                          


                    break;
                    case 2: displayShape("Pyramid");
                        double pyramidWidth = widthInput();
                        double pyramidHeight = heightInput();
                        double pyramidBase = baseInput();

                        volume = (pyramidBase * pyramidWidth * pyramidHeight) / 3;
                        surfaceArea = (pyramidBase * pyramidWidth) + (pyramidBase * Math.sqrt(((pyramidWidth / 2) * (pyramidWidth / 2)) + (pyramidHeight * pyramidHeight))) + (pyramidWidth * Math.sqrt(((1 / 2) * (1 / 2)) + (pyramidHeight * pyramidHeight)));

                        displayShapeEnd3D("Pyramid", surfaceArea, volume);



                    break;
                    case 3: displayShape("Sphere");
                        double sphereRadius = radiusInput();

                        volume = 4 / 3 * (Math.PI * (sphereRadius * sphereRadius * sphereRadius));
                        surfaceArea = 4 * (Math.PI * (sphereRadius * sphereRadius));

                        displayShapeEnd3D("Sphere", surfaceArea, volume);



                    break;
                    case 4: displayShape("Cuboid");
                        double cuboidBase = radiusInput();
                        double cuboidHeight = heightInput();
                        double cuboidWidth = widthInput();

                        surfaceArea = (2 * cuboidBase * cuboidWidth) + (2 * cuboidBase * cuboidHeight) + (2 * cuboidHeight * cuboidWidth);

                        displayShapeEnd3D("Cuboid", surfaceArea, 0);

                    break;
                    case 5: displayShape("Cone");
                        double coneRadius = radiusInput();
                        double coneHeight = heightInput();

                        area = Math.PI * coneRadius * (coneRadius + Math.sqrt((coneHeight * coneHeight) + (coneRadius * coneRadius)));
                        parameter = 0;

                        displayShapeEnd3D("Cone", area, parameter);



                    break;
                    }


                }



                while(loop){

                System.out.print("\nDo you wish to continue? [Y or N]: ");
                choice = sc.next().charAt(0);

                if (choice=='y' || choice =='Y' ||choice=='n' || choice =='N')
                    loop = false;


                else{
                    System.out.print("Invalid input");
                    loop = true;
                }


                }

        }while(choice != 'N' || choice != 'n');


    }

 }