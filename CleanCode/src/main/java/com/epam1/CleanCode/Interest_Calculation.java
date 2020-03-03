package com.epam1.CleanCode;


import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Interest_Calculation {

	PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));

	public void takeInput() {
		Scanner sc = new Scanner(System.in);
		ps.println("Enter the principle amount: ");
		double principle = sc.nextDouble();
		ps.println("Enter the time period : ");
		double timePeriod = sc.nextDouble();
		ps.println("Enter the rate: ");
		double rate = sc.nextDouble();
		printInterest(principle, timePeriod, rate);
	}
	
	public void printInterest(double principle, double timePeriod, double rate) {
		ps.println("The simple interest = " +((principle * timePeriod * rate) / 100));
		ps.println("The compound interest = " +((principle * Math.pow(1 + (rate / 100), timePeriod)) - principle));
	}
}
