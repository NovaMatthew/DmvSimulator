import java.util.Random;
import java.util.SplittableRandom;

public class DmvSimulator {

	public static void main(String[] args) {
	
		System.out.println("Hello user welcome to the DMV Simulator.");

		Random rand = new Random();
		SplittableRandom superRandom = new SplittableRandom();
		boolean whoReallyKnows = superRandom.nextInt(101) == 1;
		
		int userNum = rand.nextInt(201);
		
		
		
		System.out.println("Here is your number: " + userNum);
		System.out.println("Please wait until your number is called.");
		
		int count = userNum;
		
		
		boolean yourTurn = false;

			while(!yourTurn)
			{
				count = count + 1;
				System.out.println("Next number is: " + count);
			
			if (count == 200)
			{
				count = 0;
			}
			if (count == userNum)
			{
				if(whoReallyKnows)
				{
					System.out.println("You have all paperwork!");
					yourTurn = true;	
				}
				else
				{
				System.out.println("HEY MORON, YOU DO NOT HAVE THE REQUIRED PAPERWORK.");
				yourTurn = true;
				}
			}
		}
	}
		
}

	
