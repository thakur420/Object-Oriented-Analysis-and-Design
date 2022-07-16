package dogDoor;

public class Remote {
	private DogDoor dogDoor;
	
	public Remote(DogDoor dogDoor) {
		this.dogDoor = dogDoor;
	}
	
	public void pressButton() {
		System.out.println("Pressing the remote control button...");
		if(!dogDoor.isOpen()) {
			dogDoor.open();
		}
		else {
			dogDoor.close();
		}
	}
}
