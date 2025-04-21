package homework2.temperatureConverter;

public class TemperatureConverter {
   public void toCelsius(double temp) {
        double inCelsius = (temp - 32) / 1.8;
        System.out.println(temp + " in fahrenheit is equal " + inCelsius + " in celsius" );
    }

    public void toFahrenheit(double temp) {
        double inFahrenheit = temp * 1.8 + 32;
        System.out.println(temp + " in Celsius is equal " + inFahrenheit + " in fahrenheit");
    }
}
