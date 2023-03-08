package Joops;

import java.util.Arrays;

public class Sechigharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {98,78,90,100,900,988,65};
  Arrays.sort(a);
  int l=a.length;
  System.out.println(Arrays.toString(a));
  System.out.println("second highest is:"+a[l-2]);
	}

}
