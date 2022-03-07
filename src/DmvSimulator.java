import java.util.Random;

public class DmvSimulator {

	public static void main(String[] args) {
	
		System.out.println("Hello user welcome to the DMV Simulator.");

		Random rand = new Random();
		
		
		int userNum = rand.nextInt(101);
		
		//int userNum = 10;
		
		System.out.println("Here is your number: " + userNum);
		System.out.println("Please wait until your number is called.");
		
		int count = userNum;
		
		
		boolean yourTurn = false;

			while(!yourTurn)
			{
				count = count + 1;
				System.out.println("Next number is: " + count);
			
			if (count == 100)
			{
				count = 0;
			}
			if (count == userNum)
			{
				System.out.println("HEY MORON, YOU DO NOT HAVE THE REQUIRED PAPERWORK.");
				yourTurn = true;
			}
		}
	}
		
}

	
