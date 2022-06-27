package com.bl.largestnumber;

import java.util.Scanner;

public class LargestNumber {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
		public void number(){
			if(a>=b&&a>=c) {
				System.out.println("The largest number is:" + a);
			}
			else if (b>=a&&b>=c) {
				System.out.println("The largest number is:" + b);	
			}
			else {
				System.out.println("The largest number is:" + c);
			}
			
		}
	public static void main(String[] args) {
		System.out.println("Enter the three no:");
		LargestNumber num = new LargestNumber();
		num.number();
	}

}
