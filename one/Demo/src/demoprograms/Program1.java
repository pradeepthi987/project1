package demoprograms;

public class Program1 {
 
 
 public static void main(String[] args) {
	 String s = "nitin";
	 String rev = "";
	 
	 int len = s.length();
 for(int i=len-1;i>=0;i--)
 {
	 rev = rev + s.charAt(i);  
 }
	 if(s.equals(rev)) {
		 System.out.println("string is a palindrome");
	 }
	 else 
	 {
		 System.out.println("string is not palindrome");
	 }
 }
 
}

