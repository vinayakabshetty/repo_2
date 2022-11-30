package javaProgramsToPractise;

import java.util.ArrayList;
import java.util.Iterator;

public class TraverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sunday");
		al.add("Monday");
		al.add("Tuesday");
		
		// Iterator is an object that can be used to loop through collections
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("########################");
		
		for(String str : al) {
			System.out.println(str);
		}
		
	}

}
