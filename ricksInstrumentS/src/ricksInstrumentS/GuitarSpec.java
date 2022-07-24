package ricksInstrumentS;

public class GuitarSpec extends InstrumentSpec {
	private int numStrings;
	
	public GuitarSpec(Builder builder,String model,Type type,int numStrings,Wood backWood,Wood topWood) {
		super(builder,model,type,backWood,topWood);
		this.numStrings = numStrings;
	}
	
	public int getNumStrings() {
		return numStrings;
	}
	

	public boolean matches(InstrumentSpec instrumentSpec) {
		System.out.println("GuitarSpec.matches");
		if(!super.matches(instrumentSpec))
			return false;
		
		if(!(instrumentSpec instanceof GuitarSpec))
			return false;
		
		GuitarSpec guitarSpec = (GuitarSpec) instrumentSpec;
		
		if(numStrings != guitarSpec.getNumStrings())
			return false;
		return true;
	}
	
}
