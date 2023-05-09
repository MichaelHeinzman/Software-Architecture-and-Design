package app.health;
import app.pageController.Page;


public class Health implements Page {
    public void render() {
        System.out.println("\nRendering Health Page");
        System.out.println("Rendering Health Options: Information, Clinics, etc..");
        
        this.medicalClinicsOptionSelected();
    }
    
    private void medicalClinicsOptionSelected() {
    	System.out.println("\n\tMedical Clinics Option Selected.");
    	
    	// Render information in a list on screen.
    	MedicalClinics medicalClinic = new MedicalClinics();
    	medicalClinic.render();
    	
    	// This should be in Clinic. No UI so manually called here.
    	boolean success = medicalClinic.getClinics()[0].scheduleAppointmentWithClinic();
    	if (success)System.out.println("\t\tAppointment Confirmed");
    }
}
