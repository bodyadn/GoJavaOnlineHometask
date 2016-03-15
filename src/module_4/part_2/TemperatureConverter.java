package module_4.part_2;

public class TemperatureConverter {

    public static final double COEFFICIENT1 = 32.0;
    public static final double COEFFICIENT2 = 5.0 / 9.0;

    public double convertTempToCelsius (double temperature){
        return (temperature - COEFFICIENT1) * COEFFICIENT2;
    }

    public double convertTempToFahrenheit (double temperature){
        return temperature * (1/COEFFICIENT2) + COEFFICIENT1;
    }

    public static void main(String [] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.convertTempToCelsius (77.0));
        System.out.println(tc.convertTempToFahrenheit (25.0));
    }
}
