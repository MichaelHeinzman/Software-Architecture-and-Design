/* 
 * Michael Seth Heinzman
 * Assignment 2
 * Assignment Title: Decorator
 * Class: CSE3421 (Grad Level though)
 */
public class Sprinkles extends CondimentDecorator {
	Beverage beverage;
	
	public Sprinkles(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Sprinkles";
	}
	
	public double cost() {
		return .10 + beverage.cost();
	}
}
