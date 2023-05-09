/* 
 * Michael Seth Heinzman
 * Assignment 2
 * Assignment Title: Decorator
 * Class: CSE3421 (Grad Level though)
 */
public class Store {
    private static Store instance = null;
    private condimentFactory condimentFactory;
    private Register register;

    private Store() {
        this.condimentFactory = new condimentFactory();
        this.register = new Register(this.condimentFactory);
    }

    public static Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }
        return instance;
    }

    public void takeOrders() {
        register.takeOrder();
    }


}
