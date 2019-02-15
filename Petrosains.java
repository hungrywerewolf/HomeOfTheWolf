/** petrosains
 * 
 *      Prompt user for age
 *      Get age
 *      Prompt user for malaysian
 *      Get malaysian
 * 
 *      IF malaysian = true THEN
 *          IF age >= 56 THEN
 *          price = 8
 *          display price
 * 
 *          ELSE IF age <=56 AND >= 18 THEN
 *          price = 15
 *          display price
 * 
 *          ELSE IF age <=17 AND age >= 13 THEN
 *          price = 10
 *          display price
 * 
 *          ELSE IF age <= 12 AND age >=2 THEN
 *          price  = 5
 *          display price
 * 
 *          ELSE
 *          price = 0
 *          display price 
 *          END IF
 * 
 *      IF malaysian = false THEN
 *          IF age >= 56 THEN
 *          price = 18
 *          display price
 * 
 *          ELSE IF age <=56 AND >= 18 THEN
 *          price = 25
 *          display price
 * 
 *          ELSE IF age <=17 AND age >= 13 THEN
 *          price = 20
 *          display price
 * 
 *          ELSE IF age <= 12 AND age >=2 THEN
 *          price  = 15
 *          display price
 * 
 *          ELSE
 *          price = 0
 *          display price 
 *          END IF
 *      END IF
 */


import java.util.*;
public class Petrosains{
    public static void main(String args[]){
        //variable declairation
        double age;
        boolean malaysian = false;
        double price;
        

        Scanner sc = new Scanner (System.in);

        System.out.print("Insert your age: "); //prompt
        age = sc.nextDouble(); //get

        System.out.print("Are you a Malaysian citizen? true/false: "); //prompt
        malaysian = sc.nextBoolean(); //get
        

        if (malaysian == true) {

                if (age >= 56){
                price = 8;
                System.out.print("You're a Malaysian senior citizen and your fee is RM"+price); //display
                }

                else if (age <= 56 && age >=18){
                price = 15;
                System.out.print("You're a Malaysian adult and your fee is RM"+price); //display
                }

                else if (age <=17 && age >= 13){
                price = 10;
                System.out.print("You're a Malaysian youth and your fee is RM"+price); //display
                }

                else if (age <=12 && age >= 2){
                price = 5;
                System.out.print("You're a Malaysian child and your fee is RM"+price); //display
                }

                else {
                price = 0;
                System.out.print("You're a Malaysian child infant and your fee is RM"+price); //display
                }
            }

        
        else if (malaysian == false) {

                if (age >= 56){
                price = 18;
                System.out.print("You're a foreign senior citizen and your fee is RM"+price); //display
                }

                else if (age <= 56 && age >=18){
                price = 25;
                System.out.print("You're a foreign adult citizen and your fee is RM"+price); //display
                }

                else if (age <=17 && age >= 13){
                price = 20;
                System.out.print("You're a foreign youth citizen and your fee is RM"+price); //display
                }
    
                else if (age <=12 && age >= 2){
                price = 15;
                System.out.print("You're a foreign child citizen and your fee is RM"+price); //display
                }
    
                else {
                price = 0;
                System.out.print("You're a foreign child infant citizen and your fee is RM"+price); //display
                }
                sc.close();
            }
        }
    }

            
    