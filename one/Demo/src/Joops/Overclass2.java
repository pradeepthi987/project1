package Joops;

public class Overclass2 extends Exampleoverride {
    public void run() {
    	System.out.println("car is running");
    }
    public void start() {
    	System.out.println("car started");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overclass2 obj = new Overclass2();
		obj.start();
		obj.stop();
		obj.run();
	}

}
