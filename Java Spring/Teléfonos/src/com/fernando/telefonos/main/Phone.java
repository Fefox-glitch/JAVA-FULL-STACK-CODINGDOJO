package com.fernando.telefonos.main;

public abstract class Phone {
	
	//Atributos
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    //Constructor
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    //Get
	public String getVersionNumber() {
		return versionNumber;
	}
	public int getBatteryPercentage() {
		return batteryPercentage;
	}
	public String getCarrier() {
		return carrier;
	}
	public String getRingTone() {
		return ringTone;
	}
	
	//Set
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	
	//Metodo Abstracto
    public abstract void displayInfo();
}
