package com.src;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueEx {

	public static void main(String[] args) {
		LinkedBlockingQueue lbq=new LinkedBlockingQueue(4);
		lbq.add(new Student(16,"Avi","Goa"));
		lbq.add(new Student(17,"Jaya","Leh"));
		lbq.add(new Student(18,"Arush","Delhi"));
		System.out.println(lbq);
		System.out.println(lbq.remove());
		System.out.println(lbq);
		

	}

}
