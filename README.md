# WordSorter

This project implements a program to sort words in a given text based on the number of occurrences of a specific letter in each word. The sorting is done using `StringBuffer` to manage strings.

## Content

- [Requirements](#Requirements)
- [Installation](#Installation)
- [Startup](#Startup)
- [Using](#Using)
- [Examples](#Examples)

## Requirements

- JDK 17

## Installation

1. Clone the repository:
   
    ```bash
    git clone https://github.com/IK-24KudinaDiana/WordSorter.git
    ```

2. Go to the project directory:
   
    ```bash
    cd WordSorter
    ```

## Startup

- Compile and run the program from the command line:

    ```bash
    javac WordSorter.java
    java WordSorter
    ```

## Using

The program prompts the user to enter a text and a letter for sorting. It then processes the text to count occurrences of the specified letter in each word and sorts the words based on these counts in ascending order. The sorted words are displayed in a single line.

### Input
- **Text**: Any string containing words separated by spaces.
- **Letter**: A single character that the program will use to count occurrences in each word.

### Output
- The program outputs the words sorted based on the count of the specified letter in each word.

## Examples

Example of program execution:

```bash
Введіть текст: яблуко апельсин банан виноград
Введіть літеру для сортування: а
Відсортовані слова: виноград яблуко апельсин банан

