package com.loops;

public class eg5 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for (int s=1;s<i;s++){
			System.out.print(" ");
		} 
		for (int j=5;j>=i;j--){
			System.out.print("*");
		} 
		System.out.println(" ");
	}
	
	for (int i=5;i>=1;i--)
	{
		for (int s=1;s<i;s++){
			System.out.print(" ");
		} 
		for (int j=5;j>=i;j--){
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
	
	
	
	
	
}}
