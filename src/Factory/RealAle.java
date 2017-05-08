package Factory;

public abstract class RealAle {
	
	public RealAle(RealAleType type) {
		
		this.Type = type;
		makeRealAle();
		
	}
	
	private void makeRealAle() {
		
	}
	
	private RealAleType Type = null;

	public RealAleType getType() {
		return Type;
	}

	public void setType(RealAleType type) {
		this.Type = type;
	}
	
	
	
}
