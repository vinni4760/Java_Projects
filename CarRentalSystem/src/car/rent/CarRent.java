package car.rent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CarRent {
	
	public static void main(String[] args) {

		System.out.println("====Welcome to Car Rent===");
		
		System.out.println("---Please Enter Options---");
		System.out.println("Press 1 for taking car on rent");
		System.out.println("Press 2 for submiting the car");
		Scanner scn = new Scanner(System.in);
		int option = scn.nextInt();
		if(option==1) {
			Rentoperation.showAllCars();
		}
		else
			System.out.println("Thanks for visiting");
		
	}

}
