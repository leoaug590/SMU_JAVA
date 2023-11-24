package com.section03;

import java.util.Date;
import java.text.DateFormat;

public class Example13 {
	public static void main(String args[]) {
		Date currentDate = new Date();
		System.out.println("현재 날짜 : " + currentDate);

		String dateToStr = DateFormat.getInstance().format(currentDate);
		System.out.println("DateFormat.getInstance(): " + dateToStr);

		dateToStr = DateFormat.getDateInstance().format(currentDate);
		System.out.println("DateFormat.getDateInstance(): " + dateToStr);

		dateToStr = DateFormat.getTimeInstance().format(currentDate);
		System.out.println("DateFormat.getTimeInstance(): " + dateToStr);

		dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
		System.out.println("DateFormat.getDateTimeInstance(): " + dateToStr);

		dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
		System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);

		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(currentDate);
		System.out.println("DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): " + dateToStr);
	}
}