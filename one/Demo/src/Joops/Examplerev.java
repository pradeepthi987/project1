package Joops;

public class Examplerev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="nitin";
		String rev = "";
		int len = s.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
  if(s.equals(rev)) {
	  System.out.println("palindrome");
  }
  else {
	  System.out.println("not a palindrome");
  }
	}

}
