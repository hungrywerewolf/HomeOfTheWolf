import java.util.*;
public class rooms{
    public rooms(){

    }

    static Scanner sc = new Scanner (System.in);

    static double userInputLength(){
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        return length;
    }

    static double calculateArea (double length){

        double area = length * length;
        return area;
    }

    static void calculateCharge (double area){

        double charge = area * 6.50;
        System.out.print("Your total is "+ charge);
    }

    public static void main (String args[]){
        double newArea;
        double newLength;
        double newCharge;

        newLength = userInputLength();
        newArea = calculateArea(newLength);
        calculateCharge(newArea);

    }
}