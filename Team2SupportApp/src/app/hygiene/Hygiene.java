package app.hygiene;
import app.Student;
import app.pageController.Page;

public class Hygiene implements Page {
	// This would most likely be abstracted to a local immutable storage we can access.
	// For now I included student in here and pipe drilled it down through constructors.
	private Student student;
	
	public Hygiene (Student student) {
		this.student = student;
	}
	
    public void render() {
        System.out.println("\nRendering Hygiene Page");
        System.out.println("Rendering Hygiene Options: CampusHealthAndResources, Hygiene information, etc..");
        
        this.campusHealthAndResourcesSelected();
    }
    
    private void campusHealthAndResourcesSelected() {
    	System.out.println("\n\tCampus Health and Resources Option Selected.");
    	
    	// Render information in a list on screen.
    	CampusHealthAndResources campusHealthAndResources = new CampusHealthAndResources(this.student);
    	campusHealthAndResources.render();
    }
}
