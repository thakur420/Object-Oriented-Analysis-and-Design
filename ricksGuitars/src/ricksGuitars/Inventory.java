package ricksGuitars;
import java.util.*;

public class Inventory {
	private List guitars;
	
	public Inventory() {
		guitars = new LinkedList();
	}

	public void addGuitar(String serialNumber,double price,GuitarSpec spec) {
//		GuitarSpec spec = new GuitarSpec(model,builder,type,backWood,topWood);
		Guitar guitar = new Guitar(serialNumber,price,spec);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext(); ) {
		      Guitar guitar = (Guitar)i.next();
		      if (guitar.getSerialNumber().equals(serialNumber)) {
		        return guitar;
		      }
		    }
		    return null;
	}
	
	public List search(GuitarSpec searchGuitar) {
		List matchingGuitars = new LinkedList();
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      GuitarSpec guitarSpec = guitar.getSpec();
	      // Ignore serial number since that's unique
	      // Ignore price since that's unique
	      
	      if(!searchGuitar.equals(guitarSpec))
	    	  continue;
	      matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	}
}
