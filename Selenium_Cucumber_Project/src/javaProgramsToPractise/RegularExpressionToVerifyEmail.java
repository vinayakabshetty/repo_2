package javaProgramsToPractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionToVerifyEmail {

	public static void main(String[] args) {
		String str = "+1javaTpoint@domain.co.in";
		
		String regex1 = "^(.+)@(.+)$";
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
        System.out.println(str +" : "+ matcher.matches()+"\n");   
	}

}
