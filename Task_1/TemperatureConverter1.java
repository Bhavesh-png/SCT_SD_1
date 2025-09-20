import java.util.Scanner;
public class TemperatureConverter1 {

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = input.nextDouble();

        
        System.out.print("Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char fromUnit = input.next().toUpperCase().charAt(0);

        System.out.print("Enter the target unit to convert to (C, F, K): ");
        char toUnit = input.next().toUpperCase().charAt(0);

        double convertedTemperature = 0.0;
        String fromUnitString = "";
        String toUnitString = "";

        double tempInCelsius = 0.0;
        switch (fromUnit) 
        {
            case 'C':
                tempInCelsius = temperature;
                fromUnitString = "Celsius";
                break;
            case 'F':
                
                tempInCelsius = (temperature - 32) * 5.0 / 9.0;
                fromUnitString = "Fahrenheit";
                break;
            case 'K':
                
                tempInCelsius = temperature - 273.15;
                fromUnitString = "Kelvin";
                break;
            default:
                System.out.println("Invalid original unit. Please use C, F, or K.");
                input.close(); 
                return; 
        }

        
        switch (toUnit) {
            case 'C':
                convertedTemperature = tempInCelsius;
                toUnitString = "Celsius";
                break;
            case 'F':
                
                convertedTemperature = (tempInCelsius * 9.0 / 5.0) + 32;
                toUnitString = "Fahrenheit";
                break;
            case 'K':
                
                convertedTemperature = tempInCelsius + 273.15;
                toUnitString = "Kelvin";
                break;
            default:
                System.out.println("Invalid target unit. Please use C, F, or K.");
                input.close(); 
                return; 
        }

        
        System.out.printf("\nResult: %.2f° %s is equal to %.2f° %s.%n",temperature, fromUnitString, convertedTemperature, toUnitString);

       
        input.close();
    }
}