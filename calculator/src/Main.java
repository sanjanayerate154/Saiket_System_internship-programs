import java.util.Scanner;

public class Main {

	static int  Add( int num1,int num2)
	{
		return num1+num2;

	}
	static int sub(int num1,int num2)
	{
		return num1-num2;
	}
	static int mul(int num1,int num2)
	{
		return num1*num2;
	}
	static int div(int num1,int num2)
	{
		int div;
		try
		{
			return num1/num2;

		}catch (ArithmeticException e){ System.out.println(e);};
		return 0;
		//return div;
	}
	public static void main(String[] args)
	{
		int n1 ,n2,ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
		ch=sc.nextInt();

			switch (ch) {
				case 1 -> {
					System.out.println("Enter 2 numbers");
					n1 = sc.nextInt();
					n2 = sc.nextInt();
					System.out.println("Addition is:" + Add(n1, n2));
				}
				case 2 -> {
					System.out.println("Enter 2 numbers");
					n1 = sc.nextInt();
					n2 = sc.nextInt();
					System.out.println("Substraction is:" + sub(n1, n2));
				}
				case 3 -> {
					System.out.println("Enter 2 numbers");
					n1 = sc.nextInt();
					n2 = sc.nextInt();
					System.out.println("Multiplication is:" + mul(n1, n2));
				}
				case 4 -> {
					System.out.println("Enter 2 numbers");
					n1 = sc.nextInt();
					n2 = sc.nextInt();
					System.out.println("Division is:" + div(n1, n2));
				}
				case 5 -> System.exit(0);
				default -> System.out.println("Wrong choice");
			}
		}while(ch!=5);
		sc.close();
	}
}