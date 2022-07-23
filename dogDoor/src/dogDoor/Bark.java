package dogDoor;

public class Bark {
	private String sound;
	
	public Bark(String sound) {
		this.sound = sound;
	}
	
	public String getSound() {
		return sound;
	}
	
	public boolean equals(Bark bark) {
		if(this == bark) return true;
		if (bark == null || getClass() != bark.getClass()) return false;
		
		return sound.equalsIgnoreCase(bark.getSound());
	}
}
