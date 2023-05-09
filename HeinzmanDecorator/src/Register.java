/* 
 * Michael Seth Heinzman
 * Assignment 2
 * Assignment Title: Decorator
 * Class: CSE3421 (Grad Level though)
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    private ArrayList<Beverage> register;
    private condimentFactory condimentFactory;
    
    public Register(condimentFactory condimentFactory) {
        register = new ArrayList<Beverage>();
        this.condimentFactory = condimentFactory;
    }
    
    public Beverage createBeverage(String type) {
        return condimentFactory.createBeverage(type);
    }
    
    public void addBeverage(Beverage beverage) {
        register.add(beverage);
    }

    public void removeBeverage(Beverage beverage) {
        register.remove(beverage);
    }

    public void printOrder() {
        double totalCost = 0.0;
        for (Beverage beverage : register) {
            totalCost += beverage.cost();
            System.out.println(beverage.getDescription() + " $" + beverage.cost());
        }
        System.out.println("Total: $" + totalCost);
    }

    public void EndSale(Beverage beverage) {
		System.out.println("Beverage Sale Ended, added to list of sales. Type 'Complete' to complete your order.");
		addBeverage(beverage);
    }
    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (!input.equalsIgnoreCase("Complete")) {
            System.out.println("Enter your order (type 'Complete' to complete order, type 'New Sale' to add a new sale or item.): ");
        	input = scanner.nextLine();

    		
        	if (input.equalsIgnoreCase("New sale")) {
        		// Initialize beverage.
        		Beverage beverage = null;
        		if (beverage == null) {
            		// Ask to input what beverage they want.
            		System.out.println("Enter a beverage (type 'End sale' to finish with the first beverage.");
            		input = scanner.nextLine();
            		beverage = createBeverage(input);
            		System.out.println("BEVERAGE" + beverage);
        		}
        		
        		while (!input.equalsIgnoreCase("End sale")) {
            		if (beverage != null) {
            			System.out.print("Add condiment (or end sale): ");
            			input = scanner.nextLine();
                    	if (input.equalsIgnoreCase("End sale")) {
                    		EndSale(beverage);
                    	} else {
                			beverage = createBeverage(input);
                    		System.out.println("BEVERAGE" + beverage.getDescription());
                    	}
            		}	
        		}
        		
        	}
        }
        
        this.printOrder();
        scanner.close();
    }
}
