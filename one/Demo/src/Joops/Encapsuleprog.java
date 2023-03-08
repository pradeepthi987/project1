package Joops;

public class Encapsuleprog {
     private String name;
     private int age;
     private int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsuleprog col = new Encapsuleprog();
		col.setAge(20);
		col.setId(123456);
		col.setName("deepu");
		System.out.println(col.getAge());
		System.out.println(col.getId());
		System.out.println(col.getName());
		
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
