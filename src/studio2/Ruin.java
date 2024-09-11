package studio2;
import java.util.Scanner;


public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("startAmount: ");
		int startAmount = in.nextInt();
		System.out.print("winChance: ");
		double winChance = in.nextDouble();
		System.out.print("winLimit: ");
		int winLimit = in.nextInt();
		
		System.out.print("totalSimulations: ");
		int totalSimulations = in.nextInt();
		
		
		int Money = startAmount;
		double randomNum;
		int Ruins = 0;
		int j = 0;
		
		
		for (int i = 1; i < totalSimulations; i++) {
			Money = startAmount;
			
			j = 0;
			while(Money > 0 && Money < winLimit) {
				randomNum = Math.random();
				//System.out.println(randomNum);
				
				if (randomNum < .01 * winChance) {
					Money += 1;
					//System.out.println("Win ");
				}
				else {
					Money -= 1;
					//System.out.println("Lose ");
				}
				//System.out.println("Current Money: " + Money);
				j++;
			}
			
			
			System.out.print("Day: " + i + " Hands: " + j);
			if (Money == 0) {
				System.out.println(" RUIN");
				Ruins ++;
			}
			else {
				System.out.println(" WIN");
			}
			
		}
		System.out.println("Ruins: " + Ruins);
		double estimate = (double)Ruins / totalSimulations;
		System.out.println("Ruin rate estimate: " + estimate);
		
		
		

	}

}
