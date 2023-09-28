import java.util.Scanner(System.in);


public class Main 
{
	pubic static void main(String[] args)
	{

		System.out.println("Please type your name");


		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.nextLine();

		System.out.println("Hello" + " " + input + " " + "Please type your age"); 

		int age = myScanner.nextInt();
		System.out.println(input +" " + age + " " + "years old"); 

		int yearsUntilRetire = 67 - age; 

		Systsem.out.println(input + " " + "you have" + " " + yearsUntilRetire +" " + "until you can retrie");


		myScanner.close();

	}










}
