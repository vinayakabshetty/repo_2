package javaProgramsToPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateThroughArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add(0, "Mango");
		fruits.add(1, "Kiwi");
		fruits.add(2, "Grapes");
        
		
		// Using Iterator class
		Iterator<String> i = fruits.iterator();
		
		while(i.hasNext()) {
			System.out.println("Item is : "+i.next());
		}
		
		// Using advanced for loop
        for(String str : fruits) {
        	System.out.println("Item is : "+str);
        }

	}

}
