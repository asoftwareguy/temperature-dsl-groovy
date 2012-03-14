package com.asoftwareguy.temperature

use(Temperature) {
	assert  "100".fahrenheit.toString() == 'The current temperature is 100 degrees F.'
	println "100".fahrenheit
	
	assert 	"50".fahrenheit.toString() == 'The current temperature is 50 degrees F.'
	println "50".fahrenheit
	
	assert 	"32".fahrenheit.toString() == 'The current temperature is 32 degrees F.'
	println "32".fahrenheit
	
	assert 	"100".celsius.toString() == 'The current temperature is 212 degrees F.'
	println "100".celsius
	
	assert 	100.fahrenheit.toString() == 'The current temperature is 100 degrees F.'
	println 100.fahrenheit
	
	assert 	50.fahrenheit.toString() == 'The current temperature is 50 degrees F.'
	println 50.fahrenheit
	
	assert 	32.fahrenheit.toString() == 'The current temperature is 32 degrees F.'
	println 32.fahrenheit
	
	assert 	100.celsius.toString() == 'The current temperature is 212 degrees F.'
	println 100.celsius
	
	assert (100.fahrenheit + 50.fahrenheit).toString() == 'The current temperature is 150 degrees F.'
	println 100.fahrenheit + 50.fahrenheit
	
	assert (100.fahrenheit + 0.celsius).toString() == 'The current temperature is 132 degrees F.'
	println 100.fahrenheit + 0.celsius
	
	assert (100.fahrenheit - 0.celsius).toString() == 'The current temperature is 68 degrees F.'
	println 100.fahrenheit - 0.celsius
}