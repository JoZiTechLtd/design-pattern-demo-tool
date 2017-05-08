package AbstractFactory;

public abstract class Octopus {
	
	public Octopus(OctopusType type, Location location) {
		
		this.type = type;
		this.location = location;
		arrangeOctopus();
		
	}
	
	private void arrangeOctopus() {
		
	}
	
	private OctopusType type = null;
	private Location location = null;

	
	//Getters and Setters
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public OctopusType getoType() {
		return type;
	}

	public void setoType(OctopusType type) {
		this.type = type;
	}
	
	
	public String toString() {
		return "Octopus Type: " + type + " created in " + location;
	}
	
	
	
}
