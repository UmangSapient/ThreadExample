package com.training;

import java.io.IOException;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Started");
		Thread t=new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Reading");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished reading");
			}
			}; // To create anonymous class
		
			
		t.start();
		System.out.println("Is it a live thread "+t.isAlive());
	
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Is it a live thread "+t.isAlive());
		
		System.out.println("Main Finished");
	}

}
