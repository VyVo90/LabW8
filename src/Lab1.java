import java.util.Scanner;



public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userbirthday, max = 2015;
		String surname;
		int age = 0;
		
		Scanner user = new Scanner(System.in);
		
		System.out.print("What is your name?");
		surname = user.next();
		System.out.println("What year were you born in?");
		userbirthday = user.nextInt();
		age = 2015 - userbirthday;
		
		
		System.out.println("Hello, " + surname + " You are " +age);
		
	

}
}