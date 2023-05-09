package app.cultural;

public class Event {
	// Attributes
	private String name; // The name of the event.
	private String type; // The type of the event (e.g. music, sports, theater).
	private String description; // A brief description of the event.

	// Constructor
	public Event(String name, String type, String description) {
	    this.name = name;
	    this.type = type;
	    this.description = description;
    }
	
	// Display
	public void render() {
		System.out.println("\n\t\t\tDisplaying: Event Details");
	    System.out.println("\t\t\tEvent Name: " + this.name); // Display the event name.
	    System.out.println("\t\t\tEvent Type: " + this.type); // Display the event type.
	    System.out.println("\t\t\tEvent Description: " + this.description); // Display the event description.
	}
}
