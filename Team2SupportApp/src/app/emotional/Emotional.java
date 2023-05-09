package app.emotional;
import app.pageController.Page;

public class Emotional implements Page{
    public void render() {
        System.out.println("\nRendering Emotional Page");
        System.out.println("Rendering Emotional Options: Information, Professionals, etc..");
        
        this.informationOptionSelected();
        this.professionalsOptionSelected();
    }
    
    private void informationOptionSelected() {
    	System.out.println("\n\tInformation Option Selected.");
    	
    	// Render information in a list on screen.
    	EmotionalInformation emotionalInformation = new EmotionalInformation("");
    	emotionalInformation.render();
    }
    
    private void professionalsOptionSelected() {
    	System.out.println("\n\tProfessionals Option Selected.");
    	
    	// Render professionals in a list on screen.
    	EmotionalInformation emotionalInformation = new EmotionalInformation("professionals");
    	emotionalInformation.render();
    }
}

