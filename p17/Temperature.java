package p17;

public class Temperature {

        public void convert(double celsius) {

        if (celsius < -273.15) {
            System.out.println("Invalid Temperature (Below absolute zero)");
            return;
        }

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }

    
    public void convert(double fahrenheit, int type) {

        if (fahrenheit < -459.67) {
            System.out.println("Invalid Temperature (Below absolute zero)");
            return;
        }

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
    }
}