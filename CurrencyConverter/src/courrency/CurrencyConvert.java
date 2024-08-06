package courrency;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvert {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		 System.out.println("\tCurrency Converter");
		 System.out.println("\sChoose your currency\n");
		 System.out.println("1 Indian Ruppees");
		 System.out.println("2 Germany Euro");
		 System.out.println("3 Australian  Dollor");
		 System.out.println("4 US  Dollor");
		 System.out.println("5 UK  Dollor");
		 Currency c1 = Currency.getInstance("INR");
		 Currency c2 = Currency.getInstance(Locale.GERMANY);
		 Currency c3 = Currency.getInstance("AUD");
		 Currency c4 = Currency.getInstance(Locale.US);
		 Currency c5 = Currency.getInstance(Locale.UK);
		
		int choice = scn.nextInt();
		 switch (choice) {
		case 1: {
			 System.out.println("\s1 Indian Ruppees\s"+c1.getSymbol());
			 System.out.println("\s= 0.011"+"\sEuro "+c2.getSymbol());
			 System.out.println("\s= 0.018"+"\sAUD  "+c3.getSymbol());
			 System.out.println("\s= 0.012"+"\sUSD "+c4.getSymbol());
			 System.out.println("\s= 0.0094"+"\sBritish Pound "+c5.getSymbol());
			 
			 
			System.out.println("Enter Amount");
			double amt = scn.nextDouble();
			if(amt>0) {
				System.out.println(amt+c1.getSymbol()+"\s=\s"+amt*0.011+c2.getSymbol());
				System.out.println(amt+c1.getSymbol()+"\s=\s"+amt*0.018+c3.getSymbol());
				System.out.println(amt+c1.getSymbol()+"\s=\s"+amt*0.012+c4.getSymbol());
				System.out.println(amt+c1.getSymbol()+"\s=\s"+amt*0.0094+c5.getSymbol());
			}
			}
		case 2:{
			 System.out.println("\s1 German Euro \s"+c2.getSymbol());
			 System.out.println("\s= 90"+"\sRuppee "+c1.getSymbol());
			 System.out.println("\s= 1.16"+"\sAUD  "+c3.getSymbol());
			 System.out.println("\s= 1.09"+"\sUSD  "+c4.getSymbol());
			 System.out.println("\s= 0.85"+"\sBritish Pound "+c5.getSymbol());
			 
			 
			System.out.println("Enter Amount");
			double amt = scn.nextDouble();
			if(amt>0) {
				System.out.println(amt+c2.getSymbol()+"\s=\s"+amt*90+c1.getSymbol());
				System.out.println(amt+c2.getSymbol()+"\s=\s"+amt*1.16+c3.getSymbol());
				System.out.println(amt+c2.getSymbol()+"\s=\s"+amt*1.09+c4.getSymbol());
				System.out.println(amt+c2.getSymbol()+"\s=\s"+amt*0.85+c5.getSymbol());
			
		}
		 break;
		}
		case 3:{
			
				 System.out.println("\s1 Australian Dollar \s"+c3.getSymbol());
				 System.out.println("\s= 54.62"+"\sRuppee "+c1.getSymbol());
				 System.out.println("\s= 0.62"+"\sEuro  "+c2.getSymbol());
				 System.out.println("\s= 0.68"+"\sUSD  "+c4.getSymbol());
				 System.out.println("\s= 0.53"+"\sBritish Pound "+c5.getSymbol());
				 
				 
				System.out.println("Enter Amount");
				double amt = scn.nextDouble();
				if(amt>0) {
					System.out.println(amt+c3.getSymbol()+"\s=\s"+amt*54.62+c1.getSymbol());
					System.out.println(amt+c3.getSymbol()+"\s=\s"+amt*0.62+c2.getSymbol());
					System.out.println(amt+c3.getSymbol()+"\s=\s"+amt*0.68+c4.getSymbol());
					System.out.println(amt+c3.getSymbol()+"\s=\s"+amt*0.53+c5.getSymbol());
					
		}
				break;
				
		
	}
		case 4:{
			 System.out.println("\s1 US Dollar \s"+c4.getSymbol());
			 System.out.println("\s= 82.30"+"\sRuppee "+c1.getSymbol());
			 System.out.println("\s= 0.91"+"\sEuro  "+c2.getSymbol());
			 System.out.println("\s= 1.47"+"\sAUD  "+c3.getSymbol());
			 System.out.println("\s= 0.79"+"\sBritish Pound "+c5.getSymbol());
			 
			 
			System.out.println("Enter Amount");
			double amt = scn.nextDouble();
			if(amt>0) {
				System.out.println(amt+c4.getSymbol()+"\s=\s"+amt*82.30+c1.getSymbol());
				System.out.println(amt+c4.getSymbol()+"\s=\s"+amt*0.91+c2.getSymbol());
				System.out.println(amt+c4.getSymbol()+"\s=\s"+amt*1.47+c3.getSymbol());
				System.out.println(amt+c4.getSymbol()+"\s=\s"+amt*0.79+c5.getSymbol());
				
	      }
			break;
			
		}
		case 5:{
			 System.out.println("\s1 UK Dollar \s"+c4.getSymbol());
			 System.out.println("\s= 104.40"+"\sRuppee "+c1.getSymbol());
			 System.out.println("\s= 1.17"+"\sEuro  "+c2.getSymbol());
			 System.out.println("\s= 1.87"+"\sAUD  "+c3.getSymbol());
			 System.out.println("\s= 1.27"+"\sUS "+c4.getSymbol());
			 
			 
			System.out.println("Enter Amount");
			double amt = scn.nextDouble();
			if(amt>0) {
				System.out.println(amt+c5.getSymbol()+"\s=\s"+amt*104.40+c1.getSymbol());
				System.out.println(amt+c5.getSymbol()+"\s=\s"+amt*1.17+c2.getSymbol());
				System.out.println(amt+c5.getSymbol()+"\s=\s"+amt*1.87+c3.getSymbol());
				System.out.println(amt+c5.getSymbol()+"\s=\s"+amt*1.27+c5.getSymbol());
				
	      }
			break;
		}
		
	}
	
	}
}

