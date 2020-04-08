package com.learn.core.datatypes.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FromDateToString {
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss", Locale.US);
		String strDate = dateFormat.format(date);
		System.out.println(strDate);
	}
}
