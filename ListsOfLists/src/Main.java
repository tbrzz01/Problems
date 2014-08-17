import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Trey
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<String> TestBuildStrings(List<List<String>> list){
		return buildStrings(list);
	}
	
	/**
	 * @param list 
	 */
	private static List<String> buildStrings(List<List<String>> list){
		List<String> strColl = new ArrayList<String>();
		if(list != null && list.size() > 0){
			traverse("", list, 0, list.size(), strColl);
		}
		
		return strColl;
	}
	
	/**
	 * 
	 * @param s
	 * @param strings
	 * @param currentLevel
	 * @param maxLevel
	 */
	private static void traverse(String s, List<List<String>> strings, int currentLevel, int maxLevel, List<String> coll){
		if(currentLevel >= maxLevel){
			System.out.println(s);
			coll.add(s);
		}
		else{
			for(String word : strings.get(currentLevel)){
				traverse(s + " " + word, strings, currentLevel + 1, maxLevel, coll);
			}
		}
	}
	

}
