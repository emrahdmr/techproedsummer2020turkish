package day18statickeyword;

import pratikyapma.Student;

public class Odev02_Student {
	
		 int number;
		 String name;
		 static String college ="ITS";

		 Odev02_Student(int r, String n, String college){
		 number = r;
		 name = n;
		 college = college;
		 }
		 public static void main(String args[]){

			 Odev02_Student s1 = new Odev02_Student(111,"Karan", "MIT");
			 Odev02_Student s2 = new Odev02_Student(222,"Aryan", "Harvard");

		 System.out.println(s1.number);
		 System.out.println(s2.number);

		 System.out.println(s1.name);
		 System.out.println(s2.name);

		 System.out.println(s1.college);
		 System.out.println(s2.college);
		
		}
}
