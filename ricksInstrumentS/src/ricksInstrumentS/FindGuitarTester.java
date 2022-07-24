package ricksInstrumentS;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", 
                Type.ELECTRIC,4, Wood.ALDER, Wood.ALDER);
		
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar = (Guitar)i.next();
				InstrumentSpec spec = guitar.getSpec();
				System.out.println("  We have a " +
						spec.getBuilder() + " " + spec.getModel() + " " +
						spec.getType() + " guitar:\n     " +
						spec.getBackWood() + " back and sides,\n     " +
						spec.getTopWood() + " top.\n  You can have it for only $" +
						guitar.getPrice() + "!\n  ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
	    inventory.addInstrument("11277", 3999.95, new GuitarSpec(Builder.COLLINGS, 
	                        "CJ", Type.ACOUSTIC,4, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
	    
	    inventory.addInstrument("V95693", 1499.95, new GuitarSpec(Builder.FENDER, 
	                        "Stratocastor", Type.ELECTRIC,8,Wood.ALDER, Wood.ALDER));
	    
	    inventory.addInstrument("V9512", 1549.95, new GuitarSpec(Builder.FENDER, 
	                        "Stratocastor", Type.ELECTRIC,4,
	                        Wood.ALDER, Wood.ALDER));
	    
	    inventory.addInstrument("122784", 5495.95, new GuitarSpec(Builder.MARTIN, 
	                        "D-18", Type.ACOUSTIC,4,Wood.MAHOGANY, Wood.ADIRONDACK));
	    
	    inventory.addInstrument("76531", 6295.95, new GuitarSpec(Builder.MARTIN, 
	                        "OM-28", Type.ACOUSTIC,4,Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
	    
	    inventory.addInstrument("70108276", 2295.95, new GuitarSpec(Builder.GIBSON, 
	                        "Les Paul", Type.ELECTRIC,8,Wood.MAHOGANY, Wood.MAHOGANY));
	    
	    inventory.addInstrument("82765501", 1890.95, new MandolinSpec(Builder.GIBSON, 
	                        "SG '61 Reissue", Type.ELECTRIC,Style.A,Wood.MAHOGANY, Wood.MAHOGANY));
	    
	    inventory.addInstrument("77023", 6275.95, new MandolinSpec(Builder.MARTIN, 
	                        "D-28", Type.ACOUSTIC,Style.F,Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
	    
	    inventory.addInstrument("1092", 12995.95, new MandolinSpec(Builder.OLSON, 
	                        "SJ", Type.ACOUSTIC,Style.F,Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
	    
	    inventory.addInstrument("566-62", 8999.95, new MandolinSpec(Builder.RYAN, 
	                        "Cathedral", Type.ACOUSTIC,Style.A,Wood.COCOBOLO, Wood.CEDAR));
	    
	    inventory.addInstrument("6 29584", 2100.95, new MandolinSpec(Builder.PRS, 
	                        "Dave Navarro Signature", Type.ELECTRIC,Style.A, Wood.MAHOGANY, Wood.MAPLE));
	  }
}

