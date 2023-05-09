package app.health;
public class Clinic {
	// Attributes
	private String id; // The ID of the clinic.
	private String name; // The name of the clinic.
	private String doctorID; // The ID of the clinic's doctor.
	private String specialization; // The specialization of the clinic's doctor.
	
	// Constructor
	public Clinic (String id, String name, String doctorID, String specialization) {
		// Set the values of the attributes using the constructor parameters.
		this.id = id;
		this.name = name;
		this.doctorID = doctorID;
		this.specialization = specialization;
	}
	
	// Methods
	public String getName() {
		return this.name;
	}
	
	public boolean scheduleAppointmentWithClinic() {
		System.out.println("\n\t\tAppointment Scheduled with " + name);
		return true;
	}
	
	// Display
	// This method displays the information about the clinic.
	public void render(){
		System.out.println("\n\t\t\tRendering: Clinic Info");
	    System.out.println("\t\t\tClinic ID: " + this.id);
	    System.out.println("\t\t\tClinic Name: " + this.name);
	    System.out.println("\t\t\tDoctor ID: " + this.doctorID);
	    System.out.println("\t\t\tSpecialization: " + this.specialization);
	}
}

