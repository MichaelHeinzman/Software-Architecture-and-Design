/* 
 * Michael Seth Heinzman
 * Assignment 2
 * Assignment Title: Decorator
 * Class: CSE3421 (Grad Level though)
 */
public class condimentFactory {
    private Beverage beverage;

	public Beverage createBeverage(String type) {

        switch (type.toLowerCase()) {
            case "darkroast":
                this.beverage = new DarkRoast();
                break;
            case "espresso":
            	this.beverage = new Espresso();
                break;
            case "houseblend":
            	this.beverage = new HouseBlend();
                break;
            case "mocha":
            	this.beverage = new Mocha(this.beverage);
                break;
            case "whip":
            	this.beverage = new Whip(this.beverage);
                break;
            case "soy":
            	this.beverage = new Soy(this.beverage);
                break;
            case "sprinkles":
            	this.beverage = new Sprinkles(this.beverage);
                break;
            default:
                System.out.println("Invalid input: " + type);
        }
        return beverage;
    }
}
