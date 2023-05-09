package app.hygiene;

import app.Student;



public class CampusHealthAndResources {
	private Resource[] resources;
	public CampusHealthAndResources(Student student) {
		populateResources(this.fetchCampusHealthAndResourcesFromCampus(student.getCampus().getId(), ""));
	}
	public void render() {
		System.out.println("\n\t\tRendering Campus Health and Resources");
		if (this.resources == null)  System.out.println("\tNo Resources Available.");
		if (this.resources != null) {
			System.out.println("\t\tResource Information:");
			for (Resource resource : this.resources) {
				resource.render();
			}
		}
	}
	
	public Resource[] getResources() {
		return this.resources;
	}
	private void populateResources(Resource[] resources) {
		if (resources != null) {
			this.resources = resources;
		}
	}

	private Resource[] fetchCampusHealthAndResourcesFromCampus(String campusId, String filter) {
		Resource[] resources = ResourceFactory.createResources(3);
	    	return resources;	
	}
	

    private void searchCampusHealthAndResources(String campusId) {
    	System.out.println("\n\t\tSearching Campus Health and Resources Information");
    	this.populateResources(fetchCampusHealthAndResourcesFromCampus(campusId, "some filter"));
    }
}
