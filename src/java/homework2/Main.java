package homework2;

import homework2.circle.Circle;
import homework2.enums.Months;
import homework2.enums.Weekday;
import homework2.temperatureConverter.TemperatureConverter;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        circle.calculateArea();
        TemperatureConverter t = new TemperatureConverter();
        t.toCelsius(125.5);
        t.toFahrenheit(36.6);
        for (Months month: Months.values()) {
            System.out.println(month);
        }
        Weekday sunday = Weekday.SUNDAY;
        Weekday thursday = Weekday.THURSDAY;

        System.out.println("Is Sunday is holiday day? " + sunday.isHoliday());
        System.out.println("Is Thursday is holiday day? " + thursday.isHoliday());
        System.out.println("Is Thursday is work day? " + thursday.isWeekDay());
        String a = "tRue";
        String b = "120";
        String c = "32000";
        String d = "147895632";
        String e = "987654321987654321";
        String f = "4444.5d";
        String g = "2354.56f";
        boolean aa = Boolean.parseBoolean(a.toLowerCase());
        byte bb = Byte.parseByte(b);
        short cc = Short.parseShort(c);
        int dd = Integer.parseInt(d);
        long ee = Long.parseLong(e);
        double ff = Double.parseDouble(f);
        float gg = Float.parseFloat(g);
        System.out.println(aa + " " + bb + " " + cc + " " + dd + " " + ee + " " + ff + " " + gg);
    }
}
