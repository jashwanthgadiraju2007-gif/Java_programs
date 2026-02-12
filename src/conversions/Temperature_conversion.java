package conversions;

	public class Temperature_conversion {

	    public static void celsiusToFahrenheit(double celsius) {
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println("Fahrenheit: " + fahrenheit);
	    }

	    public static void main(String[] args) {
	        celsiusToFahrenheit(25);
	    }
	}

