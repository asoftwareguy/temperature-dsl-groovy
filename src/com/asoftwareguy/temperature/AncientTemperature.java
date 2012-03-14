package com.asoftwareguy.temperature;

/**
 * This is an "old" existing Java class representing temperature.
 * It assumes the unit is Fahrenheit.
 *
 */
public final class AncientTemperature {
	
	// in degrees Fahrenheit
	private int temp;
	
	public AncientTemperature(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("The current temperature is " + temp + " degrees F.").toString();
	}
}
