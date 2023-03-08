package Joops;

public class Examplestatic {
    String name = "deepthi";
    static int x=25;
    public void add() {
    	System.out.println("hello");
    }
    public static void sum() {
    	System.out.println("hi");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examplestatic obj = new Examplestatic();
		obj.add();
		System.out.println(obj.name);
		Examplestatic.sum();
		System.out.println(Examplestatic.x);
	//	obj.sum();
	}

}
