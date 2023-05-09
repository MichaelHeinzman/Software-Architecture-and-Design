/* 
 * Michael Seth Heinzman
 * Assignment 2
 * Assignment Title: Decorator
 * Class: CSE3421 (Grad Level though)
 */
public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public double cost() {
		return .10 + beverage.cost();
	}
}
