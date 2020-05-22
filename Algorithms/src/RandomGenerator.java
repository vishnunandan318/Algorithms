import java.util.Random;
import java.util.Scanner;


public class RandomGenerator {
	
	Random random = new Random();
	
	
	public int randomInt() {
		return random.nextInt();
	}
	
	public int randomInt(int limit) {
		if(limit ==0) return random.nextInt(); 
		
		return random.nextInt(limit);
	}
	
	public int rolltheDice() {
		return Math.abs((random.nextInt()%6));
	}
	
	public String FlipCoin() {
		boolean side = random.nextBoolean();
		return (side == true) ? "Heads" : "Tails";  
	}

	public int[] randomArray(int limit, int size) {
		 int[] arr = new int[size];
		
		 for(int i=0; i<=size-1;i++) {
			 arr[i] = random.nextInt(limit);
		 }
		 
		return arr;
	}
	
	public String randomAlphabet() {
		int asccii = 65 + random.nextInt(26);
		
		String ch = Character.toString(asccii);
		return ch;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomGenerator rg = new RandomGenerator();
		Scanner sc = new Scanner(System.in);
		int size = 25;
		int limit = 100;
		
		System.out.println("Welcome to Random Generator "+
							"Choose the option below: \n"+
							"1. Random number \n"+
							"2. Random number wityh upper limit \n"+
							"3. Array with random numbers \n"+
							"4. Roll the dice \n"+
							"5. Flip the coin \n"+
							"6. Random Alphabet \n");
		
		int choice = sc.nextInt();
	
		do {
		switch(choice){
			case 1:	
				System.out.print("Random number : ");
				System.out.println(rg.randomInt());
				choice = sc.nextInt();
				break;
			
			case 2:
				System.out.print("Specify the upper limit to generate the random number : ");
				size = sc.nextInt();
				System.out.println(rg.randomInt(size));
				choice = sc.nextInt();
				break;
		
			case 4:	
				System.out.print("rolling the dice : ");
				System.out.println(rg.rolltheDice());
				choice = sc.nextInt();
				break;
		
			case 5:	
				System.out.print("Flip the coin : ");
				System.out.println(rg.FlipCoin());
				choice = sc.nextInt();
				break;
			case 3:	
				System.out.print("Specify the size of the random array : ");
				size = sc.nextInt();
				System.out.print("Specify the upper limit of the random array : ");
				limit = sc.nextInt();
		
				int[] arr = rg.randomArray(limit, size);
				System.out.print("[");
				for(int num : arr) { System.out.print(" " +num + " ");   }
				System.out.println("]");
				choice = sc.nextInt();
				break;
				
			case 6:	
				System.out.print("Random alphabet : ");
				System.out.println(rg.randomAlphabet());
				choice = sc.nextInt();
				break;
				
			case 8:
				System.out.println("Thanks for trying");
				break;
				
			default:
				System.out.println("wrong Input try again");
				choice = sc.nextInt();
				break;
				
		}
		}while(choice !=8);
		
		
		sc.close();
	}
}
