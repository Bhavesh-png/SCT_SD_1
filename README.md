# SCT_SD_1
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
`````````````````
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# SCT_SD_2
# 🎮 Number Guessing Game
A simple, interactive command-line number guessing game built in Java. The program generates a random number within a specified range (1-100), and the player's goal is to guess it in the fewest attempts possible.

# ✨ Features
Random Number Generation: A new secret number is generated for every game.

Interactive Feedback: The game tells you if your guess is too high or too low.

Attempt Counter: Tracks how many guesses it took you to win.

Input Validation: Gracefully handles non-numeric inputs without crashing.

Play Again: Option to start a new game immediately after winning.

# 🚀 How to Run
You'll need a Java Development Kit (JDK) installed on your system to run the game.

Clone the repository or download the code:

Bash

git clone https://github.com/Bhavesh-png/SCT_SD_1/tree/main/Task_2
Compile the Java file:
Open your terminal or command prompt and run the Java compiler.

Bash

javac GuessTheNumber.java
Run the program:
Execute the compiled code to start the game.

Bash

java GuessTheNumber
Now, follow the on-screen prompts to play!

# 🕹️ Example Gameplay
--- Welcome to the Number Guessing Game! ---
I've picked a number between 1 and 100.
Try to guess it!

Enter your guess: 50
Too high! Try again.

Enter your guess: 25
Too low! Try again.

Enter your guess: 37
Too high! Try again.

Enter your guess: 32
🎉 Congratulations! You guessed the number!
It took you 4 tries.

Do you want to play again? (yes/no): no
Thanks for playing! Goodbye. 👋
# 🛠️ Built With
Java - The core programming language used.
-----

## Technology

  - **Language:** **Java**
  - **Core Libraries:** `java.util.Scanner` for user input.
  - **Core Libraries:**`java.util.Random` for random output.
    ```
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# SCT_SD_3
# Sudoku Solver 🧩
A command-line Java application that automatically solves 9x9 Sudoku puzzles using a backtracking algorithm.

This program takes a 2D integer array representing an unsolved Sudoku grid and fills in the missing numbers to find a valid solution.

Features
Algorithmic Solver: Implements a recursive backtracking algorithm to efficiently find solutions.

Dynamic Input: Easily change the puzzle by modifying the input grid directly in the source code.

Clear Output: Displays the unsolved puzzle first, followed by the neatly formatted solved grid.

Unsolvable Detection: Reports if a given puzzle has no valid solution.

Self-Contained: A single-file Java application with no external dependencies.

Algorithm Used: Backtracking
The program solves the puzzle by exploring every possible placement of numbers and "backtracking" when a path leads to an invalid state.

Find an Empty Cell: It scans the grid for a cell with a 0.

Try Numbers 1-9: It attempts to place a number from 1 to 9 in that cell.

Check Validity: For each attempt, it checks if the number is valid in its current row, column, and 3x3 sub-grid.

Recurse: If the number is valid, it recursively calls itself to continue solving the rest of the puzzle.

Backtrack: If a recursive path fails (i.e., leads to a dead end), it undoes the move (resets the cell to 0) and tries the next number.

This process continues until a full, valid solution is found or all possibilities have been exhausted.

How to Use
To run this program, you need to have the Java Development Kit (JDK) installed on your system.

1. Compile the Program
Navigate to the directory containing the SudokuSolver.java file and compile it using the following command:

Bash

javac SudokuSolver.java
2. Run the Program
Once compiled, run the application from your terminal:

Bash

java SudokuSolver
The program will print the unsolved and solved versions of the puzzle defined in the main method.

Example Output
The program will display the following output for the default puzzle:
# Unsolved Sudoku Puzzle:
5 3 0 | 0 7 0 | 0 0 0
6 0 0 | 1 9 5 | 0 0 0
0 9 8 | 0 0 0 | 0 6 0
---------------------
8 0 0 | 0 6 0 | 0 0 3
4 0 0 | 8 0 3 | 0 0 1
7 0 0 | 0 2 0 | 0 0 6
---------------------
0 6 0 | 0 0 0 | 2 8 0
0 0 0 | 4 1 9 | 0 0 5
0 0 0 | 0 8 0 | 0 7 9
-
# ✅ Solved Sudoku Puzzle:
5 3 4 | 6 7 8 | 9 1 2
6 7 2 | 1 9 5 | 3 4 8
1 9 8 | 3 4 2 | 5 6 7
---------------------
8 5 9 | 7 6 1 | 4 2 3
4 2 6 | 8 5 3 | 7 9 1
7 1 3 | 9 2 4 | 8 5 6
---------------------
0 6 0 | 0 0 0 | 2 8 0
0 0 0 | 4 1 9 | 0 0 5
0 0 0 | 0 8 0 | 0 7 9
-
# Technology Used: 
Language: Java
    ```
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# SCT_SD_4
# Java E-commerce Web Scraper 

A practical Java web scraper built with the **Jsoup** library. This project connects to the e-commerce sandbox website [books.toscrape.com](http://books.toscrape.com/), extracts product information, and saves it to a local CSV file.  

This project was created as part of my software development internship with **SkillCraft Technology**.

---

## 🎞️ Project Demo

A video demonstrating the program's execution and the resulting CSV file is available, showcasing the successful scraping process from start to finish.

---

## 📋 Table of Contents

- [Features](#-features)  
- [Prerequisites](#-prerequisites)  
- [How to Use](#-how-to-use)  
  - [From the Command Line](#from-the-command-line)  
  - [Using an IDE](#using-an-ide)  
- [Example Output](#-example-output)  
- [Technology](#-technology)  
- [Contributing](#-contributing)  
- [License](#-license)  

---

## ✨ Features

- **Web Page Scraping**: Connects to the target URL and fetches the full HTML content.  
- **Data Extraction**: Parses the HTML using CSS selectors to extract key product details:  
  - Full product title  
  - Price (including currency symbol)  
  - Star rating (as text, e.g., "Three")  
- **CSV Export**: Writes the collected data into a structured CSV file named `products.csv`.  
- **Robust Parsing**: Utilizes **Jsoup** to efficiently navigate and manipulate the HTML DOM.  

---

## 🛠️ Prerequisites

- Java Development Kit (JDK) 8 or higher  
- [Jsoup Library](https://jsoup.org/download) (`jsoup-1.21.2.jar`)  

---

## 🚀 How to Use

### From the Command Line

1. Place `EcommerceScraper.java` and `jsoup-1.21.2.jar` in the same directory.  
2. Open your terminal or command prompt in that directory.  
3. Compile the Java file including the Jsoup JAR in the classpath:  

**Windows:**  
```bash
javac -cp .;jsoup-1.21.2.jar EcommerceScraper.java
````

**macOS/Linux:**

```bash
javac -cp .:jsoup-1.21.2.jar EcommerceScraper.java
```

4. Run the compiled program:

**Windows:**

```bash
java -cp .;jsoup-1.21.2.jar EcommerceScraper
```

**macOS/Linux:**

```bash
java -cp .:jsoup-1.21.2.jar EcommerceScraper
```

5. A `products.csv` file will be generated in the same directory.

---

### Using an IDE (VS Code, IntelliJ, Eclipse)

1. Create a new Java project in your IDE.
2. Add `EcommerceScraper.java` to your project's `src` folder.
3. Add `jsoup-1.21.2.jar` to your project dependencies (often by creating a `lib` folder and adding it to the build path).
4. Run the `main` method in `EcommerceScraper.java`.
5. The `products.csv` file will appear in the project root directory.

---

## 📊 Example Output (`products.csv`)

| Product Name                          | Price  | Rating |
| ------------------------------------- | ------ | ------ |
| A Light in the Attic                  | £51.77 | Three  |
| Tipping the Velvet                    | £53.74 | One    |
| Soumission                            | £50.10 | One    |
| Sharp Objects                         | £47.82 | Four   |
| Sapiens: A Brief History of Humankind | £54.23 | Five   |

---

## 💻 Technology

* **Language**: Java
* **Libraries**:

  * [Jsoup](https://jsoup.org/) for HTML parsing
  * `java.io.FileWriter` for CSV file writing

---

## 🙌 Contributing

Contributions are welcome! Feel free to fork this repository and submit a pull request with improvements.

---

## 📄 License

This project is open-source under the **MIT License**.

```

---

If you want, I can also create a **more visually appealing GitHub-ready version** with badges for **Java**, **MIT License**, and **Jsoup**, making it stand out on your profile.  

Do you want me to do that?
```
