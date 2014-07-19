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
	
	public static void TestBuildStrings(List<List<String>> list){
		buildStrings(list);
	}
	
	/**
	 * @param list 
	 */
	private static void buildStrings(List<List<String>> list){
		// TODO implemenet
		if(list != null && list.size() > 0){
			traverse("", list, 0, list.size());
		}
	}
	
	/**
	 * 
	 * @param s
	 * @param strings
	 * @param currentLevel
	 * @param maxLevel
	 */
	private static void traverse(String s, List<List<String>> strings, int currentLevel, int maxLevel){
		if(currentLevel >= maxLevel){
			System.out.println(s);
		}
		else{
			for(String word : strings.get(currentLevel)){
				traverse(s + " " + word, strings, currentLevel + 1, maxLevel);
			}
		}
	}
	

}
