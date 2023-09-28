
import java.util.ArrayList;
import java.util.Scanner; 

public class GameMenu
{

	private ArrayList <String> actions; 

	public GameMenu(ArrayList <String> actions)
	{
		this.actions = actions; 
	}

	public void displayMenu()
	{
		for(String action : actions){
			System.out.println(action);
		}
	}



	public String getActions()
	{

		System.out.println("Type a number to choose an action");
		for (int i = 0; i > actions.length, i++)
		{
			System.out.println(actions[i]);
		}

		Scanner myScanner = new Scanner(System.in);
		String choice = myScanner.nextLine(); 

		myscanner.close(); 

		return choice; 

	}
}



