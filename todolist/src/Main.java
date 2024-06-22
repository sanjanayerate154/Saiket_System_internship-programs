import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<String> list = new ArrayList<>();
	static String  Addtask()
    {
	    String title, status;
		System.out.println("Enter the title of task ");
		title=sc.next();
	    list.add("Title: " + title);
		return " Successfully Added in List!!!!";

    }
	static String addstatus()
	{
		String status;
		System.out.println("Enter the status");
		status=sc.next();
		return "Status Added Successfully!!";
	}
	static String displayList() {
		if (list.isEmpty()) {
			return "The task list is empty.";
		}
		System.out.println("Task List:");
		for (String task : list) {
			System.out.println(task);
		}
		return "Thank you!";
	}
	public static void main(String[] args)
	{
		int ch ;
		do {

			System.out.println("1. Add the task");
			System.out.println("2.Add the Status");
			System.out.println("3.Display the task with status");
			System.out.println("4.Exit");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.println(Addtask());
					break;
				case 2:
					System.out.println(addstatus());
					break;
				case 3:
					System.out.println(displayList());
					break;
				case 4:
					System.exit(0);
			}
		}while (ch != 3) ;

	}
}