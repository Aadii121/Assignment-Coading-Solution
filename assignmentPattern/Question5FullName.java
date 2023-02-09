package com.assignmentPattern;

public class Question5FullName {
	
	public static void main(String args[]) {
		int num=7;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i==0 && j>0 && j<(num-1)/2 || j==0 && i>0 || j==(num-1)/2 && i>0 || i==(num-1)/2 && j<(num-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<num;j++) {
				if(i==0 && j>0 && j<(num-1)/2 || j==0 || i==num-1 && j<(num-1)/2 || j==(num-1)/2 && i>0 && i<num-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<num;j++) {
				if(i==0 || i==num-1 || j==(num-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<num;j++) {
				if(i==0  || j==(num-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<num;j++) {
				if(i==j && j<=(num-1)/2 || i+j==num-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<num;j++) {
				if(i==0 && j>0 && j<(num-1)/2 || j==0 && i>0 || j==(num-1)/2 && i>0 || i==(num-1)/2 && j<(num-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("      ");
			for(int j=0;j<num;j++) {
				if(i==j && j<=(num-1)/2 || i+j==num-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<num;j++) {
				if(i==0 && j>0 && j<(num-1)/2 || j==0 && i>0 || j==(num-1)/2 && i>0 || i==(num-1)/2 && j<(num-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<num;j++) {
				if(i==0 && j>0 && j<(num-1)/2 || j==0 || i==num-1 && j<(num-1)/2 || j==(num-1)/2 && i>0 && i<num-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<num;j++) {
				if(i==0 && j>0 && j<(num-1)/2 || j==0 && i>0 || j==(num-1)/2 && i>0 || i==(num-1)/2 && j<(num-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<num;j++) {
				if(i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<num;j++) {
				if(i+j==num-2) {
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
