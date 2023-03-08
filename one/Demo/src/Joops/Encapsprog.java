package Joops;

public class Encapsprog {
	private String empname;
	private int empage;
	private int ssn;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsprog obj = new Encapsprog();
		obj.setEmpage(25);
		obj.setEmpname("deepthi");
		obj.setSsn(123456);
		System.out.println(obj.getEmpage());
		System.out.println(obj.getEmpname());
		System.out.println(obj.getSsn());
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
