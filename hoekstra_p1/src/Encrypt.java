import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number to encrypt: ");
        int n1 = in.nextInt(); 
        
        int firstDigit = n1 / 1000;
        int secondDigit = (n1 % 1000) / 100;
        int thirdDigit = (n1 % 100) / 10;
        int fourthDigit= n1 % 10;

        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;
        
        //Then swap the first digit with the third
        //and swap the second digit with the fourth.
        //Then print the encrypted integer.
        
        int tempDigit = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = tempDigit;
        
        tempDigit = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = tempDigit;
        
        System.out.print("The encrypted number is: ");
        System.out.print(firstDigit);
        System.out.print(secondDigit);
        System.out.print(thirdDigit);
        System.out.print(fourthDigit);
        System.out.println(".");
        
        in.close();
	}

}
