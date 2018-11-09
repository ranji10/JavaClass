package com.java.generics;

public class Products<L1,L2>{
	
	public static void main(String[] args) {
		
		
		Product<String>productL1= new Product<String>("Product one has been created");
		Product<String>productL2= new Product<String>("Product two has been created");
		System.out.println(productL1);
		System.out.println(productL2);
		
		Test<Integer,String>productL1 = new Produ<Integer,String>(10,"TestOne");
		Test<String,String>productL2 = new Test<String,String>("TestTwo","TestTwo");
		
		testOne.print();
		testTwo.print();
	}
	
	L1 itemOne;
	L2 itemTwo;//create two obj
	
	
	public Products(L1 itemOne, L2 itemTwo) {//create constructor
		super();
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
	}
	public L1 getItemOne() {//create getter and setter
		return itemOne;
	}
	public void setItemOne(L1 itemOne) {
		this.itemOne = itemOne;
	}
	public L2 getItemTwo() {
		return itemTwo;
	}
	public void setItemTwo(L2 itemTwo) {
		this.itemTwo = itemTwo;
	}
	@Override//create string
	public String toString() {
		return "Products [itemOne=" + itemOne + ", itemTwo=" + itemTwo + "]";
	}
	
	

}
