package app;

import java.io.Serializable;

public class MountainBike extends Bicycle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4545668365347492086L;

	private int seatHeight;
	private String tireSpecs = "Default";

	public MountainBike(int gear, int speed, int height) {
		super(gear, speed);
		this.seatHeight = height;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public String getTireSpecs() {
		return tireSpecs;
	}

	public void setTireSpecs(String tireSpecs) {
		this.tireSpecs = tireSpecs;
	}

}
