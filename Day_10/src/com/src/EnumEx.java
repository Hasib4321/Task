package com.src;
enum Seasons{
	Summer("They are hot"),Winter("They are cold"),Rainy("There are rains"),Spring("Season of Kites");
 private String string;
	Seasons(String string) {
	this.string=string;	
	}
	public void Display() {
		System.out.println(string);
	}
}

public class EnumEx {

	public static void main(String[] args) {
		for(Seasons s:Seasons.values() ) {
			System.out.println(s);
			s.Display();
		}
		

	}

}
