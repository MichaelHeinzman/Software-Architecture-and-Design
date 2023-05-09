/* 
 * Michael Seth Heinzman
 * Assignment 2
 * Assignment Title: Decorator
 * Class: CSE3421 (Grad Level though)
 */
public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
