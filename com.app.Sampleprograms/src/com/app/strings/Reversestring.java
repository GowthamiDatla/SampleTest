package com.app.strings;

public class Reversestring {
	
	public static void main(String[] args) {
		
		String S = "Gowthami";
		System.out.println("String name :" +S);
		StringBuilder Sb = new StringBuilder();
		Sb.append(S);
		Sb.reverse();
		System.out.println("String reverse name:" +Sb);
		
		String S2 = "Avanthika";
		char chars[] = S2.toCharArray();
		//getting error
		//for(int i= chars.length-1; i=0; i--) 
	         {
			//System.out.println(chars[i]);
		}
		
	                           	
	
	}
	

}
