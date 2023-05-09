package app.cultural;

public class CulturalEvents {
	private Event[] events;

	public CulturalEvents () {
		this.populateEvents(this.fetchEventsFromResource(""));
	}

	public void render() {
		System.out.println("\n\t\tRendering Events List.");
		if (this.events == null)  System.out.println("\tNo Events Available.");
		if (this.events != null) {
			System.out.println("\t\tEvent Information:");
			for (Event event : this.events) {
				event.render();
			}
		}
	}

	public Event[] getEvents() {
		return this.events;
	}
	private void populateEvents(Event[] events) {
		if (events != null) {
			this.events = events;
		}
	}

	private Event[] fetchEventsFromResource(String filter) {
		Event[] events = EventFactory.createEvents(3);
	    	return events;	
	}
	
    private void searchCulturalEvents() {
    	System.out.println("\n\t\tSearching Cultural Information");
    	this.populateEvents(fetchEventsFromResource("some filter"));
    }
}
