package UnitTests;

import domain.Temperature;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Marcos
 */
public class TemperatureConverter {

    private static Temperature temperature;
    private static final char CELSIUS = 'C';
    private static final char KELVIN = 'K';
    private static final char FAHRENHEIT = 'F';

    public TemperatureConverter() {
    }

    @BeforeClass
    public static void setUpClass() {
        temperature = new Temperature();
    }

    @AfterClass
    public static void tearDownClass() {
        temperature = null;
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldInitTemperatureConverter() {
        Assert.assertNotNull(temperature);
    }
    
    @Test
    public void shoudlFailWhenWrongArgumentIsProvided() {
        Assert.fail();
    }
    
    @Test
    public void shouldConvertFromCelsiusToKelvin() {
        Assert.assertEquals(273.15, temperature.converter(0.0, CELSIUS, KELVIN), 0);
    }
    
    @Test
    public void shouldConvertFromCelsiusToFahrenheit() {
        Assert.assertEquals(84.2, temperature.converter(29, CELSIUS, FAHRENHEIT), 0);
    }
    
    @Test
    public void shouldConvertFromFahrenheitToCelsius() {
        Assert.assertEquals(55.0, temperature.converter(131, FAHRENHEIT, CELSIUS), 0);
    }
    
    @Test
    public void shouldConvertFromFahrenheitToKelvin() {
        Assert.assertEquals(433.15, temperature.converter(320, FAHRENHEIT, KELVIN), 0);
    }
    
    @Test
    public void shouldConvertFromKelvinToCelsius() {
        Assert.assertEquals(16.85, temperature.converter(290, KELVIN, CELSIUS), 0.1);
    }
    
    @Test
    public void shouldConvertFromKelvinToFahrenheit() {
        Assert.assertEquals(1610.33, temperature.converter(1150, KELVIN, FAHRENHEIT), 0.3);
    }
    

}
