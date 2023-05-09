package app.academic;

public class TutorFactory {
	public static Tutor[] createTutors(int numTutors) {
	    Tutor[] tutors = new Tutor[numTutors];
	    for (int i = 0; i < numTutors; i++) {
	        Tutor tutor = new Tutor();
	        tutor.setName("Tutor " + (i + 1));
	        tutor.setEmail("tutor" + (i + 1) + "@example.com");
	        tutor.setQualification("Qualification " + (i + 1));
	        tutor.setPhone(1234567890 + i);
	        tutor.setRating(i + 1);
	        tutors[i] = tutor;
	    }
	    return tutors;
	}
}