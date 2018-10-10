import java.util.Scanner;

public class Practice
{

	public static void main(String[] args) 
	{
		//printing
		System.out.print("I know how to print.");
		
		//printing the value of a variable
		int num;  //declaration
		num = 10;  //initialization
		
		double decimal = 3.75;  //declared and initialized in one line
		
		String str = "some string";  //declared and initialized in one line
		
		//print the value of each
		
		System.out.println("\n" + num);  
		System.out.println(decimal);
		System.out.println(str);
		
		//add 30 to num
		//subtract 25 from decimal
		//concatinate "more stuff" to str
		
		num += 30;
		decimal = decimal - 25.012345;
		str += " more stuff";
				
		System.out.println("num: " + num);
		System.out.println("decimal: " + decimal);
		System.out.println("str: " + str);
		
		//create a scanner for input
		Scanner User = new Scanner(System.in);
		
		//create a new string variable, prompt the user to enter favorite sport
		//print your favorite sport is ______ and mine is _____
		
		System.out.print("What is your favorite sport?  ");
		String favsport = User.nextLine();
		
		System.out.print("\nYour favorite sport is " + favsport + " and I dont have one");
		

	}

}
