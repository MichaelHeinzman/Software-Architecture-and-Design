package app.hygiene;

public class Resource {
    // Attributes
    private String name;
    private String type;
    private String location;
    private int quantity;
    private String category;
    private String contactPerson;

    // Constructor
	public Resource(String name, String type, String location, int quantity, String category, String contactPerson) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.quantity = quantity;
        this.category = category;
        this.contactPerson = contactPerson;
	}


	// Display
    public void render() {
        System.out.println("\n\t\t\tDisplaying: Resource Details");
        System.out.println("\t\t\tName: " + this.name);
        System.out.println("\t\t\tType: " + this.type);
        System.out.println("\t\t\tLocation: " + this.location);
        System.out.println("\t\t\tQuantity: " + this.quantity);
        System.out.println("\t\t\tCategory: " + this.category);
        System.out.println("\t\t\tContact Person: " + this.contactPerson);
    }
}
