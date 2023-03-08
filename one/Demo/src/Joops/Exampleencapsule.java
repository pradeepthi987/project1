package Joops;

public class Exampleencapsule {
   private String name;
   private int age;
   private int ssn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exampleencapsule emp = new Exampleencapsule();
		emp.setAge(19);
		emp.setName("sohang");
		emp.setSsn(123345);
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSsn());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
