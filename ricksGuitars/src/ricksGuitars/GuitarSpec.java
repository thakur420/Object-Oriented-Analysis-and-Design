package ricksGuitars;
//import java.util.*;
public class GuitarSpec {
	private String model;
	private Builder builder;
	private Type type;
	private Wood backWood,topWood;
	
	public GuitarSpec(Builder builder,String model,Type type,Wood backWood,Wood topWood) {
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
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
	
	
	public boolean equals(GuitarSpec spec){
		if(this == spec) return true;
		if (spec == null || getClass() != spec.getClass()) return false;
		
		return model.equals(spec.getModel()) &&
				builder == spec.builder &&
				type == spec.getType() && 
				backWood == spec.backWood &&
				topWood == spec.topWood;
	}
}
