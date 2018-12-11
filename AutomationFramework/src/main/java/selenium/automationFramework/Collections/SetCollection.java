package selenium.automationFramework.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

		
		public void main (String [] args) {
			
			
			Set set = new HashSet();
				
			String s1 = new String("selenium");
			String s2 = new String("Webdriver");
			String s3= "SDET";
			int x = 33;
			int age = 29;
			
			//Add the objects to the list
			set.add(s1);
			set.add(s2);
			set.add(s3);
			
			//Size of the collection/set
			System.out.println("The size of the set is " + set.size());
			
			for(Object o : set) {
				System.out.println("The alternative way to get the size of the set" + o);
			}
			
		}

		
}
