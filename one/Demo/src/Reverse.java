
public class Reverse {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "deepthi";
		  String rev= " ";
		  int len = a.length();
 for(int i=len-1;i>=0;i--) {
	rev=rev+a.charAt(i);
 }
 System.out.println("reversed string :" + rev);
	}

}
