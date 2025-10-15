# String Calculator

**Project Type:** Java | Maven | TDD (Test-Driven Development)

**Description:**  
This project implements a **String Calculator** following TDD principles.  
The goal is to create a calculator that takes a string of numbers separated by commas or custom delimiters and returns the sum.  
This is a common kata (practice problem) for learning **TDD and clean code practices**.

---

## 📋 Features

- Add numbers from a string input, e.g. `"1,2,3"` → `6`
- Handle empty string input → returns `0`
- Support new lines as separators, e.g. `"1\n2,3"` → `6`
- Support custom delimiters, e.g. `"//;\n1;2"` → `3`
- Throw exceptions for negative numbers
- Ignore numbers larger than 1000
- Well-tested using **JUnit 5**

---

## 🛠 Technology Stack

- **Language:** Java 23
- **Build Tool:** Maven
- **Testing:** JUnit 5
- **IDE:** IntelliJ IDEA
- **Version Control:** Git & GitHub

---
🧱 Project Setup

Clone the repository

git clone https://github.com/Raju0629/string-calculator.git
cd string-calculator

Run tests:

mvn test

Run build:

mvn clean install

Example Usage:

StringCalculator calc = new StringCalculator();

System.out.println(calc.add(""));            // 0  
System.out.println(calc.add("1"));           // 1  
System.out.println(calc.add("1,2,3"));       // 6  
System.out.println(calc.add("1\n2,3"));      // 6  
System.out.println(calc.add("//;\n1;2;3"));  // 6  
System.out.println(calc.add("//[***]\n1***2***3")); // 6

⚙️ TDD Development Process

Each step followed the Red → Green → Refactor cycle:

Write a failing test (Red)

Implement minimal code to pass (Green)

Refactor and commit

Branch strategy:

main → stable production-ready code

feature/add-tests → used for TDD incremental commits

🧾 Git Workflow Summary

# Create and switch to feature branch
git checkout -b feature/add-tests

# After implementing each step
git add .
git commit -m "test: add failing test for <feature>"
git commit -m "feat: implement <feature>"
git push origin feature/add-tests

# After completing all steps
# On GitHub: Create Pull Request -> Merge into main
Final Notes

All requirements from the String Calculator Kata have been implemented.

All tests pass successfully (mvn test shows green).

The repository demonstrates clean, incremental commits showing the TDD flow.




