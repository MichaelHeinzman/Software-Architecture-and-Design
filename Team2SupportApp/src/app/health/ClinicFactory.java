package app.health;
public class ClinicFactory {
    public static Clinic[] createClinics(int numberOfClinics) {
        Clinic[] clinics = new Clinic[numberOfClinics];
        for (int i = 0; i < numberOfClinics; i++) {
            String id = "CLINIC" + i;
            String name = "Clinic " + i;
            String doctorID = "DOC" + i;
            String specialization = "Specialization " + i;
            Clinic clinic = new Clinic(id, name, doctorID, specialization);
            clinics[i] = clinic;
        }
        return clinics;
    }
}