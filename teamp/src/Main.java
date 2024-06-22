import java.util.Scanner;

public class Main {

	 static double faranite(double cel)
	 {
		 double fara;
		 fara=(cel*1.8)+32;
		 return fara;

	 }
	static double celsius(double fara)
	{
		double cel;
		cel=(fara-32)*5/9;
		return cel;

	}
	public static void main(String[] args)
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice");
			System.out.println("1. Conversion of Temperature from Celsius to Faranite");
			System.out.println("2.Conversion of Temperature from Faranite to  Celsius ");
			System.out.println("3.Exit ");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.println("Enter the Temperature in celsius ");
					int cel = sc.nextInt();
					System.out.println(" Faranite Temperature is:-" +faranite(cel));
					break;
				case 2:
					System.out.println("Enter the Temperature in Faranite ");
					int fara = sc.nextInt();
					System.out.println(" Celsius Temperature is:-" +celsius(fara));
					break;
				case 3:
					  System.exit(0);
			}
		}while (ch!=3);
		sc.close();

	}
}