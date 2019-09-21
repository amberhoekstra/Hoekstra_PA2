import java.util.Scanner;

public class Calculate_BMI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to BMI Calculator.");
        System.out.print("Type '1' for pounds/inches ");
        System.out.print("or '2' for kilograms/meters: ");
        int n1 = in.nextInt();
        
        double calculated_BMI = 0.0;
        
        if (n1 == 1){
        	System.out.print("Enter weight in pounds: ");
        	double weightInPounds = in.nextDouble();
        	System.out.print("Enter height in inches: ");
        	double heightInInches = in.nextDouble();
        	
        	calculated_BMI = (703 * weightInPounds) / (heightInInches * heightInInches);

        }
        
        else if (n1 == 2){
        	System.out.print("Enter weight in kilograms: ");
        	double weightInKilograms = in.nextDouble();
        	System.out.print("Enter height in centimeters: ");
        	double heightInCentimeters = in.nextDouble();
        	
        	double heightInMeters = heightInCentimeters / 100;
        	
        	calculated_BMI = (weightInKilograms) / (heightInMeters * heightInMeters);
        }
        
        if (n1 == 1 || n1 == 2){
        	System.out.printf("\nYour BMI is %.1f", calculated_BMI);
        	System.out.println(".");
        	System.out.println("_________________");
        	System.out.println("BMI Categories:");
        	System.out.println("    Underweight = less than 18.5");
        	System.out.println("    Normal weight = 18.5 through 24.9");
        	System.out.println("    Overweight = 25 through 29.9");
        	System.out.println("    Obesity = 30 or more");
        	
        }
        
        else{
        	System.out.print("Not a valid entry.");
        }

        in.close();
	}

}
