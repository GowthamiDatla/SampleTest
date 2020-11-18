package com.app.anonymous;

public class MethodOverloading {

	  public void methodA(int a)
	 {
	 System.out.println("Print A Value : " +a);
	 }
	 public void methodA(int a , int b)
	 {
	 System.out.println("Print B Value : " +a + " " +b);
	 }
	 public void methodA(int a, int b, int c)
	 {
	 System.out.println("Print C Value : " +a + " "+ b + " " +c);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading O = new MethodOverloading();
		O.methodA(20);
		O.methodA(20,30);
		O.methodA(20,30,40);
		}

}
