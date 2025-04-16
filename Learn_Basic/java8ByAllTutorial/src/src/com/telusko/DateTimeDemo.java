package src.com.telusko;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate d1 = LocalDate.of(1995, 4, 25);
		System.out.println(d1);
		LocalTime t = LocalTime.now();
		System.out.println(t);
	}

}
