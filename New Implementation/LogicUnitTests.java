import static org.junit.Assert.*;
import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogicUnitTests {

	@Test
	public void testRoll1() {
	    Dice dice = new Dice();
	    dice.roll();
	    assertTrue(dice.isRollable());
	    assertFalse(dice.getValue()<1);
	}
	
	@Test
	public void testRoll2() {
	    Dice dice = new Dice();
	    assertTrue(dice.isRollable());
	    assertTrue(dice.getValue()<1);
	}
	
	@Test
	public void testRoll3() {
	    Dice dice = new Dice();
	    dice.roll();
	    assertTrue(dice.isRollable());
	    assertFalse(dice.getValue()<1);
	}
}