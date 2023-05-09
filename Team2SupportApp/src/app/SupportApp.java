package app;

// Import necessary libraries
import java.util.Scanner;

import app.academic.Academic;
import app.categorySelection.CategorySelection;
import app.cultural.Cultural;
import app.emotional.Emotional;
import app.health.Health;
import app.hygiene.Hygiene;
import app.pageController.PageController;
import app.social.Social;

public class SupportApp {
    // Attributes
    private PageController controller;
    private Student loggedInStudent; // Keep track of the currently logged in student

    public SupportApp() {
        // Initialize the page controller
        this.controller = new PageController();
    }

    public void handleRequest(String path) {
        // Check if the user is logged in
        if (this.loggedInStudent == null) {
            // If not logged in, show login page
            showLoginPage();
        } else {
            // If logged in, handle the request based on the requested path
            this.controller.handleRequest(path);
        }
    }
    
    private void showLoginPage() {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display login form
        System.out.println("Login Form");
        System.out.println("-----------");
        
        // Read username and password from user input
        System.out.print("Username: ");
        String username = scanner.nextLine();
        
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        // Authenticate user credentials
        Student student = authenticate(username, password);
        
        if (student == null) {
            // If authentication failed, display error message and show login page again
            System.out.println("Invalid username or password. Please try again.");
            showLoginPage();
        } else {
        	System.out.println("Logged In User: ");
        	student.render();
        	System.out.println("\n");
        	
            // If authentication successful, set the currently logged in student and handle the request
            this.loggedInStudent = student;
            
            // Add routes for different pages
            controller.addRoute("/Category-Selection", new CategorySelection());
            controller.addRoute("/Academic", new Academic());
            controller.addRoute("/Emotional", new Emotional());
            controller.addRoute("/Health", new Health());
            controller.addRoute("/Cultural", new Cultural());
            controller.addRoute("/Social", new Social());
            controller.addRoute("/Hygiene", new Hygiene(this.loggedInStudent));
            
            this.controller.handleRequest("/Category-Selection");
        }
    }
    
    private Student authenticate(String username, String password) {
        // TODO: Implement authentication logic here
        // For example, check if the username and password match any existing student object in the system
        
        // Return the authenticated student object or null if authentication fails
        return new Student("Bob", "123456","BobUsername", "password", new Campus("Florida Tech", "#CampusID"));
    }
}
