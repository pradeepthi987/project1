
public class Staticchild extends Staticexample {
	String a = "deepu";
	public void meth2() {
		
		super.meth();
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticchild obj = new Staticchild();
		obj.meth2();
	}

}
