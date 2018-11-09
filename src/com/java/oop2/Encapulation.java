package com.java.oop2;

public class Encapulation {
	
	public int num;
	public String str;
	public double d1;
	public long l1;
	
	

}


class Child extends Encapulation{
	public void getOne() {
		Child c1 =new Child();
		c1.num = 10;
	}
	
}