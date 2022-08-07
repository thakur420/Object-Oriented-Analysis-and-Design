package ricksInstrumentsCohesive;

public class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec instrumentSpec;
	
	public Instrument(String serialNumber,double price,InstrumentSpec instrumentSpec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.instrumentSpec = instrumentSpec;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public InstrumentSpec getSpec() {
		return instrumentSpec;
	}

}
