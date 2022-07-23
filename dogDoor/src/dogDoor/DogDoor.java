package dogDoor;
import java.util.*;

public class DogDoor {
	private boolean open;
	private List<Bark> allowedBark;
	public DogDoor() {
		this.open = true;
		allowedBark = new ArrayList<Bark>();
	}
	
	public void open() {
		System.out.println("The Dog Door opens.");
		open = true;
		
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}
	
	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public void addAllowedBark(Bark bark) {
		allowedBark.add(bark);
	}
	
	public List<Bark> getAllowedBark(){
		return allowedBark;		
	}
}
