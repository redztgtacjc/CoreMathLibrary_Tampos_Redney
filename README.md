Project: Core Math Library (OOP Implementation)
================================================

OVERVIEW
--------
This Java application demonstrates the core Object-Oriented Programming (OOP) principles:
1. Encapsulation: Protecting data by using private variables and public getter/setter methods.
2. Inheritance: Creating a hierarchy where specific math modules (Child classes) inherit from a general operation class (Parent class).

CLASS STRUCTURE
---------------
1. MathOperation (Parent Class)
   - Purpose: Handles the storage of two operands (operand1, operand2).
   - Key Feature: Uses private attributes to ensure data security (Encapsulation).

2. Arithmetic (Child Class)
   - Extends: MathOperation
   - Features: Performs fundamental operations: Addition, Subtraction, Multiplication, and Division.
   - error Handling: Returns "NaN" (Not a Number) if dividing by zero.

3. Geometry (Child Class)
   - Extends: MathOperation
   - Features: Calculates Area and Circumference for circles; Area and Perimeter for rectangles.
   - Validation: Returns -1.0 if negative dimensions are provided.

4. NumberAnalysis (Child Class)
   - Extends: MathOperation
   - Features:
     - Prime Check: Determines if a number is prime.
     - Factorial: Calculates the factorial of a non-negative integer.

HOW TO RUN
----------
1. Open the project in Apache NetBeans.
2. Locate 'Main.java' in the source packages.
3. Right-click 'Main.java' and select "Run File" (or press Shift + F6).
4. The console will display the results of the arithmetic, geometric, and analysis tests.
