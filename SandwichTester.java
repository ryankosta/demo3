//imports
import static org.junit.Assert.*;
import org.junit.*;
public class SandwichTester {
	/**
	 * Test isSandwich method to 
	 * ensure sub is a valid sandwich
	 */
	@Test
	public void TestisSandwichSub(){
		assertTrue("Subs are sandwiches",Sandwich.isSandwich("sub"));
	}
}
