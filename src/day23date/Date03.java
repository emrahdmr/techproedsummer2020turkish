package day23date;

import java.time.LocalTime;

public class Date03 {
	
	public static void main(String[] args) {
		// Time Manipulation (Zamani degistirecegiz)
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//plus ve minus methodlarini saat, dakika ve saniye icin kullaniniz
		System.out.println(time.plusSeconds(35));
		System.out.println(time.plusMinutes(4));
		System.out.println(time.plusHours(2));
		
		System.out.println(time.minusSeconds(11));
		System.out.println(time.minusMinutes(3));
		System.out.println(time.minusHours(1));
	}
}
