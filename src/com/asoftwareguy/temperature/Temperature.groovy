package com.asoftwareguy.temperature

class Temperature {

	static AncientTemperature getFahrenheit(String fahrenheit) {
		new AncientTemperature(fahrenheit as int)
	}

	static AncientTemperature getCelsius(String celsius) {
		BigDecimal fahrenheit = (celsius.toInteger() *  (9/5) + 32)
		fahrenheit = fahrenheit.setScale(0, BigDecimal.ROUND_DOWN)
		new AncientTemperature(fahrenheit.toString() as int)
	}
	
	static AncientTemperature getFahrenheit(Integer fareheit) {
		new AncientTemperature(fareheit)
	}

	static AncientTemperature getCelsius(Integer celsius) {
		BigDecimal fahrenheit = (celsius *  (9/5) + 32)
		fahrenheit = fahrenheit.setScale(0, BigDecimal.ROUND_DOWN)
		new AncientTemperature(fahrenheit.toString() as int)
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
}
