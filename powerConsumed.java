
import java.util.*;
public class powerConsumed {
        
    public powerConsumed() {
    }
    
    static Scanner sc = new Scanner(System.in);

    
    static double power(double voltage, double current)
    {
    	double powerValue = voltage * current;
    	return powerValue;
    }
    static void display(double powerValue,double voltage, double current)
    {
    	System.out.print("Voltage   Current   Power");
    	System.out.print("\n"+voltage+"\t\t"+current+"\t\t\t"+powerValue);
    }
   
    public static void main(String[] args) {
        
        double newVoltage;
        double newPower;
        double newCurrent;
        
        int sentinel = -1;
        do
        {
        	System.out.print("Enter voltage :");
        	newVoltage = sc.nextDouble();
        	System.out.print("Enter current :");
        	newCurrent = sc.nextDouble();
        	newPower = power(newVoltage,newCurrent);
        	display(newPower,newVoltage,newCurrent);
        	
        	System.out.print("\nEnter -1 to quit : ");
        	sentinel = sc.nextInt();
        }while(sentinel !=-1);
        
        
    }
}