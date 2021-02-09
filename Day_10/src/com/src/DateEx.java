package com.src;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateEx {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		
		SimpleDateFormat sdf =new SimpleDateFormat();
		System.out.println(sdf.format(d));
		System.out.println(sdf.equals(d));
	}
}

