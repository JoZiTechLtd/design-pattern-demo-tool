package AbstractFactory;

public class OctopusFactory {
	
	private OctopusFactory() {
	}
	
	public static Octopus makeOctopus(OctopusType type) throws Exception {
		
		Octopus o = null;
		
		Location l = Location.BIO;
		
		switch(l) {
			case BIO:
				o = BioOctopusFactory.makeOctopus(type);
			break;
			
			case CMP:
				o = CmpOctopusFactory.makeOctopus(type);
			break;
			
			case DEFAULT:
				o = DefaultOctopusFactory.makeOctopus(type);
			break;
		}
		
		return o;
	}
}
