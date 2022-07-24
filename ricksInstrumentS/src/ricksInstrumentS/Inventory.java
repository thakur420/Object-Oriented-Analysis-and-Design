package ricksInstrumentS;
import java.util.*;



public class Inventory {
	private List instruments;
	
	public Inventory() {
		instruments = new LinkedList();
	}
	
	public void addInstrument(String serialNumber,double price,InstrumentSpec instrumentSpec) {
		Instrument instrument = null;
		if(instrumentSpec instanceof GuitarSpec) {
			instrument = new Guitar(serialNumber,price,(GuitarSpec) instrumentSpec);
		}else if(instrumentSpec instanceof MandolinSpec) {
			instrument = new Mandolin(serialNumber,price,(MandolinSpec) instrumentSpec);
		}
		instruments.add(instrument);
	}
	
	public Instrument get(String serialNumber) {
		
		for(Iterator i = instruments.iterator();i.hasNext();) {
			Instrument instrument = (Instrument)i.next();
			if(instrument.getSerialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}
	
	public List search(GuitarSpec searchSpec) {
		List matchingGuitars = new LinkedList();
	    for (Iterator i = instruments.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if(guitar.getSpec().matches(searchSpec)) {
	    	  matchingGuitars.add(guitar);
	      }
	    }
	    return matchingGuitars;
	}
	
	public List search(MandolinSpec searchSpec) {
		List matchingMandolins = new LinkedList();
		for(Iterator i = instruments.iterator();i.hasNext();) {
			Mandolin mandolin = (Mandolin)i.next();
			if(mandolin.getSpec().matches(searchSpec)) {
				matchingMandolins.add(searchSpec);
			}
		}
		return matchingMandolins;
	}
}
