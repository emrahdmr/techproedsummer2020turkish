package day18statickeyword;

import pratikyapma.Pratik02;

public class Odev03 {


	int x = 3;
	int y = 5;
	
	Odev03(){
		x += 1;
		System.out.println("-x" + x);	
	}
	Odev03 (int i) {
		this();
		this.y =i;
		x +=y;
		System.out.println("-x" + x);
	}
	Odev03(int i, int i2) {
		this(3);
		this.x -=4;
		System.out.println("-x " + x);
	}
   public static void main(String [] args) {
	   Odev03 mc1 = new Odev03(4,3);
   }

}
