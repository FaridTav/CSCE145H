// Copyright 2024 Farid Tavakoli

import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		Scanner console = new Scanner(System.in);
		
		
		String name;
		System.out.print("What is your name? ");
		name = console.nextLine();
		
		System.out.println("Hello, " + name +"!\nWelcome to Programming.");
	
		int number;
		System.out.print("Enter an integer: ");
		number = console.nextInt();
		System.out.println("Twice " + number + " is " + (number + number));
		
		
	}

}
