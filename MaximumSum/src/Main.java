import java.io.*;
import java.util.*;
/**
 * 
 */

/**
 * @author Trey
 * Problem : http://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=3&page=show_problem&problem=44
 */
public class Main {

	public static String ReadLn(int maxLg)
	{
		byte lin[] = new byte [maxLg];
        int lg = 0, car = -1;
        String line = "";

        try
        {
            while (lg < maxLg)
            {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin [lg++] += car;
            }
        }
        catch (IOException e)
        {
            return (null);
        }

        if ((car < 0) && (lg == 0)) return (null);  // eof
        return (new String (lin, 0, lg));		
	}
	
	public static int[][] GetArray()
	{
		String input;
		StringTokenizer idata;
		int n = -1;
		int[][] array = null;
		int i = 0;
		int j = 0;
		
        while ((input = Main.ReadLn (255)) != null)
        {
        	idata = new StringTokenizer (input);
        	if(n < 0)
        	{
        		// set n
        		n = Integer.parseInt(idata.nextToken());
        	}
        	else
        	{
        		// build array
        		if(array == null) array = new int[n][n];
        		
        		while(idata.hasMoreElements()){
        			array[i][j] = Integer.parseInt(idata.nextToken());
        			j++;
        			if(j == n){
        				j = 0;
        				i++;
        				if(i == n)
        					break;
        			}
        		}
        	}        	
        }
		
		return array;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.setIn(new FileInputStream("/Users/Trey/Problems/MaximumSum/Input/test.in"));
		}
		catch(Exception exc)
		{
			System.out.println(exc.toString());
		}
		int[][] array = Main.GetArray();
		if(array == null){
			System.out.println("Array is null");
		}
		System.out.println(GetMaximumSum(array));
	}

	public static int GetMaximumSum(int[][] array){
		int maxSum = 0;
		
		return maxSum;
	}
}
