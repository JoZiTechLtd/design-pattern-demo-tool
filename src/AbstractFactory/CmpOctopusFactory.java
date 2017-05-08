package AbstractFactory;

public class CmpOctopusFactory {

	public static Octopus makeOctopus(OctopusType type) throws Exception {
		
		Octopus o = null;
		
		switch (type) {
		
			case NORMAL:
				o = new NormalOctopus(Location.CMP);
			break;
			
			case MUTANT:
				o = new MutantOctopus(Location.CMP);
			break;
			
			default:
				throw new Exception();
		}
		
		return o;
		
	}
	
}
