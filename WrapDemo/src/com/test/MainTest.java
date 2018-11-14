package com.test;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Waiter waiter = new waitress();
		waiter.service();*/
		WaitressWrap waitresswrap = new WaitressWrap(new waitress());
		
		waitresswrap.service();
		
		
	}

}
