package testPackage;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import information.CodeMakerPattern;
import information.Colours;
import information.GameInfo;

public class TestCodeMakerPattern {

	public CodeMakerPattern codeMakerSetup(GameInfo gameInfo) {
		
		CodeMakerPattern cMP = new CodeMakerPattern(gameInfo);
		
		return cMP;
	}

	/**
	 * test that the code maker is setup as human
	 */
	@Test
	public void testSetPattern()
	{
		GameInfo gameInfo = new GameInfo();
		
		CodeMakerPattern cMP = codeMakerSetup(gameInfo);
		
		ArrayList<Colours> testColours  = new ArrayList<Colours>(); // colours to check against
		testColours.add(Colours.GREEN);
		testColours.add(Colours.BLUE);
		testColours.add(Colours.RED);
		testColours.add(Colours.YELLOW);
	
		Assert.assertEquals(testColours, cMP.getPattern());
	}
	
}
