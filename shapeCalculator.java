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
 * 
 *  heightInput
 *      PROMPT user for heightValue
 *      GET heightValue
 *      return heightValue
 *  END
 * 
 * 
 *  widthInput
 *      PROMPT user for widthValue
 *      GET widthValue
 *      return heightValue
 *  END
 * 
 * 
 *  lengthInput
 *      PROMPT user for lengthValue
 *      GET lengthValue
 *      return lengthValue
 *  END
 *
 * 
 *  radiusInput
 *      PROMPT user for radiusValue
 *      GET radiusValue
 *      return radiusValue
 *  END
 * 
 * 
 *  topInput
 *      PROMPT user for topValue
 *      GET topValue
 *      return topValue
 *  END
 * 
 * 
 *  baseInput
 *      PROMPT user for baseValue
 *      GET baseValue
 *      return baseValue
 *  END
 * 
 * 
 *  sideInput
 *      PROMPT user for sideValue
 *      GET sideValue
 *      return sideValue
 *  END
 * 
 * 
 *  side2Input
 *      PROMPT user for side2Value
 *      GET side2Value
 *      return side2Value
 *  END
 * 
 * 
 *  triangleSide
 *      IF sideSelector == 1 THEN
 *          PROMPT side1Triangle
 *          GET side1Triangle
 * 
 *      ELSE IF sideSelector == 1 THEN
 *          PROMPT side2Triangle
 *          GET side1Triangle
 * 
 *      ELSE IF sideSelector == 1 THEN
 *          PROMPT side3Triangle
 *          GET side1Triangle
 *      END IF
 *      END IF
 *      END IF
 *  END
 * 
 * 
 *  displayShape
 *      DISPLAY shape
 *  END
 * 
 * 
 *  displayShapeEnd
 *      IF render = 2 THEN
 *          DISPLAY shapeType and areaValue
 *          DISPLAY shapeType and perimeterValue
 * 
 *      ELSE IF render = 3 THEN
 *          DISPLAY shapeType and VolumeValue
 *          DISPLAY shapeType and surfaceAreaValue
 *      END IF
 *      ENF IF
 *  END
 * 
 * 
 *  shapeCalculator
 *  DISPLAY startPage
 *  
 *  DO
 *      PROMPT render
 *      GET render
 *      
 *      IF render = 2 THEN
 *          PROMPT shapeSelector
 *          GET shapeSelector
 *  
 *              CASE OF shapeSelector
 *              1:
 *              displayShape(rectangle)
 *              rectangleWidth <= widthInput()
 *              rectangleHeight <= heightInput()
 *  
 *              area = rectangleHeight * rectangleWidth
 *              perimeter = (rectangleHeight^2)+(rectangleWidth^2)
 * 
 *              displayShapeEnd(render, "rectangle", area, perimeter)
 * 
 *              2:
 *              displayShape(square)
 *              squareWidth <= widthInput()
 *              squareHeight <= heightInput()
 *  
 *              area = rectangleHeight * rectangleWidth
 *              perimeter = (rectangleHeight^2)+(rectangleWidth^2)
 * 
 *              displayShapeEnd(render, "square", area, perimeter)
 * 
 *              3:
 *              displayShape(triangle)
 *              triangleS1 <= triangleSide(1)
 *              triangleS2 <= triangleSide(2)
 *              triangleS3 <= triangleSide(3)
 *  
 *              area = (triangleS1 + triangleS2 + triangleS3)/2
 *              perimeter = triangleS1 + triangleS2 + triangleS3
 *              
 *              displayShapeEnd(render, "triangle", area, perimeter)
 * 
 *              4:
 *              displayShape(circle)
 *              circleRadius = radiusInput()
 * 
 *              area = PI *(circleRadius^2)
 *              perimeter = 2 * PI * circleRadius
 *  
 *              displayShapeEnd(render, "circle", area, perimeter)
 * 
 *              5:
 *              displayShape(Trapezium)
 *              trapeziumTop = topInput()
 *              trapeziumBase = baseInput()
 *              trapeziumSide1 = sideInput()
 *              trapeziumSide2 = side2Input()
 *              trapeziumHeight = heightInput()
 * 
 *              area = (trapeziumTop + trapeziumBase) * trapeziumHeight/2
 *              perimeter = trapeziumTop + trapeziumBase + trapeziumSide1 + trapeziumSide2
 * 
 *              displayShapeEnd(render, "Trapezium", area, perimeter) 
 *              END CASE
 * 
 *      ELSE IF render = 3 THEN
 *          PROMPT shapeSelector
 *          GET shapeSelector
 * 
 *              CASE OF shapeSelector
 *              1:
 *              displayShape("Cylinder")
 *              cylinderHeight = heightInput()
 *              cylinderRadius = radiusInput()
 *  
 *              volume = PI * ((cylinderRadius * cylinderRadius) * cylinderHeight)
 *              surfaceArea = (2 * PI * cylinderRadius * cylinderHeight) + (2 * PI * cylinderRadius * cylinderRadius)
 *              
 *              displayShapeEnd(render, "Cylinder", surfaceArea, volume)
 * 
 *              2:
 *              displayShape("Pyramid")
 *              double pyramidWidth = widthInput()
 *              double pyramidHeight = heightInput()
 *              double pyramidBase = baseInput()
 *
 *              volume = (pyramidBase * pyramidWidth * pyramidHeight) / 3
 *              surfaceArea = (pyramidBase * pyramidWidth) + (pyramidBase * Math.sqrt(((pyramidWidth / 2) * (pyramidWidth / 2)) + (pyramidHeight * pyramidHeight))) + (pyramidWidth * Math.sqrt(((1 / 2) * (1 / 2)) + (pyramidHeight * pyramidHeight)))
 *
 *              displayShapeEnd(render, "Pyramid", surfaceArea, volume)
 * 
 *              3: 
 *              displayShape("Sphere")
 *              double sphereRadius = radiusInput()
 *
 *              volume = 4 / 3 * (Math.PI * (sphereRadius * sphereRadius * sphereRadius))
 *              surfaceArea = 4 * (Math.PI * (sphereRadius * sphereRadius))
 *
 *              displayShapeEnd(render, "Sphere", surfaceArea, volume)
 * 
 *              4: 
 *              displayShape("Cuboid")
 *              double cuboidBase = radiusInput()
 *              double cuboidHeight = heightInput()
 *              double cuboidWidth = widthInput()
 *
 *              volume = cuboidBase * cuboidHeight * cuboidWidth
 *              surfaceArea = (2 * cuboidBase * cuboidWidth) + (2 * cuboidBase * cuboidHeight) + (2 * cuboidHeight * cuboidWidth)
 *
 *              displayShapeEnd(render, "Cuboid", surfaceArea, volume)
 * 
 *              5: 
 *              displayShape("Cone");
 *              double coneRadius = radiusInput();
 *              double coneHeight = heightInput();
 *
 *              volume = Math.PI * ((coneRadius * coneRadius) * (coneHeight / 3))
 *              surfaceArea = Math.PI * coneRadius * (coneRadius + Math.sqrt((coneHeight * coneHeight) + (coneRadius * coneRadius)))
 *
 *              displayShapeEnd(render, "Cone", surfaceArea, volume);
 *              END CASE
 *      END IF
 *      END IF
 * 
 *              WHILE errorMessage
 *                  PROMPT user for choice
 *                  IF choice y OR n THEN
 *                      errorMessage = false
 *  
 *                  ELSE
 *                  DISPLAY invalid input
 *                      errorMessage = true
 *              WHILE (choice == y)
 *              END DOWHILE
 *              END WHILE
 *  DISPLAY thank you
 *  END
 */

 import java.util.*;
 import java.lang.Math;
 import java.text.*;

 public class shapeCalculator{


    //This is to take input from user
    static Scanner sc = new Scanner (System.in);

    //This is to limit the decimal points to 3
    static DecimalFormat numberFormat = new DecimalFormat("#.000");


    /*
     * Basic I/O are in these few methods 
     * to avoid repetitive code in main method
     */

    //Prompt user for height and gave output
    static double heightInput(){

        double heightOutput;

        System.out.print("Insert height value in centimeters: ");
        return heightOutput = sc.nextDouble();
    }



    //Prompt user for width and gave output
    static double widthInput(){

        double widthOutput;

        System.out.print("Insert width value in centimeters: ");
        return widthOutput = sc.nextDouble();
    }



    //Prompt user for length and gave output
    static double lengthInput(){

        double lengthOutput;

        System.out.print("Insert length value in centimeters: ");
        return lengthOutput = sc.nextDouble();
    }


    
    //Prompt user for radius and gave output
    static double radiusInput(){

        double radiusOutput;

        System.out.print("Insert radius value in centimeters: ");
        return radiusOutput = sc.nextDouble();
    }


    //Prompt user for top value and gave output
    static double topInput(){

        double topOutput;

        System.out.print("Insert top value in centimeters: ");
        return topOutput = sc.nextDouble();
    }
    


    //Prompt user for base value and gave output
    static double baseInput(){

        double baseOutput;

        System.out.print("Insert base value in centimeters: ");
        return baseOutput = sc.nextDouble();
    }

    static double sideInput(){

        double baseOutput;

        System.out.print("Insert side value in centimeters: ");
        return baseOutput = sc.nextDouble();
    }

    static double side2Input(){

        double baseOutput;

        System.out.print("Insert another side value in centimeters: ");
        return baseOutput = sc.nextDouble();
    }

    //Prompt user for triangle value and gave output
    static double triangleSide(int sideSelector){

        double triangleSide = 0;

        if(sideSelector == 1){
            System.out.print("First side of the triangle in centimeters: ");
            triangleSide= sc.nextDouble();
        }
        
        else if(sideSelector == 2){
            System.out.print("Second side of the triangle in centimeters: ");
            triangleSide= sc.nextDouble();
        }

        else if(sideSelector == 3){
            System.out.print("Third side of the triangle in centemeters: ");
            triangleSide= sc.nextDouble();
        }

        return triangleSide;
    }



    //Display user selected shape type
    static void displayShape(String shapetype){

        System.out.print("\nYou have selected " + shapetype + "\n");
    }



    //Display user end result
    static void displayShapeEnd(char render, String shapetype, double surfaceAreaOutput, double volParOutput){


        if(render == '2'){
            System.out.print("\nthe " + shapetype + " area is " + numberFormat.format(surfaceAreaOutput));
            System.out.print("\nthe " + shapetype + " perimeter is " + numberFormat.format(volParOutput));
        }
        
        else if(render == '3'){
            System.out.print("\nThe " + shapetype + " volume is " + numberFormat.format(volParOutput));
            System.out.print("\nThe " + shapetype + " surface area is " + numberFormat.format(surfaceAreaOutput));

        }
    }
      
    public static void main (String args []){

        //declaration
        char render;
        int shapeSelector;
        char choice = 'y';

        //2D declaration
        double area;
        double perimeter;

        //3D declaration
        double volume;
        double surfaceArea;


        /*********This is the first page*************/
        System.out.print("\n _____________________");
        System.out.print("\n|  _________________  |");
        System.out.print("\n| |    Welcome to   | |");
        System.out.print("\n| |Shape Calculator!| |");
        System.out.print("\n| |   Made possible | |");
        System.out.print("\n| |        By       | |");
        System.out.print("\n| | Syahir & Amirul | |");
        System.out.print("\n| |_________________| |");
        System.out.print("\n|  ___ ___ ___   ___  |");
        System.out.print("\n| | 7 | 8 | 9 | | + | |");
        System.out.print("\n| |___|___|___| |___| |");
        System.out.print("\n| | 4 | 5 | 6 | | - | |");
        System.out.print("\n| |___|___|___| |___| |");
        System.out.print("\n| | 1 | 2 | 3 | | x | |");
        System.out.print("\n| |___|___|___| |___| |");
        System.out.print("\n| | . | 0 | = | | / | |");
        System.out.print("\n| |___|___|___| |___| |");
        System.out.print("\n|_____________________|");

        //start loop
        do{
            /*
             * The boolean is in the loop so that the Y/N 
             * value would be changed to true when the loop
             * reinitialise.
             */
            boolean errorMessage = true;
            System.out.print("\n\nWould you like to do a calculation on 2D or 3D object?: ");
            render = sc.next().charAt(0);


            //IF statement for choosing 2D or 3D object
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


                //switch statement to select what type of shape to be calculated
                switch(shapeSelector){

                    case 1: 
                        displayShape("Rectangle");

                        double rectangleWidth   = widthInput();
                        double rectangleHeight  = heightInput();


                        //area = rectangleHeight * rectangleWidth
                        //perimeter = (rectangleHeight^2)+(rectangleWidth^2)
                        area = rectangleHeight * rectangleWidth;
                        perimeter = Math.pow(rectangleHeight, 2) + Math.pow(rectangleWidth, 2);

                        displayShapeEnd(render,"Rectangle", area, perimeter);
                    break;



                    case 2: 
                        displayShape("Square");

                        double squareWidth  = widthInput();
                        double squareHeight = heightInput();

                        //area = rectangleHeight * rectangleWidth
                        //perimeter = (rectangleHeight^2)+(rectangleWidth^2)
                        area = squareHeight * squareWidth;
                        perimeter = Math.pow(squareHeight, 2) + Math.pow(squareWidth, 2);

                        displayShapeEnd(render, "Square", area, perimeter);
                    break;



                    case 3: 
                        displayShape("Triangle");

                        double triangleS1 = triangleSide(1);
                        double triangleS2 = triangleSide(2);
                        double triangleS3 = triangleSide(3);

                        //area = (triangleS1 + triangleS2 + triangleS3)/2
                        //perimeter = triangleS1 + triangleS2 + triangleS3
                        area = (triangleS1 + triangleS2 + triangleS3) /2;
                        perimeter = triangleS1 + triangleS2 + triangleS3;

                        displayShapeEnd(render, "Triangle", area, perimeter);
                    break;



                    case 4: 
                        displayShape("Circle");

                        double circleRadius = radiusInput();

                        //area = PI *(circleRadius^2)
                        //perimeter = 2 * PI * circleRadius
                        area = Math.PI * Math.pow(circleRadius, 2);
                        perimeter = 2 * Math.PI * circleRadius ;

                        displayShapeEnd(render, "Circle", area, perimeter);
                    break;



                    case 5: 
                        displayShape("Trapezium");

                        double trapeziumTop     = topInput();
                        double trapeziumBase    = baseInput();
                        double trapeziumSide1   = sideInput();
                        double trapeziumSide2   = side2Input();
                        double trapeziumHeight  = heightInput();

                        //area = (trapeziumTop + trapeziumBase) * trapeziumHeight/2
                        //perimeter = trapeziumTop + trapeziumBase + trapeziumSide1 + trapeziumSide2
                        area = (trapeziumTop + trapeziumBase) * trapeziumHeight /2 ;
                        perimeter = trapeziumTop + trapeziumBase + trapeziumSide1 + trapeziumSide2;

                        displayShapeEnd(render, "Trapezium", area, perimeter);
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

                        //volume = PI * ((cylinderRadius * cylinderRadius) * cylinderHeight)
                        //surfaceArea = (2 * PI * cylinderRadius * cylinderHeight) + 
                        //              (2 * PI * cylinderRadius * cylinderRadius)
                        volume = Math.PI * ((cylinderRadius * cylinderRadius) * cylinderHeight);
                        surfaceArea = (2 * Math.PI * cylinderRadius * cylinderHeight) + 
                                      (2 * Math.PI * cylinderRadius * cylinderRadius);

                        displayShapeEnd(render, "Cylinder", surfaceArea, volume);
                    break;
                    


                    case 2: 
                        displayShape("Pyramid");

                        double pyramidWidth = widthInput();
                        double pyramidHeight = heightInput();
                        double pyramidBase = baseInput();

                        //volume = (pyramidBase * pyramidWidth * pyramidHeight) / 3
                        //surfaceArea = (pyramidBase * pyramidWidth) + 
                        //              (pyramidBase * Math.sqrt(((pyramidWidth / 2) * 
                        //              (pyramidWidth / 2)) + (pyramidHeight * pyramidHeight))) +
                        //              (pyramidWidth * Math.sqrt(((1 / 2) * (1 / 2)) +
                        //              (pyramidHeight * pyramidHeight)))
                        volume = (pyramidBase * pyramidWidth * pyramidHeight) / 3;
                        surfaceArea = (pyramidBase * pyramidWidth) + 
                                      (pyramidBase * Math.sqrt(((pyramidWidth / 2) * 
                                      (pyramidWidth / 2)) + (pyramidHeight * pyramidHeight))) + 
                                      (pyramidWidth * Math.sqrt(((1 / 2) * (1 / 2)) + 
                                      (pyramidHeight * pyramidHeight)));

                        displayShapeEnd(render, "Pyramid", surfaceArea, volume);
                    break;


                    
                    case 3: 
                        displayShape("Sphere");

                        double sphereRadius = radiusInput();

                        //volume = 4 / 3 * (Math.PI * (sphereRadius * sphereRadius * sphereRadius))
                        //surfaceArea = 4 * (Math.PI * (sphereRadius * sphereRadius))
                        volume = 4 / 3 * (Math.PI * (sphereRadius * sphereRadius * sphereRadius));
                        surfaceArea = 4 * (Math.PI * (sphereRadius * sphereRadius));

                        displayShapeEnd(render, "Sphere", surfaceArea, volume);
                    break;



                    case 4: 
                        displayShape("Cuboid");

                        double cuboidBase = radiusInput();
                        double cuboidHeight = heightInput();
                        double cuboidWidth = widthInput();

                        //volume = cuboidBase * cuboidHeight * cuboidWidth
                        //surfaceArea = (2 * cuboidBase * cuboidWidth) + 
                        //              (2 * cuboidBase * cuboidHeight) + (2 * cuboidHeight * cuboidWidth)
                        volume = cuboidBase * cuboidHeight * cuboidWidth;
                        surfaceArea = (2 * cuboidBase * cuboidWidth) + 
                                      (2 * cuboidBase * cuboidHeight) + (2 * cuboidHeight * cuboidWidth);

                        displayShapeEnd(render, "Cuboid", surfaceArea, volume);
                    break;



                    case 5: 
                        displayShape("Cone");

                        double coneRadius = radiusInput();
                        double coneHeight = heightInput();

                        //volume = Math.PI * ((coneRadius * coneRadius) * (coneHeight / 3))
                        //surfaceArea = Math.PI * coneRadius * (coneRadius + 
                        //              Math.sqrt((coneHeight * coneHeight) + (coneRadius * coneRadius)));
                        volume = Math.PI * ((coneRadius * coneRadius) * (coneHeight / 3));
                        surfaceArea = Math.PI * coneRadius * (coneRadius + 
                                      Math.sqrt((coneHeight * coneHeight) + (coneRadius * coneRadius)));

                        displayShapeEnd(render, "Cone", surfaceArea, volume);
                    break;
                }


            }

            
            while(errorMessage){

                System.out.print("\nWould you like to continue? [Y or N]: ");
                choice = sc.next().charAt(0);

                if (choice=='y' || choice =='Y' ||choice=='n' || choice =='N')
                    errorMessage = false;

                else {
                    System.out.print("\nInvalid Input!");
                    errorMessage = true;}
            }

        }while(choice == 'Y' || choice == 'y');

        System.out.print("\nThank you for using Shape Calculator, have a nice day!");


    }

}