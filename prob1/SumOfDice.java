package labproject3.prob1;
import java.util.Random;
import java.util.Arrays;
public class SumOfDice {
	int roll1;
	int roll2;
	int totalRoll;
	int occurences;
	int[] diceSums = new int[12]; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Roll());
		
	}
	public void Roll()
	{
		for(int i = 0; i<100;i++)
		{
			
		roll1 = (int)(Math.random()*6)+1;
		roll2 = (int)(Math.random()*6)+1;
		totalRoll = roll1+roll2 -1;
		diceSums[totalRoll] = diceSums[totalRoll]+1;
		
		}
		System.out.println("Sum of dice \t  occurences" );
		System.out.println("----------- \t  ----------" );
		for( int i = 1; i < diceSums.length; i++)
		{
			System.out.println(i+1 + " \t \t" + diceSums[i]);
		}
		
	}
	public void chart()
	{
		System.out.println("Dice Sums: (100 rolls)" );
		for( int i = 1; i < diceSums.length; i++)
		{
			System.out.print(i+1 + " : \t ");
			for(int x = 0; x < diceSums[i]; x++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
