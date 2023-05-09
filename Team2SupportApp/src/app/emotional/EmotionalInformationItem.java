package app.emotional;
import app.Item;

public class EmotionalInformationItem implements Item {
	private String type;
	
	public EmotionalInformationItem (String type) {
		this.type = type;
	}
	
	public void render() {
		System.out.println("\n\t\t\tRendering Emotional Information Item");
		System.out.println("\t\t\tType:  " + type);
	}
}
