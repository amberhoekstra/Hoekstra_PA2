import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number to decrypt: ");
        int n1 = in.nextInt(); 
        
        int firstDigit = n1 / 1000;
        int secondDigit = (n1 % 1000) / 100;
        int thirdDigit = (n1 % 100) / 10;
        int fourthDigit= n1 % 10;
        
        int tempDigit = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = tempDigit;
        
        tempDigit = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = tempDigit;

        firstDigit = (firstDigit + 10 - 7) % 10;
        secondDigit = (secondDigit + 10 - 7) % 10;
        thirdDigit = (thirdDigit + 10 - 7) % 10;
        fourthDigit = (fourthDigit + 10 - 7) % 10;
        
        System.out.print("The encrypted number is: ");
        System.out.print(firstDigit);
        System.out.print(secondDigit);
        System.out.print(thirdDigit);
        System.out.print(fourthDigit);
        System.out.println(".");
        
        in.close();

	}

}
