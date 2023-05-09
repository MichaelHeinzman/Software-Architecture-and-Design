/* 
 * Michael Seth Heinzman
 * Assignment 2
 * Assignment Title: Decorator
 * Class: CSE3421 (Grad Level though)
 */
public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return .30 + beverage.cost();
	}
}
