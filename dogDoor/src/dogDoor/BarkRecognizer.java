package dogDoor;
import java.util.*;
public class BarkRecognizer {
	private DogDoor dogDoor;
	
	public BarkRecognizer(DogDoor dogDoor) {
		this.dogDoor = dogDoor;
	}
	
	public void recognize(Bark bark) {
		System.out.println("   BarkRecognizer: Heard a '" +bark.getSound() + "'");
		List<Bark> allowedBarks = dogDoor.getAllowedBark();
		for(Bark allowedbark : allowedBarks) {
			if(allowedbark.equals(bark)) {
				dogDoor.open();
				return ;
			}
		}
		System.out.println("This dog is not allowed.");
	}
}
