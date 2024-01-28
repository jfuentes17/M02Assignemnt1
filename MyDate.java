/*
 * Program Name: MyDateTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 28 January 2024
 * Purpose: This program creates two MyDate objects and displays their year, month, and day.
 */

import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate 
{
	private int year;
	private int month;
	private int day;
	//These are the data fields.
	
	public MyDate()
	{
		GregorianCalendar greg = new GregorianCalendar();
		year = greg.get(GregorianCalendar.YEAR);
		month = greg.get(GregorianCalendar.MONTH);
		day = greg.get(GregorianCalendar.DAY_OF_MONTH);
	}
	//This is the no-arg constructor that creates a MyDate object for the current date.
	
	public MyDate(long elapsedTime)
	{
		setDate(elapsedTime);
	}
	//This is a constructor that constructs a MyDate object with the specified
	//elapsed time since midnight, January 1, 1970, in milliseconds.
	
	public MyDate(int year, int month, int day) 
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//This is a constructor that constructs a MyDate object with the specified
	//year, month, and day.
	
	public int getYear() 
	{
		return year;
	}
	public int getMonth() 
	{
		return month;
	}
	public int getDay() 
	{
		return day;
	}
	//These are the three getters for the data fields year, month, and day.
	
	public void setDate(long elapsedTime) 
	{
		GregorianCalendar greg = new GregorianCalendar();
		greg.setTimeInMillis(elapsedTime);
		year = greg.get(GregorianCalendar.YEAR);
		month = greg.get(GregorianCalendar.MONTH);
		day = greg.get(GregorianCalendar.DAY_OF_MONTH);
	}
	//This set a new date for the object using the elapsed time.
}
