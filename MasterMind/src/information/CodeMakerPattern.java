package information;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeMakerPattern {

	ArrayList<Colours> pattern;
	Scanner sc;
	MainMenu mainMenu;
	
	/**
	 * Creates the codemakers pattern either from user input or from random
	 * computer colours
	 */
	public CodeMakerPattern(GameInfo gameInfo) {
		sc = new Scanner(System.in);
		
		pattern = new ArrayList<Colours>();
		
		mainMenu = new MainMenu(gameInfo);
		
		setup(pattern, gameInfo);
	}

	/**
	 * sets up the pattern to guess whether it be AI or human, true means human
	 * @param pattern2
	 * @param gameInfo
	 */
	private void setup(ArrayList<Colours> pattern, GameInfo gameInfo) {
		if (gameInfo.isHumanCodeMaker()) {
			for (int i = 0; i < 4; i++) {
				int peg = i+1;
				System.out.println("\n\nPlease enter colour for peg " + peg
						+ " from the left\n");
				colourSelect(pattern, i);
			}
		} else {
			randomSetup(pattern, gameInfo);
		}
	}

	public ArrayList<Colours> getPattern() {
		return pattern;
	}

	public void setPattern(ArrayList<Colours> pattern) {
		this.pattern = pattern;
	}

	/**
	 * Creates a random pattern and creates a AI as the code maker
	 * 
	 * @param pattern2
	 * @param gameInfo
	 */
	private void randomSetup(ArrayList<Colours> pattern, GameInfo gameInfo) {
		gameInfo.setCodeMakerName("AI");

		pattern.add(0, Colours.getRandom());
		pattern.add(1, Colours.getRandom());
		pattern.add(2, Colours.getRandom());
		pattern.add(3, Colours.getRandom());
	}

	/**
	 * lets the user select colour for each peg starting far left
	 * @param pattern
	 * @param peg
	 */
	private void colourSelect(ArrayList<Colours> pattern, int peg) {
		boolean validSelection = false;
		
		// NOTE TO SELF - MAKE SO RETURNS COLOUR CAN THEN USE FOR PLAYER GUESSING AS WELL

		while (!validSelection) {
			System.out.println("RED, GREEN, BLUE, YELLOW, BLACK, WHITE\n");

			String colour = sc.next();
			colour = colour.toUpperCase();

			switch (colour) {
			case "RED":
				pattern.add(peg, Colours.RED);
				validSelection = true;
				break;

			case "GREEN":
				pattern.add(peg, Colours.GREEN);
				validSelection = true;
				break;

			case "BLUE":
				pattern.add(peg, Colours.BLUE);
				validSelection = true;
				break;

			case "YELLOW":
				pattern.add(peg, Colours.YELLOW);
				validSelection = true;
				break;

			case "BLACK":
				pattern.add(peg, Colours.BLACK);
				validSelection = true;
				break;

			case "WHITE":
				pattern.add(peg, Colours.WHITE);
				validSelection = true;
				break;

			default:
				System.out.println("\nUn recognised colour please try again\n");
				break;
			}
		}
	}

}
