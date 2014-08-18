package information;


public enum Colours {

	RED, GREEN, BLUE, YELLOW, BLACK, WHITE;

	 public static Colours getRandom() {
	        return values()[(int) (Math.random() * values().length)];
	    }
	
}
