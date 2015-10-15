import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		
		int userbirthday, max = 2015;
		String surname;
		int age = 0, i = 1;
		
		Scanner user = new Scanner(System.in);
		do{ 
		System.out.println(i);//Debug
		
		System.out.print("What is your name?");
		surname = user.next();
		System.out.println("What year were you born in?");
	
		
		i++;
		userbirthday = user.nextInt();
		age = 2015 - userbirthday;
		
		
		System.out.println("Hello, " + surname + " You are " +age);
		} while (i<=3);
	}

}
