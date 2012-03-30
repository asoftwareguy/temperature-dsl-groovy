package com.asoftwareguy.temperature

class Temperature {

	static AncientTemperature getFahrenheit(String fahrenheit) {
		new AncientTemperature(fahrenheit as int)
	}
	
	static AncientTemperature getFahrenheit(Integer fareheit) {
		new AncientTemperature(fareheit as int)
	}
	
	static AncientTemperature getCelsius(String celsius) {
		new AncientTemperature(convertFromCelsius(celsius.toInteger()) as int)
	}
	
	static AncientTemperature getCelsius(Integer celsius) {
		new AncientTemperature(convertFromCelsius(celsius) as int)
	}
	
	static AncientTemperature getKelvin(String kelvin) {
		new AncientTemperature(convertFromKelvin(kelvin.toInteger()) as int)
	}
	
	static AncientTemperature getKelvin(Integer kelvin) {
		new AncientTemperature(convertFromKelvin(kelvin) as int)
	}
	
	static AncientTemperature plus(AncientTemperature first, AncientTemperature second) {
		int tempFirst = first.temp
		int tempSecond = second.temp;
		int newTemp = tempFirst + tempSecond
		return new AncientTemperature(newTemp)
	}
	
	static AncientTemperature minus(AncientTemperature first, AncientTemperature second) {
		int tempFirst = first.temp
		int tempSecond = second.temp;
		int newTemp = tempFirst - tempSecond
		return new AncientTemperature(newTemp)
	}
	
	private static BigDecimal convertFromCelsius(Integer celsius) {
		BigDecimal fahrenheit = (celsius *  (9/5) + 32)
		fahrenheit = fahrenheit.setScale(0, BigDecimal.ROUND_HALF_DOWN)
		return fahrenheit
	}
	
	private static BigDecimal convertFromKelvin(Integer kelvin) {
		BigDecimal fahrenheit = ((kelvin - 273) * (9/5) + 32)
		fahrenheit = fahrenheit.setScale(0, BigDecimal.ROUND_HALF_DOWN)
		return fahrenheit
	}
}
