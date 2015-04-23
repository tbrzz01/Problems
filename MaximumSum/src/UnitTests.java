import static org.junit.Assert.*;

import org.junit.Test;


public class UnitTests {

	@Test
	public void test() {
		int[][] array0 =
			{
				{ 0, -2, -7, 0},
				{ 9,  2, -6, 2},
				{-4,  1, -4, 1},
				{-1,  8,  0,-2}
			};
		
		assertEquals(8, Main.GetMaximumSum(array0) );
		
		int[][] array1 = 
			{ 
				{ 3, -4,  5}, 
				{ 7,  2, -1}, 
				{-4,  1,  -7} 
			};
		
		assertEquals(8, Main.GetMaximumSum(array1) );
	}

}
