package app.academic;
import app.pageController.Page;

public class Academic implements Page{
    public void render() {
        System.out.println("\nRendering Academic Page");
        System.out.println("Rendering Academic Options: Tutor Services, etc..");
        
        this.tutorServicesOptionSelected();
    }
    
    private void tutorServicesOptionSelected() {
    	System.out.println("\n\tTutoring Services Option Selected.");
    	
    	// Render tutor services in a list on screen.
    	TutorServices tutorServices = new TutorServices();
    	tutorServices.render();
    }
}
