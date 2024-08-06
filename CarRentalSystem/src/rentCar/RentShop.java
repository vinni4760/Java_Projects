package rentCar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RentShop {
	
	private List<Car> car_list;
	private List<Customer> cust_list;
	private List<RentCar> rent_car;
	
	public RentShop() {
		this.car_list= new ArrayList<Car>();
		this.cust_list= new ArrayList<Customer>();
		this.rent_car=new ArrayList<RentCar>();
	}
	
	public void addCar(Car car) {
		this.car_list.add(car);
	}
	public void addCust(Customer cust) {
		this.cust_list.add(cust);
	}
	
	public void rentCar(Car car,Customer cust,int days) {	
		car.rent();
		RentCar rentcar = new RentCar(car, cust, days);
		rent_car.add(rentcar);
		System.out.println("****===Happy Journey===****");
		System.out.println(" ");
	}
	
	public void returnRentalCar(Car car,Customer cust) {
		
		for(RentCar rentcar:rent_car) {
			if(rentcar.getCar().equals(car)&&rentcar.cust().equals(cust)) {
				car.submitCar();
				System.out.println("===Car Returned Successfully===");
			}
		}
		
	}
	
	
		public void Carmenu() {
			while (true) {
			System.out.println("\t _____Welcome to Shyam Tours and Travelers_________");
			System.out.println("\s--Choose Options--");
			System.out.println("-> 1 for Rent Car");
			System.out.println("-> 2 for Return Car");
			System.out.println("-> 3 Exit\n");
			Scanner scn = new Scanner(System.in);
			int option = scn.nextInt();
			
			if(option==1) {
				System.out.println("\s--Enter your Name");
				String cust_name = scn.next();
				System.out.println("--Enter Contact");
				Long cust_phone = scn.nextLong();
				System.out.println("==Cars Available For Rent==");
				for(Car car:car_list) {
					if(car.isavailableforRent()) {
						System.out.println("\s"+car.getCarid()+"\s"+car.getCarname()+"\s"+car.getCarmodel());
					}
				}
				
				System.out.println("\s==Enter Car Id to rent==");
				String carid= scn.next();
				System.out.println("\s==Enter Number of days");
				int days = scn.nextInt();
				Customer cust_info = new Customer(new Random().nextInt(100), cust_name, cust_phone);
				cust_list.add(cust_info);
				Car checkcar = null;
				for(Car car:car_list) {
					if(car.getCarid().equalsIgnoreCase(carid)) {
						checkcar = car;
						break;
					}
					else {
						System.out.println("*Enter a valid car id\n");
						break;
					}
				}
				
				if(checkcar!=null) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("\s==Customer Info ===");
					System.out.println("\sCustomer id     :\s"+cust_info.getCustid());
					System.out.println("\sCustomer Name   :\s"+cust_info.getCustName());
					System.out.println("\sCustomer Contact:\s"+cust_info.getcustContact());
					System.out.println();
					System.out.println("==Car Info ===");
					System.out.println("\sCar Id          :\s"+checkcar.getCarid());
					System.out.println("\sCar Name        :\s"+checkcar.getCarname());
					System.out.println("\sCar Model       :\s"+checkcar.getCarmodel());
					System.out.println();
					System.out.println("\s===Bill Amount===");
					System.out.println(checkcar.checkPrice(days));
					System.out.println();
					
					System.out.println("====Please Confirm Press Yes/No");
					char confirm = scn.next().charAt(0);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(confirm==121||confirm==89) {
						System.out.println("===Take your Car From Garadge===");
						System.out.println("");
						rentCar(checkcar, cust_info, days);
						
					}
					else
						System.out.println("Rental Cancelled");
				}
				
			}
			else if(option==2){
				
				System.out.println("===Enter Car Id===");
				String return_id = scn.next();
				System.out.println("===Enter Customer Id===");
				int returnCust_id =scn.nextInt();
				Car return_car = null;
				Customer return_cust=null;
				for(Car car:car_list) {
					if (car.getCarid().equalsIgnoreCase(return_id)) {
						return_car=car;
						break;
						
					}
				}
				for(Customer cust:cust_list) {
					if(cust.getCustid()==returnCust_id) {
						return_cust=cust;
						break;
					}
				}
				
				returnRentalCar(return_car, return_cust);
				
			}
			else {
				System.out.println("===Thanks for visiting===");
				System.out.println(" ");
				break;
				
				
			}
		  }
		}
	}

