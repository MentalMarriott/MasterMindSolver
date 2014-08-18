package information;

public class GameInfo {
	boolean humanCodeMaker = false;
	
	int numberOfGuesses = 10;
	
	String codeMakerName = "";

	/**
	 * returns if human player is code maker
	 * @return
	 */
	public boolean isHumanCodeMaker()
	{
		return this.humanCodeMaker;
	}
	
	/**
	 * set whether a human or the computer is setting the pattern to be guessed
	 * @param humanCodeMaker
	 */
	public void setHumanCodeMaker(boolean humanCodeMaker)
	{
		this.humanCodeMaker = humanCodeMaker;
	}
	
	/**
	 * Sets the player of the code maker, whether it be AI or human
	 * @param name
	 */
	public void setCodeMakerName(String name){
		this.codeMakerName = name;
	}
	
	
}
