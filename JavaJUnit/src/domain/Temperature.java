package domain;

public class Temperature {

    private static final double KELVIN = 273.15;
    private static final int FAHRENHEIT = 32;

    /**
     * C stands for Celsius
     * K stands for Kelvin
     * F stands for Fahrenheit
     * @param temperature to be converted
     * @param sourceUnit the temperature unit you have
     * @param targetUnit the temperature unit you want
     * @return the temperature converted.
     */
    public static double converter(double temperature, char sourceUnit, char targetUnit) {
        double result = 0.0;

        switch (sourceUnit) {
            case 'C':
                if (targetUnit == 'K') {
                    result = temperature + KELVIN;
                }
                if (targetUnit == 'F') {
                    result = (temperature * 9/5) + FAHRENHEIT;
                }
                break;
                
            case 'F':
                if (targetUnit == 'C') {
                    result = (temperature - FAHRENHEIT) * 5/9;
                }
                if (targetUnit == 'K') {
                    result = ((temperature - FAHRENHEIT) * 5/9) + KELVIN;
                }
                break;
                
            case 'K':
                if (targetUnit == 'C') {
                    result = temperature - KELVIN;
                }
                if (targetUnit == 'F') {
                    result = ((temperature - KELVIN) * 9/5) + FAHRENHEIT;
                }
                break;
        }
        
        return result;
    }

    // constructor
    public Temperature() {
    }

}
