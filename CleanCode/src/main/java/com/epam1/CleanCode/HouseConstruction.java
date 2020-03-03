package com.epam1.CleanCode;

	import java.io.FileDescriptor;
	import java.io.FileOutputStream;
	import java.io.PrintStream;
	import java.util.Scanner;

	public class HouseConstruction {

		PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		public void constructionCost() {
			Scanner sc = new Scanner(System.in);
	    	ps.println("Enter the area of the house");
	    	
	    	double area = sc.nextDouble();
	    	double totalCost;
	    	
	    	ps.println("Enter the value 1.Standard materials 2.Above standard materials 3.High standard materials "
	    			+ "4.High standard material and fully automated home 5.");
	    	int choice = sc.nextInt();
	    	double cost[] = {1200, 1500, 1800, 2500};
	    	totalCost = area * cost[choice - 1];
	    	
	    	ps.println("The total amount to construct a house is " + totalCost);
		}
}
