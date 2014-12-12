import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Trey
 *
 */
public class UnitTests {
	
	@Test
	public void test1(){
		assertFalse(Main.groupSum(0, null, 0));
		
		assertTrue(Main.groupSum(0, new int[] {2,4,8}, 10));
		assertTrue(Main.groupSum(0, new int[] {3,5,7,9,10}, 26));
		assertFalse(Main.groupSum(0, new int[] {3,5,7,9,10}, 18));
	}
}
