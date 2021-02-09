package com.src;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {

	

	public static void main(String[] args) {
		ArrayBlockingQueue abq=new ArrayBlockingQueue(5);
		abq.add(new Student (12,"abd","algeria"));
		abq.add(new Student (13,"arun","Sweden"));
		abq.add(new Student (14,"jaya","Lasvegas"));
		System.out.println(abq);
		System.out.println(abq.remove());
		System.out.println(abq);
		
		

	}

}
