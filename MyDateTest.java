/*
 * Program Name: MyDateTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: This program creates two MyDate objects and displays their year, month, and day.
 */

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class MyDateTest 
{
	public static void main(String[] args) 
	{
		MyDate firstDate = new MyDate();
		MyDate secondDate = new MyDate(34355555133101L);
		//These are the two MyDate objects.
		
		System.out.println("First Date: " + firstDate.getDay() + "/"
				+ firstDate.getMonth() + "/" + firstDate.getYear());
		System.out.println("Second Date: " + secondDate.getDay() + "/"
				+ secondDate.getMonth() + "/" + secondDate.getYear());
	}
} 



/*
 *        MyDate UML
 * --------------------------
 * -year: int
 * -month: int
 * -day: int
 * --------------------------
 * +MyDate()
 * +MyDate(elapsedTime: long
 * +MyDate(year: int, month: 
 * 		int, day: int)
 * +getYear(): int
 * +getMonth(): int
 * +getDay(): int
 * setDate(elapsedTime: long)
 * --------------------------
*/