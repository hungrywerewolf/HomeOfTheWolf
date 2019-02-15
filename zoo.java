/**
 * @(#)zoo.java
 *
 *
 * @author : Amirul Asyraf B. Rohaizat
 * @version 1.00 2019/01/16
 * zoo_entrance_fee
 * input = age
 *         ic
 * output = entrance_fee
 * calculate = entrance_fee
 * 
 * prompt age
 * get age
 * prompt ic
 * get ic
 * IF age >=3 AND age <=12 THEN
 *	Display "category children"
 *	IF ic = 1 THEN
 *	Display "your entrance fee is RM 11.00"
 *	ELSE
 *	Display "your entrance fee is RM 27.00"
 *	END IF
 * ELSE IF age >=13 AND age <=64 THEN
 *	Display "category adult"
 *	IF ic = 1 THEN
 *	Display "your entrance fee is RM 32.00"
 *	ELSE
 *	Display "your entrance fee is RM 53.00"
 *	END IF
 * ELSE IF age >=65 THEN
 *	Display "category senior citizen"
 *	IF ic = 1 THEN
 *	Display "your entrance fee is RM 16.00"
 *	ELSE
 *	Display "your entrance fee is RM 16.00"
 *	END IF
 * END IF
 * END IF
 * END IF
 * END
 */
 
 import java.util.*;
 public class zoo
 {
 	public static void main (String[] args)
 	{
 	//variable declaration
 	int age;//input
 	int ic;//input
 	
 	Scanner sc = new Scanner (System.in);
 	
 	System.out.print ("Enter your age : ");//display
 	age = sc.nextInt();//input
 	
 	if (age >=3 && age <=12 )//if statement
 	{
 		System.out.print ("Category Children");//display
 		System.out.print ("\nDo you have a Mykid/Mykad?");//display
 		System.out.print ("\nPlease type 1 for YES and 0 for NO :");//display
 		ic = sc.nextInt();//input
 		if (ic == 1)//if statement
 		{
 			System.out.print ("Your entrance fee is RM 11.00");//ouput
 		}
 		else if (ic == 0)
 		{
 			System.out.print ("Your entrance fee is RM 27.00");//output
 		}
 		else
 		{
 			System.out.print ("Invalid Number");//output
 		}
 	}
 	else if (age >=13 && age <=64)//if statement
 	{
 		System.out.print ("Category Adult");//display
 		System.out.print ("\nDo you have a Mykid/Mykad?");//display
 		System.out.print ("\nPlease type 1 for YES and 0 for NO :");//display
 		ic = sc.nextInt();//input
 		if (ic == 1)//if statement
 		{
 			System.out.print ("Your entrance fee is RM 32.00");//output
 		}
 		else if (ic == 0)
 		{
 			System.out.print ("Your entrance fee is RM 53.00");//output
 		}
 		else
 		{
 			System.out.print ("Invalid Number");//output
 		}
 	}
 	else if (age >=65)//if statement
 	{
 		System.out.print ("Category Senior Citizen");//display
 		System.out.print ("\nDo you have a Mykid/Mykad?");//display
 		System.out.print ("\nPlease type 1 for YES and 0 for NO :");//display
 		ic = sc.nextInt();//input
 		if (ic == 1)//if statement
 		{
 			System.out.print ("Your entrance fee is RM 16.00");//output
 		}
 		else if (ic == 0)
 		{
 			System.out.print ("Your entrance fee is RM 16.00");//output
 		}
 		else
 		{
			 System.out.print ("Invalid Number");//output
			 sc.close();
 		}
 	}
 	}
 	
 }
 
 	