import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Trey
 *
 */
public class UnitTests {

	@Test
	public void test1() {
		// {{“the”, “a”, “some”}, {“quick”, “brown”}, {“fox”, “dog”, “cow”}}
		List<List<String>> testListOne = new ArrayList<List<String>>();
		List<String> zero = new ArrayList<String>();
		zero.add("the");
		zero.add("a");
		zero.add("some");
		List<String> one = new ArrayList<String>();
		one.add("quick");
		one.add("brown");
		List<String> two = new ArrayList<String>();
		two.add("fox");
		two.add("dog");
		two.add("cow");
		testListOne.add(zero);
		testListOne.add(one);
		testListOne.add(two);
		
		Main.TestBuildStrings(testListOne);
	}

	@Test
	public void test2(){
		// {{the, a, my}, {brown, apple, car}, {cat, mustache, raisin, fast}}
		List<List<String>> testListOne = new ArrayList<List<String>>();
		List<String> zero = new ArrayList<String>();
		zero.add("the");
		zero.add("a");
		zero.add("my");
		List<String> one = new ArrayList<String>();
		one.add("brown");
		one.add("apple");
		one.add("car");
		List<String> two = new ArrayList<String>();
		two.add("cat");
		two.add("mustache");
		two.add("raisin");
		two.add("fast");
		testListOne.add(zero);
		testListOne.add(one);
		testListOne.add(two);
		
		Main.TestBuildStrings(testListOne);
	
	}
}
