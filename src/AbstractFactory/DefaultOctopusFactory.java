package AbstractFactory;

public class DefaultOctopusFactory {

	public static Octopus makeOctopus(OctopusType type) throws Exception {
		
		Octopus o = null;
		
		switch (type) {
		
			case NORMAL:
				o = new NormalOctopus(Location.DEFAULT);
			break;
			
			case MUTANT:
				o = new MutantOctopus(Location.DEFAULT);
			break;
			
			default:
				throw new Exception();
		}
		
		return o;
		
	}
	
}
