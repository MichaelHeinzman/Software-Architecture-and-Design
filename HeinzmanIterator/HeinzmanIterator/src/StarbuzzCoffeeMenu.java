import dinermerger.MenuItem;
import java.util.Hashtable;


public class StarbuzzCoffeeMenu {
    private Hashtable<String, MenuItem> menuItems;

    public StarbuzzCoffeeMenu() {
        menuItems = new Hashtable<String, MenuItem>();
        
        addItem("House Blend Coffee", "A smooth, mild coffee", false, 0.89);
        addItem("Dark Roast Coffee", "A bold, strong coffee", false, 0.99);
        addItem("Decaf Coffee", "A decaffeinated coffee", false, 1.05);
        addItem("Espresso", "A concentrated coffee", false, 1.99);
        addItem("Cappuccino", "Espresso with steamed milk and foam", true, 2.99);
        addItem("Latte", "Espresso with steamed milk", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public MenuItem getMenuItem(String name) {
        return menuItems.get(name);
    }

    public Hashtable<String, MenuItem> getMenuItems() {
        return menuItems;
    }
    
	public dinermerger.Iterator createIterator() {
		return new StarbuzzCoffeeMenuIterator(menuItems);
	}
}