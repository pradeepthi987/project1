
public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s ="deepthi";
     String rev="";
     int len = s.length();
     for(int i=len-1;i>=0;i--) {
    	 rev=rev+s.charAt(i);
     }
     System.out.println("reverser string is :"+ rev);
	}

}
