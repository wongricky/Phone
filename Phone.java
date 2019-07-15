
public abstract class Phone {
	protected String versionNumber;
	protected int batteryPercentage;
	protected String carrier;
	protected String ringTone;
	
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
	    this.versionNumber = versionNumber;
	    this.batteryPercentage = batteryPercentage;
	    this.carrier = carrier;
	    this.ringTone = ringTone;
	}
	// abstract method. This method will be implemented by the subclasses
	public abstract void displayInfo();
	public abstract String unlock();
	public abstract String ring();
	
	// getters and setters removed for brevity. Please implement them yourself

	public String getVersion() {
		return this.versionNumber;
	}
	
	public void setVersion(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	
	public String carrier() {
		return this.carrier;
	}
	
	public void setBattery(String carrier) {
		this.carrier = carrier;
	}
	
	public String ringTone() {
		return this.ringTone;
	}
	
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	
}
