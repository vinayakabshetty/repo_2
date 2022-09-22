package javaProgramsToPractise;

import java.util.ArrayList;

public class listExample {

	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<String>();
        numbers.add(0, "zero");
        numbers.add(1, "one");
        numbers.add(2, "two");
        
        for (String x : numbers) {
            System.out.println(x);
        }
	}

}
