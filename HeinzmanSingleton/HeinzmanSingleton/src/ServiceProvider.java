// Michael Heinzman
// Assignment 1

public class ServiceProvider {
    private static ServiceProvider instance;

    private ServiceProvider() {
        System.out.println("Constructing ServiceProvider");
    }

    public static ServiceProvider getInstance() {
        if (instance == null) {
            instance = new ServiceProvider();
        } else {
            System.out.println("ServiceProvider already exists");
        }
        return instance;
    }

    public static void main(String[] args) {
        ServiceProvider.getInstance();
        ServiceProvider.getInstance();
        ServiceProvider.getInstance();
    }
}