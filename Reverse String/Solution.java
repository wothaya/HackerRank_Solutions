package com.hackerrank.string;

public class ReverseString2 {
	
	
	public static void main(String args[]) {
		
		String str = "My name is Maggie";
		
		String reverseStr = "";
		
		for(int i = str.length()-1; i>=0; i--){
			reverseStr = reverseStr+str.charAt(i);
		}
		
		System.out.println(reverseStr);
	}

}
