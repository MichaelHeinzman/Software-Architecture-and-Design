// Michael Heinzman
// Pattern Assignment 3

import dinermerger.*;

public class MenuTestDrive {
	// Michael Heinzman
	// Pattern Assignment 3
    public static void main(String args[]) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        StarbuzzCoffeeMenu starbuzzCoffeeMenu = new StarbuzzCoffeeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, starbuzzCoffeeMenu);
        waitress.printMenu();
    }
}
