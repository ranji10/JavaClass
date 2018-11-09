package com.java.enumdemo;

public class EnumDemo {
	
	public static void main(String[] args) {
		Directions dir = Directions.NORTH;
		if(dir==Directions.EAST) {
			System.out.println("Direction is east");
			
		}else if(dir==Directions.WEST) {
			System.out.println("Direction is WEST");
		}else if(dir==Directions.NORTH) {
			System.out.println("Direction is North");
			
		}else {
			System.out.println("Direction is South");
		}
		
		
	}

}

enum Directions{
	
	EAST,WEST,NORTH,SOUTH
}
