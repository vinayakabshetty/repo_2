package javaProgramsToPractise;
import java.util.HashMap;
import java.util.HashSet;

public class EncapsulationExample2 {
	
	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample();
		obj.getA();
		obj.getB();
		
		System.out.println("########################");
		
		obj.setA(10);
		obj.setB(20);
		
		obj.getA();
		obj.getB();
		
		System.out.println("########################");
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(3);
		hs.add(2);
		hs.add(4);
		hs.add(1);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
				
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
	}

}