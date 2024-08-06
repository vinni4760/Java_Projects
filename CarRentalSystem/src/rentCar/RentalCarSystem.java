package rentCar;

public class RentalCarSystem {
	
	public static void main(String[] args) {
		Car c1 = new Car("C101", "Maruti","Alto", 1500.0);
		Car c2 = new Car("C102", "Tata","Safari", 3000.0);
		Car c3 = new Car("C103", "Mahindra","XUV-300", 1900.0);
		Car c4 = new Car("C104", "Mahindra","XUV-500", 2500.0);
		Car c5 = new Car("C105", "Maruti","Ertiga", 32000.0);
		
		RentShop rentshop = new RentShop();
		rentshop.addCar(c1);
		rentshop.addCar(c2);
		rentshop.addCar(c3);
		rentshop.addCar(c4);
		rentshop.addCar(c5);
		
		rentshop.Carmenu();
	}

}
