package app;

public class Campus {
	private String name;
	private String id;
	
	public Campus(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
}
