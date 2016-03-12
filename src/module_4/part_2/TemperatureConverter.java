package module_4.part_2;

public class TemperatureConverter {

    public double convertTempToCelsius (double temperature){
        return (temperature - 32.0) * (5.0/9.0);
    }

    public double convertTempToFahrenheit (double temperature){
        return temperature * (9.0/5.0) + 32.0;
    }

    public static void main(String [] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println(tc.convertTempToCelsius (77.0));
        System.out.println(tc.convertTempToFahrenheit (25.0));
    }
}
