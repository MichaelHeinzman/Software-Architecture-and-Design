package app;

public class Main {
    public static void main(String[] args) {
        SupportApp app = new SupportApp();
        
        // Handle request for home page
        app.handleRequest("/Category-Selection");
        
        // Handle request for different pages.
        app.handleRequest("/Academic");
        app.handleRequest("/Emotional");
        app.handleRequest("/Health");
        app.handleRequest("/Cultural");
        app.handleRequest("/Social");
        app.handleRequest("/Hygiene");
    }
}