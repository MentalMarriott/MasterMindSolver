package information;

import java.util.Scanner;

public class MainMenu {

	public MainMenu(GameInfo gameInfo)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nIs the code maker human Y/N");
		
		String human = sc.next();
		human = human.toUpperCase();
		
		if(human.charAt(0) == 'Y'){
			gameInfo.setHumanCodeMaker(true);
		}
	}
}
