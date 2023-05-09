package app.academic;

public class TutorService {
    private int id;
    private String name;
    private boolean availability;
    private Tutor[] tutors;
    
    public TutorService(int id, String name, boolean availability) {
        this.id = id;
        this.name = name;
        this.availability = availability;
        this.populateTutors(this.fetchTutorsFromResource());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setTutors(Tutor[] tutors) {
        this.tutors = tutors;
    }
    public Tutor[] getTutors() {
    	return this.tutors;
    }
    
    private void populateTutors(Tutor[] tutors) {
    	this.tutors = tutors;
    }
    private Tutor[] fetchTutorsFromResource() {
    	Tutor[] tutors = TutorFactory.createTutors(5);
    	return tutors;
    }
    
    public void render() {
        System.out.println("\n\t\tRendering Tutoring Service");
        System.out.printf("\t\tID: %d\n", id);
        System.out.printf("\t\tName: %s\n", name);
        System.out.printf("\t\tAvailability: %b\n", availability);
        
        System.out.println("\n\t\t\tRendering Tutors for Selected Service " + this.id + ":");
        if (this.tutors == null) {
            System.out.println("\t\t\tNo Tutors Available.");
        } else {
            System.out.println("\t\t\tTutors:");
            for (Tutor tutor : this.tutors) {
                tutor.render();
            }
        }
    }
}