

public class Main
{
	public static void main (String[] args)
	{
		ArrayList <String> actions = new ArrayList<>(); 
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu gameMenu = new GameMenu(actions);
		gameMenuMenu();


		String userChoice = GameMenu.getAction();
		System.out.println(userChoice);



	}

	public static void doAction(int action)
	{
		switch(action)
		{
		case 1;
			System.out.println("String game");
			break;
		case 2; 
			System.out.println("Fetching game data");
			break; 
		case 3; 
			System.out.println("Game puase");
			break; 
		case 4; 
			System.out.println("Ending game"); 
			break; 
		default; 
			System.out.println("Invalied action"); 
			break; 

		}
	}

}

