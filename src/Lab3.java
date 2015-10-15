import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
	
		int userbirthday; 
		int age;
		int rest;
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("What year were you born in?");
		userbirthday = user.nextInt();
		age = 2015 - userbirthday;
		
		if (age >= 21)
		{ System.out.println("Your age is allowed to drink");}
		else
			System.out.println("You age is not allowed to drink");
			rest = 21 - age;
			System.out.printf("In %d years you can drink", rest);
		
	}

}
