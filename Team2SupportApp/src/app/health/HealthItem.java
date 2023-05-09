package app.health;

import app.Item;

public class HealthItem implements Item{
	private String type;
	
	public HealthItem (String type) {
		this.type = type;
	}
	
	public void render() {
		System.out.println("\n\t\t\tRendering Health Item");
		System.out.println("\t\t\tType:  " + type);
	}
}
