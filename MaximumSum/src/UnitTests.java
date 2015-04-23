import static org.junit.Assert.*;

import org.junit.Test;


public class UnitTests {

	@Test
	public void test() {
		int[][] array1 = 
			{ 
				{ 3, -4,  5}, 
				{ 7,  2, -1}, 
				{-4,  1,  -7} 
			};
		
		assertEquals(8, Main.GetMaximumSum(array1) );
	}

}
