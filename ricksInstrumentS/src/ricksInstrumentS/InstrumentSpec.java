package ricksInstrumentS;

public abstract class InstrumentSpec {
	
	private String model;
	private Builder builder;
	private Type type;
	private Wood topWood,backWood;
	
	public InstrumentSpec(Builder builder,String model,Type type,Wood topWood,Wood backWood) {
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
	}
	
	public Builder getBuilder() {
		return builder;
	}
	
	public String getModel() {
		return model;
	}
	
	public Type getType() {
		return type;
	}
	
	public Wood getBackWood() {
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}
	public boolean matches(InstrumentSpec instrumentSpec) {
		System.out.println("InstrumentSpec.matches");
		if(this == instrumentSpec) return true;
		if (instrumentSpec == null || getClass() != instrumentSpec.getClass()) return false;
		
		return model.equals(instrumentSpec.getModel()) &&
				builder == instrumentSpec.getBuilder() &&
				type == instrumentSpec.getType() && 
				backWood == instrumentSpec.getBackWood() &&
				topWood == instrumentSpec.getTopWood();
	}
		
}
