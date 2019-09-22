import java.util.Scanner;

public class Political_Poll {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][] politicalTopics = new int[5][10];
		int[] politicalTotals = new int[5];
        
        System.out.println("Welcome to Amber's Political Poll!");
        
        System.out.print("Type '+' to add another user's input");
        System.out.print(" or type '=' to calculate results: ");
        char myChar = in.next().charAt(0);
        
        int gun_Value, abort_Value, climate_Value, pay_Value, adopt_Value;
        int gun_Index, abort_Index, climate_Index, pay_Index, adopt_Index;
        int gun_Total = 0, abort_Total = 0, climate_Total = 0, pay_Total = 0, adopt_Total = 0;
        int gun_Num = 0, abort_Num = 0, climate_Num = 0, pay_Num = 0, adopt_Num = 0;
        int i, maxValue, minValue, maxIndex = 0, minIndex = 0;
        
        while (myChar == '+'){
        	System.out.print("Please rate the following topics from 1 ");
            System.out.println("(least important) to 10 (most important):");
            
            System.out.print("Gun Control: ");
            gun_Value = in.nextInt();
            gun_Index = gun_Value - 1;
            politicalTopics[0][gun_Index] = politicalTopics[0][gun_Index] + 1;
            gun_Num++;
            
            System.out.print("Abortion: ");
            abort_Value = in.nextInt();
            abort_Index = abort_Value - 1;
            politicalTopics[1][abort_Index] = politicalTopics[1][abort_Index] + 1;
            abort_Num++;
            
            System.out.print("Climate Change: ");
            climate_Value = in.nextInt();
            climate_Index = climate_Value - 1;
            politicalTopics[2][climate_Index] = politicalTopics[2][climate_Index] + 1;
            climate_Num++;
            
            System.out.print("Equal Pay: ");
            pay_Value = in.nextInt();
            pay_Index = pay_Value - 1;
            politicalTopics[3][pay_Index] = politicalTopics[3][pay_Index] + 1;
            pay_Num++;
            
            System.out.print("LGBT Adoption Rights: ");
            adopt_Value = in.nextInt();
            adopt_Index = adopt_Value - 1;
            politicalTopics[4][adopt_Index] = politicalTopics[4][adopt_Index] + 1;
            adopt_Num++;
            
            System.out.print("Type '+' to add another user's input");
            System.out.print(" or type '=' to calculate results: ");
            myChar = in.next().charAt(0);
        }
        
        
        // Tabular report.
        System.out.print("---------------------------------");
        System.out.println("---------------------------------");
        
        System.out.print("RESULTS        ");
        System.out.println("| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10| Average |");
        
        System.out.print("---------------------------------");
        System.out.println("---------------------------------");
        
        System.out.printf("%-15s", "Gun Control");
        for (i = 0; i < 10; i++){
        	System.out.printf("| %-2d", politicalTopics[0][i]);
        	if (politicalTopics[0][i] > 0){
        		gun_Total = gun_Total + (i + 1);
        	}
        }
        politicalTotals[0] = gun_Total;
        double gun_Average = (double)gun_Total / gun_Num;
        System.out.printf("|   %.01f\n", gun_Average);
        
        System.out.printf("%-15s", "Abortion");
        for (i = 0; i < 10; i++){
        	System.out.printf("| %-2d", politicalTopics[1][i]);
        	if (politicalTopics[1][i] > 0){
        		abort_Total = abort_Total + (i + 1);
        	}
        }
        politicalTotals[1] = abort_Total;
        double abort_Average = (double)abort_Total / abort_Num;
        System.out.printf("|   %.01f\n", abort_Average);
        
        System.out.printf("%-15s", "Climate Control");
        for (i = 0; i < 10; i++){
        	System.out.printf("| %-2d", politicalTopics[2][i]);
        	if (politicalTopics[2][i] > 0){
        		climate_Total = climate_Total + (i + 1);
        	}
        }
        politicalTotals[2] = climate_Total;
        double climate_Average = (double)climate_Total / climate_Num;
        System.out.printf("|   %.01f\n", climate_Average);
        
        System.out.printf("%-15s", "Equal Pay");
        for (i = 0; i < 10; i++){
        	System.out.printf("| %-2d", politicalTopics[3][i]);
        	if (politicalTopics[3][i] > 0){
        		pay_Total = pay_Total + (i + 1);
        	}
        }
        politicalTotals[3] = pay_Total;
        double pay_Average = (double)pay_Total / pay_Num;
        System.out.printf("|   %.01f\n", pay_Average);
        
        System.out.printf("%-15s", "LGBT Adoption");
        for (i = 0; i < 10; i++){
        	System.out.printf("| %-2d", politicalTopics[4][i]);
        	if (politicalTopics[4][i] > 0){
        		adopt_Total = adopt_Total + (i + 1);
        	}
        }
        politicalTotals[4] = adopt_Total;
        double adopt_Average = (double)adopt_Total / adopt_Num;
        System.out.printf("|   %.01f\n", adopt_Average);
        
        
        
        // Highest and Lowest Points
        
        System.out.print("---------------------------------");
        System.out.println("---------------------------------");
        
        maxValue = politicalTotals[0];
        
        for(i = 1; i < 5; i++){
        	if(politicalTotals[i] > maxValue){
          	  maxValue = politicalTotals[i];
          	  maxIndex = i;
          	}
        }
        
        minValue = politicalTotals[0];
        
        for(i = 1; i < 5; i++){
        	if(politicalTotals[i] < minValue){
          	  minValue = politicalTotals[i];
          	  minIndex = i;
          	}
        }
        
        //Highest Points
        System.out.print("\nIssue with Highest Points: ");
        if (maxIndex == 0){
        	System.out.print("Gun Control with ");
        }
        if (maxIndex == 1){
        	System.out.print("Abortion with ");
        }
        if (maxIndex == 2){
        	System.out.print("Climate Change with ");
        }
        if (maxIndex == 3){
        	System.out.print("Equal Pay with ");
        }
        if (maxIndex == 4){
        	System.out.print("LGBT Adoption Rights with ");
        }
        System.out.println( + maxValue + " points.");
        
        //Lowest Points
        System.out.print("Issue with Lowest Points: ");
        if (minIndex == 0){
        	System.out.print("Gun Control with ");
        }
        if (minIndex == 1){
        	System.out.print("Abortion with ");
        }
        if (minIndex == 2){
        	System.out.print("Climate Change with ");
        }
        if (minIndex == 3){
        	System.out.print("Equal Pay with ");
        }
        if (minIndex == 4){
        	System.out.print("LGBT Adoption Rights with ");
        }
        System.out.println( + minValue + " points.");
        

        in.close();
	}

}
