package app.cultural;
import app.pageController.Page;

public class Cultural implements Page {
    public void render() {
        System.out.println("\nRendering Cultural Page");
        System.out.println("Rendering Cultural Options: Events, etc..");
        
        this.culturalEventOptionSelected();
    }
    
    private void culturalEventOptionSelected() {
    	System.out.println("\n\tEvents Option Selected.");
    	
    	// Render information in a list on screen.
    	CulturalEvents culturalEvents = new CulturalEvents();
    	culturalEvents.render();
    }
}
