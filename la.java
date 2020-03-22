import java.util.Scanner;

public class la{

	public static void main(String [] args){

		Scanner kb = new Scanner(System.in);

		int time;
		int velocity = 50 ;
		int distance;
		String Repeat; //Code added updated March 22/2020 Start in September of 2019


		do{
			System.out.println("\nPlease enter the time: ");
			time = kb.nextInt();


			System.out.println("Hours\t              Distance Traveled");
					System.out.println("========================================");

			for(int i = 1 ;  i <= time; i++)

{
	distance= velocity * i; //This is what the distance will print out.
	System.out.println( i+ "\t\t"+distance);
}
System.out.println("What to try a different number? Type yes to do again" );
Repeat=kb.next();
}while(Repeat.equals("Yes")||Repeat.equals("yes"));
}
}




