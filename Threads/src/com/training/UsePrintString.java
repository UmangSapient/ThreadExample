/**
 * 
 */
package com.training;

/**
 * @author uagar1
 *
 */
public class UsePrintString implements Runnable 
{
	private String str1,str2;
	 
	
	
	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		Thread t= new Thread(this);
		t.start();
	}



	public UsePrintString() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		
		// TODO Auto-generated method stub
PrintStrings.printString(str1, str2);
	}

}
