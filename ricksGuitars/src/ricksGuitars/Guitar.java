package ricksGuitars;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	
	public Guitar(String serialNumber,double price,GuitarSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
//		spec = new GuitarSpec(builder,model,type,backWood,topWood);	
		this.spec = spec;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
}
