package Joops;

public class Overl {

	public void sum() {
		System.out.println("hi");
	}
	public void sum(int x) {
		System.out.println("hello");
		System.out.println(x);
	}
	public void sum(int x,int y) {
		System.out.println("add");
		System.out.println(x+y);
	}
public static void main(String[] args) {
	Overl obj = new Overl();
	obj.sum();
	obj.sum(5);
	obj.sum(6, 4);
}
}
