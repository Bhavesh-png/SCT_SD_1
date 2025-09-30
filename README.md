# SCT_SD_1
#Task 1 
# Temperature Converter 🌡️
A simple command-line Java application that converts temperature values between the Celsius, Fahrenheit, and Kelvin scales.

This program provides a straightforward way to perform common temperature conversions directly from your terminal.

## Features

  - **Three-Way Conversion:** Converts temperatures between Celsius, Fahrenheit, and Kelvin.
  - **User-Friendly Interface:** Prompts the user for all necessary inputs in a clear and step-by-step manner.
  - **Formatted Output:** Displays the conversion result rounded to two decimal places for readability.
  - **Lightweight & Simple:** A single-file Java application with no external dependencies.

-----

## How to Use

To run this program, you need to have the Java Development Kit (JDK) installed on your system.

### 1\. Compile the Program

Navigate to the directory containing the `TemperatureConverter1.java` file and compile it using the following command:

```sh
javac TemperatureConverter1.java
```

### 2\. Run the Program

Once compiled, run the application from your terminal:

```sh
java TemperatureConverter1
```

The program will then guide you through the process by asking for the temperature value and the units for conversion.

-----

## Example Usage

Here is an example of converting 25 degrees Celsius to Fahrenheit:

```
Enter the temperature value: 25
Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin): C
Enter the target unit to convert to (C, F, K): F

Result: 25.00° Celsius is equal to 77.00° Fahrenheit.
```

Another example, converting from Kelvin to Fahrenheit:

```
Enter the temperature value: 373.15
Enter the original unit (C for Celsius, F for Fahrenheit, K for Kelvin): K
Enter the target unit to convert to (C, F, K): F

Result: 373.15° Kelvin is equal to 212.00° Fahrenheit.
```

-----

## Technology

  - **Language:** **Java**
  - **Core Libraries:** `java.util.Scanner` for user input.
