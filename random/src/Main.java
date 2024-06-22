import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		 Random random = new Random();
		 int target=random.nextInt(50)+1;
		 Scanner sc = new Scanner(System.in);
		 int guess=0;
		 int attempts=0;

		 while(guess!=target)
		 {
			 System.out.println("Guess the number ");
			 guess=sc.nextInt();
			 attempts++;
			 if(guess<target)
			 {
				 System.out.println("Your Guess is too low");
			 }
			 else if(guess>target)
			 {
				 System.out.println("Your Guess is too high");
			 }
			 else
			 {
				 System.out.println("Congratulations you guessed it right!!!! ");
				 System.out.println("You took " + attempts+ " attemps");
			 }
		 }
	}
}