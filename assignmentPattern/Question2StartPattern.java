package com.assignmentPattern;

public class Question2StartPattern {
	public static void main(String args[]) {
		
		int num=7;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i>=j || i==num-1 || j==0) {
			     System.out.print("*");		
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<num;j++) {
				if(i==num-1 || j==num-1 || i+j>=num-1) {
			     System.out.print("*");		
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<num;j++) {
				if(i==0 || j==0 || i+j<=num-1) {
			     System.out.print("*");		
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<num;j++) {
				if(i==0 || j==num-1 || i<=j) {
			     System.out.print("*");		
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
