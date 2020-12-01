package dataStruct1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class dataStruct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInputNum = new Scanner(System.in);
		System.out.println("Please provide 5 numbers.");
		int randNum1 = userInputNum.nextInt();
		int randNum2 = userInputNum.nextInt();
		int randNum3 = userInputNum.nextInt();
		int randNum4 = userInputNum.nextInt();
		int randNum5 = userInputNum.nextInt();
		
        ArrayList<Integer> List1 = new ArrayList<Integer>();
		List1.add(randNum1);
		List1.add(randNum2);
		List1.add(randNum3);
		List1.add(randNum4);
		List1.add(randNum5);
		System.out.println("\nUser's Selected Numbers:\n" + List1);
		
// Print the SUM of the user's list
			
		int sum = 0;
		for (long i = 0; i <	 List1.size(); i++) {
			sum += List1.get((int)i);
		}
		System.out.println("\nThe SUM of the user's selected numbers are: " + sum);
		
// Print the PRODUCT of the user's list
		
		int prod = 1;
		for (long i = 0; i <	 List1.size(); i++) {
			prod *= List1.get((int) i);
		}
		System.out.println("The PRODUCT of the user's selected numbers are: " + prod);
		
// Print the LARGEST of the user's list
		
		System.out.println("LARGEST Number: " + Collections.max(List1));
		
		
// Print the SMALLEST of the user's list
		
		System.out.println("SMALLEST Number: " + Collections.min(List1) + "\n");
		
		
//--------------------Car HashMap----------------------------------------
	HashMap<String, String> cars = new HashMap<String, String>();
	cars.put("Canyon Extended Cab", "GMC");
	cars.put("Cascada", "Buick");		
	cars.put("Cayenne", "Porsche");		
	cars.put("Cayenne Coupe", "Porsche");	
	cars.put("C-Class", "Mercedes-Benz");		
	cars.put("Challenger", "Dodge");
	cars.put("Charger", "Dodge");	
	cars.put("Cherokee", "Jeep");	
	cars.put("C-HR", "Toyota");		
	cars.put("Tundra", "Toyota");  
	cars.put("Civic", "Honda");	
	cars.put("Civic Type R", "Honda");
	cars.put("Model Y", "Tesla");
	Scanner carInput = new Scanner(System.in);
	
	// Asking client question
    System.out.println("What car(MODEL) are you looking for?");
	String carDesc = carInput.nextLine();
	
	
	for (String i : cars.keySet()) {
	
	// Prints Statement
	   if (carDesc.equals(i)) {
		   System.out.println("\nOh, you're looking for a " + carDesc + "?\n"
		  		 + "Our " + cars.get(i) + " selection is right over here...\n");
		  break;		
	   } 
	}
	
	
	
	}
	
	
	}
	
	
	
	/* else {
	  		  System.out.println("\nWe do not have your selection in our inventory.");
	  		  break;
	  	  }     */

	  		
	
  
