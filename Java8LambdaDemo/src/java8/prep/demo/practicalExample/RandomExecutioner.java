package java8.prep.demo.practicalExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomExecutioner {
	
	// This executioner has the logic to iterate on any list conditionally
	// But this executioner is as loosely coupled as possible
	// This will neither have the list in it
	// Nor will it have the specific filter condition
	// Both of these will be fed to it via an outer logic

	public static void main(String[] args) {
		
		Condition condition = (s) -> {
			if(s.startsWith("A")) {
				return true;
			}
			return false;
		};
		
		List<String> list = new ArrayList<String>(); 
		list = Arrays.asList("Abhilash","Aloke","Sanchita","Swarnali","Aniket");
		
		iterateAndApplyCondition(list, condition);
		

	}
	
	static void iterateAndApplyCondition(List<String> list, Condition conditionLambda) {
		for(String s: list) {
			
			if(conditionLambda.test(s)) {
				System.out.println(s);
			}
			
		}
	}
	
	interface Condition {
		public boolean test(String s);
	}

}
