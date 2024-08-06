package car.rent;

import java.util.ArrayList;
import java.util.List;


public class Car {

	private Integer car_id;
	private String car_model;
	private String car_type;
	private Double rent;
	
   Car(int car_id,String car_model,String car_type,Double rent){
	 
	    this.car_id=car_id;
	    this.car_model=car_model;
	    this.car_type=car_type;
	    this.rent=rent;
	}
   
   @Override
public String toString() {
	// TODO Auto-generated method stub
	return "____________\n"+"Car_id:\s"+car_id+"\nCar_Name:\s"+car_model+"\nCar_Type:\s"+car_type+"\nRent Per Day:\s"+rent+"\n";
}
	
	
//    public void setCar_id(int car_id) {
//		this.car_id = car_id;
//	}
//    
//    public void setCar_model(String car_model) {
//		this.car_model = car_model;
//	}
//    
//    public void setCar_type(String car_type) {
//		this.car_type = car_type;
//	}
//    public void setRent(Double rent) {
//		this.rent = rent;
	}
    
    
    
    

