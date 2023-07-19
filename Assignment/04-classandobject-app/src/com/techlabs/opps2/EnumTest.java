package com.techlabs.opps2;


enum Color{
	RED,
	GREEN,
	BLUE,
	YELLOW,
	PINK;
	
	private Color() {
		
		System.out.println("Color is "+this.toString());
	}
	public void colorFunction() {
		System.out.println("Universal Color makes your life colorfull");
	}
	
}

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color c1=Color.RED;
		System.out.println(c1);
		for(Color color:Color.values()) {
			System.out.println(color);
		}
	}

}
