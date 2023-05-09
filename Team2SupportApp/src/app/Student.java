package app;

public class Student {
  // Attributes
  private String name;
  private String id;
  private String userName;
  private String password;
  private Campus campus;
  
  // Constructor
  public Student(String name, String id, String userName, String password, Campus campus) {
    this.name = name;
    this.id = id;
    this.userName = userName;
    this.password = password;
    this.campus = campus;
  }
  
  public Campus getCampus() {
	  System.out.println("\t\tGetting campus from student...");
	  return this.campus;
  }
  
  // Display
  public void render() {
	  System.out.println("\n\t\t\tDisplaying: Student");
	  System.out.println("\t\t\tStudent " + this.name);
	  System.out.println("\t\t\tID " + this.id);
	  System.out.println("\t\t\tUsername " + this.userName);
	  if (this.campus != null) {
		  System.out.println("\t\t\tCampus " + this.campus.getName()); 
	  }
  }
  
  public void contact() {
	  System.out.println("\n\t\t" + name + " Contacted.");
  }
}
