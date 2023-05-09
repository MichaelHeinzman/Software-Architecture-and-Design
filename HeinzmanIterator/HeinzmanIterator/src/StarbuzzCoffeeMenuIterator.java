import dinermerger.*;
import java.util.Hashtable;
import java.util.Iterator;

public class StarbuzzCoffeeMenuIterator implements Iterator<MenuItem>, dinermerger.Iterator {
    Hashtable<String, MenuItem> menuItems;
    Iterator<MenuItem> iterator;
    
    public StarbuzzCoffeeMenuIterator(Hashtable<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
        iterator = menuItems.values().iterator();
    }
    
    public boolean hasNext() {
        return iterator.hasNext();
    }
    
    public MenuItem next() {
        return iterator.next();
    }
    
    public void remove() {
        iterator.remove();
    }
}