import org.example.ConverterAhmed;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class ConvertedTestAhmed     {

        @Test
        public void testToCelsius() {
            double fahrenheit = 32.0;

            ConverterAhmed converter = new ConverterAhmed(fahrenheit);
            double celsius = converter.toCelsius();

            assertEquals(0.0, celsius, 0.001);
        }

        @Test
        public void testKelvinToCelsius() {
            float kelvin = 273.15F;

            float celsius = ConverterAhmed.kelvinToCelsius(kelvin);

            assertEquals(0.0, celsius, 0.001);
        }

        @Test
        public void testFahrenheitToCelsius() {
            double fahrenheit = 212.0;

            double celsius = ConverterAhmed.fahrenheitToCelsius(fahrenheit);

            assertEquals(100.0, celsius, 0.001);
        }
    }





