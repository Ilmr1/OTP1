import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();


    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50));
        assertFalse(converter.isExtremeTemperature(20));
        assertTrue(converter.isExtremeTemperature(60));
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0, converter.kelvinToCelsius(273.15f), 0.001);
        assertEquals(100.0, converter.kelvinToCelsius(373.15f), 0.001);
        assertEquals(-273.15, converter.kelvinToCelsius(0.0f), 0.001);
    }
}



