package com.asoftwareguy.temperature

import org.junit.Test

class TemperatureTest {

    @Test
    void farenheitTemperatures() {
        use(Temperature) {
            assert  "100".fahrenheit.toString() == 'The current temperature is 100 degrees Fahrenheit.'
            assert 	"50".fahrenheit.toString() == 'The current temperature is 50 degrees Fahrenheit.'
            assert 	"32".fahrenheit.toString() == 'The current temperature is 32 degrees Fahrenheit.'
            assert 	100.fahrenheit.toString() == 'The current temperature is 100 degrees Fahrenheit.'
            assert 	50.fahrenheit.toString() == 'The current temperature is 50 degrees Fahrenheit.'
            assert 	32.fahrenheit.toString() == 'The current temperature is 32 degrees Fahrenheit.'
        }
    }

    @Test
    void celsiusTemperatures() {
        use(Temperature) {
            assert 	"100".celsius.toString() == 'The current temperature is 212 degrees Fahrenheit.'
            assert 	"0".celsius.toString() == 'The current temperature is 32 degrees Fahrenheit.'
            assert 	100.celsius.toString() == 'The current temperature is 212 degrees Fahrenheit.'
            assert 	0.celsius.toString() == 'The current temperature is 32 degrees Fahrenheit.'
        }
    }

    @Test
    void kelvinTemperatures() {
        use(Temperature) {
            assert 	273.kelvin.toString() == 'The current temperature is 32 degrees Fahrenheit.'
            assert 	212.kelvin.toString() == 'The current temperature is -78 degrees Fahrenheit.'
        }
    }

    @Test
    void temperatureAddition() {
        use(Temperature) {
            assert (100.fahrenheit + 50.fahrenheit).toString() == 'The current temperature is 150 degrees Fahrenheit.'
            assert (100.fahrenheit + 0.celsius).toString() == 'The current temperature is 132 degrees Fahrenheit.'
        }
    }

    @Test
    void temperatureSubtraction() {
        use(Temperature) {
            assert (100.fahrenheit - 0.celsius).toString() == 'The current temperature is 68 degrees Fahrenheit.'
            assert (100.fahrenheit - 50.fahrenheit).toString() == 'The current temperature is 50 degrees Fahrenheit.'
        }
    }
}