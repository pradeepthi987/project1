package demoprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = "deepthii";
LinkedHashMap<Character,Integer>c =new LinkedHashMap();
   for(int i=0;i<s.length();i++) {
	   Character ch = s.charAt(i);
	   if(c.containsKey(ch)) {
		   c.put(ch, c.get(ch)+1);
 	   }
	   else
	   {
	  c.put(ch, 1);
   }
	}
System.out.println(c);
}
}