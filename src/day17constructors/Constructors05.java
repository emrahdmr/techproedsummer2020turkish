package day17constructors;

public class Constructors05 {

	public static void main(String[] args) {
	
		Constructors04 obj1 = new Constructors04();
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);//num2 static oldugundan object kullanarak cagirmami Java istemiyor.
		System.out.println(Constructors04.num2);//Class ismi ile cagirmami Java guzel karsiladi.
	}
}