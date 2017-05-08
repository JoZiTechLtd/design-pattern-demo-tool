package Factory;

public class RealAleFactory {

	public static RealAle makeRealAle(RealAleType type) throws Exception {
		
		RealAle ra = null;
		
		switch (type) {
		
			case GOLDEN:
				ra = new Golden();
			break;
			
			case BITTER:
				ra = new Bitter();
			break;
			
			case MILD:
				ra = new Mild();
			break;
			
			case STOUT:
				ra = new Stout();
			break;
			
			case BARLEY_WINE:
				ra = new BarleyWine();
			break;
			
			default:
				throw new Exception();
		}
		
		return ra;
		
	}
	
}
