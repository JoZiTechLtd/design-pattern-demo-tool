package AbstractFactory;

public class BioOctopusFactory {

	public static Octopus makeOctopus(OctopusType type) throws Exception {
		
		Octopus o = null;
		
		switch (type) {
		
			case NORMAL:
				o = new NormalOctopus(Location.BIO);
			break;
			
			case MUTANT:
				o = new MutantOctopus(Location.BIO);
			break;
			
			default:
				throw new Exception();
		}
		
		return o;
		
	}
	
}
