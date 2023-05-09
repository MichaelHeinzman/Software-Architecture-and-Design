package app.academic;
public class TutorServices {
	private TutorService[] tutorServices;
	
	public TutorServices() {
		this.populateTutoringServices(this.fetchTutoringServicesFromResource(""));
	}
	
	public void render() {
		System.out.println("\n\tRendering Tutor Services:");
		if (this.tutorServices == null)  System.out.println("\tNo services Available.");
		if (this.tutorServices != null) {
			System.out.println("\tServices:");
			for (TutorService service : this.tutorServices) {
				service.render();
			}
			
			// This just mimics student selecting a tutor and pressing a button to,
			// schedule an appointment. This shouldn't be here in actual UI code.
			boolean success = tutorServices[0].getTutors()[0].scheduleAppointmentWithTutor();
			if(success) System.out.println("\t\tTutor Appointment Confirmed");
		}
	}
	
    private void populateTutoringServices(TutorService[] tutorServices) {
    	if (tutorServices != null) {
    		this.tutorServices = tutorServices;
    	}
    }
    
    private TutorService[] fetchTutoringServicesFromResource(String filter) {
    	TutorService[] services = TutorServiceFactory.createTutorServices(3);
    	return services;
    }
    
    private void searchTutorServices() {
    	System.out.println("\n\t\tSearching Tutors");
    	this.populateTutoringServices(fetchTutoringServicesFromResource("SomeFilter"));
    }
}
