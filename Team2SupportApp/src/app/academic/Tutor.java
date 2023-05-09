package app.academic;

public class Tutor {
	private String name;
	private String email;
	private String qualification;
	private int phone;
	private int rating;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public boolean scheduleAppointmentWithTutor() {
		System.out.println("\n\t\tScheduled Appointment With Tutor: " + this.name);
		return true;
	}
	public void render() {
		System.out.println("\n\t\t\tRendering Tutor");
		System.out.println("\t\t\tName: " + this.name); // Display the name of the tutor
		System.out.println("\t\t\tEmail: " + this.email); // Display the email of the tutor
		System.out.println("\t\t\tQualification: " + this.qualification); // Display the qualification of the tutor
		System.out.println("\t\t\tNumber: " + this.phone); // Display the contact number of the tutor
		System.out.println("\t\t\tRating: " + this.rating); // Display the rating of the tutor
	}
}