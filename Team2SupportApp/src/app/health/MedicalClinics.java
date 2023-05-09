package app.health;

public class MedicalClinics {
	private Clinic[] clinics;
	
	public MedicalClinics () {
		this.populateClinics(this.fetchMedicalClinicsFromResource(""));
	}
	
	public void render() {
		System.out.println("\n\t\tRendering Medical Clinics List.");
		if (this.clinics == null)  System.out.println("\tNo Clinics Available.");
		if (this.clinics != null) {
			System.out.println("\t\tClinic Information:");
			for (Clinic clinic : this.clinics) {
				clinic.render();
			}
		}
	}
	
	public Clinic[] getClinics() {
		return this.clinics;
	}
    private void populateClinics(Clinic[] clinics) {
    	if (clinics != null) {
    		this.clinics = clinics;
    	}
    }
    
    private Clinic[] fetchMedicalClinicsFromResource(String filter) {
    	Clinic[] clinics = ClinicFactory.createClinics(3);
        	return clinics;	
    }
    
    private void searchMedicalClinics() {
    	System.out.println("\n\t\tSearching Emotional Information");
    	this.populateClinics(fetchMedicalClinicsFromResource("some filter"));
    }
}
