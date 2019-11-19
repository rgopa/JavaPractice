package com.core.java;

public class CountAlphaNum {

	public static void main(String[] args) {
		countAlphaNum("R@ghU&789");

	}

	private static void countAlphaNum(String string) {
		char[] arr = string.toCharArray();
		int alpha = 0, num = 0;
		
		for(Character ch: arr) {
			if(Character.isDigit(ch)) {
				System.out.println(ch+ "is digit");
				num++;
			}else if(Character.isLetter(ch)){
				System.out.println(ch+ "is Alpha");
				alpha++;
			}
		}
		System.out.println("Alphabets: "+alpha+"\n Digits: "+num);
		
	}

}
