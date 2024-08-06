package rentCar;

public class Car {
	
	private String car_id;
	private String car_name;
	private String car_model;
	private Boolean isavailable;
	private Double price;
	private Double amount;
	
	public Car(String id,String name,String model,Double price) {
		this.car_id=id;
		this.car_name=name;
		this.car_model=model;
		this.isavailable=true;
		this.price=price;
	}
	
	public String getCarid() {
		return car_id;
	}
	public String getCarname() {
		return car_name;
	}
	public String getCarmodel() {
		return car_model;
	}
	
	public Boolean isavailableforRent() {
		return this.isavailable;
	}
	public void rent() {
		this.isavailable=false;
	}
	
	public String checkPrice(int days) {
		this.amount=price*days;
		return "Amount:"+amount;
	}

	public void submitCar() {
		this.isavailable=true;
	}
}
