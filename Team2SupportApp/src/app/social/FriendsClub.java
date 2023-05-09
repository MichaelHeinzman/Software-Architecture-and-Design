package app.social;

import java.util.HashMap;

import app.Student;

public class FriendsClub {
	private Student[] students;

	public FriendsClub(HashMap<String,String> interestsAndHobbies) {
		this.populateStudents(this.fetchStudentsMatchedWithInterestsAndHobbiesFromResource(interestsAndHobbies));
	}

	public void render() {
		System.out.println("\n\t\tRendering Matched Students List.");
		if (this.students == null)  System.out.println("\tNo Matched Students Available.");
		if (this.students != null) {
			System.out.println("\t\tMatched Student Information:");
			for (Student student : this.students) {
				student.render();
			}
		}
	}

	public Student[] getStudents() {
		return this.students;
	}
	
    public Student[] fetchStudentsMatchedWithInterestsAndHobbiesFromResource(HashMap<String,String> interestsAndHobbies) {
    	Student[] students = StudentFactory.createStudents(5);
    	return students;
    }
    
	private void populateStudents(Student[] students) {
		if (students != null) {
			this.students = students;
		}
	}
}
