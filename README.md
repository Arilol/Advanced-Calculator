# Advanced-Calculator

This application uses a Java framework called Javaluator, developed by Fathzer. It's a simple and powerful Java infix expression evaluator, and has the ability to have new functions added. 
Visit http://javaluator.sourceforge.net/en/home/ for more information. The most important aspects of this application are the abilities to perform complex expressions,
simple calculations, trigonometric calculations, scientific notations, and logarithmic calculations. All these add more options of calculations for the user to pick.

**State Diagram**

Here is a state diagram of the advanced calculator.

![](https://github.com/Arilol/Advanced-Calculator/blob/master/A5Diagram.PNG)

**User stories**

1. As a calculator user, I want a number pad, so that i can input digits.
2. As a calculator user, I want a decimal dot button, so that i can input decimal numbers.
3. As a calculator user, I want brackets, so that i can use them to calculate a result.
4. As a calculator user, I want a plus/minus button, so that i can input negative numbers.
5. As a calculator user, I want operator buttons, so that i can perform operations to calculate a result.
6. As a calculator user, I want a clear button, so that i can erase the input in the screen.
7. As a calculator user, I want a backspace button, so that i can remove certain inputted characters or digits.
8. As a calculator user, I want a scientific notation button, so that i can input a certain number in the scientific notation.
9. As a calculator user, I want trigonometric function buttons, so that i can input trigonometric functions to the screen.
10. As a calculator user, I want logarithmic function buttons, so that i can input logarithmic functions to the screen.
11. As a calculator user, I want constant number buttons, preferably Euler's number and Pi, so that i can input them to the screen.
12. As a calculator user, I want the square root function button, so that i can input the square root to the screen.
13. As a calculator user, I want the absolute value function button, so that i can input the absolute value function to the screen.
14. As a calculator user, I want the Radians/Degrees button, so that can convert my trigonometric result into Radians or Degrees.
15. As a calculator user, I want the equal, so that I can see the calculated result.

**Test cases**

Test case 1: Square root of -1 check

Instructions: Open the Advanced Calculator App and type "√((-1))" or "√(-1)".
Expected result: A toast pop up appears and says "Can't show undefined result".
Cleanup: Press C.

-------------------------------------------------------

Test case 2: Expression evaluation check

Instructions: Open the Advanced Calculator App and type "((8+2)×(9%6)÷(7-4))^2".
Expected result: A result of 100.0 is shown on the screen.
Cleanup: Press C.

-------------------------------------------------------

Test case 3: Negative number transformation check

Instructions: Open the Advanced Calculator App and type any number and press the plus/minus button.
Expected result: A negative number is shown on the screen.
Cleanup: Press C.

-------------------------------------------------------

Test case 4: Backspace check

Instructions: Open the Advanced Calculator App, type any number, then press backspace until the number is completely gone.
Expected result: 0 is shown on the screen.
Cleanup: 

-------------------------------------------------------

Test case 5: Sine function check

Instructions: Open the Advanced Calculator App, rotate it, and type sin(45). Press C, type sin(45), and then press Deg. 
Expected result: 0.7071 is shown on the screen, when the user types sin(45) and presses Deg, 0.851 is shown.
Cleanup: Press C.

-------------------------------------------------------

Test case 6: Cosine function check

Instructions: Open the Advanced Calculator App, rotate it, and type cos(45). Press C, type cos(45), and then press Deg. 
Expected result: 0.7071 is shown on the screen, when the user types cos(45) and presses Deg, 0.525 is shown.
Cleanup: Press C.

-------------------------------------------------------

Test case 7: Tangent function check

Instructions: Open the Advanced Calculator App, rotate it, and type tan(45). Press C, type tan(45), and then press Deg. 
Expected result: 1 is shown on the screen, when the user types tan(45) and presses Deg, 1.6197 is shown.
Cleanup: Press C.

-------------------------------------------------------

Test case 8: Arcsine function check

Instructions: Open the Advanced Calculator App, rotate it, and type sin⁻¹(1). Press C, type sin⁻¹(1), and then press Deg. 
Expected result: 0.017 is shown on the screen, when the user types sin⁻¹(1) and presses Deg, 1.5707 is shown.
Cleanup: Press C.

-------------------------------------------------------

Test case 9: Arccosine function check

Instructions: Open the Advanced Calculator App, rotate it, and type cos⁻¹(1). Press C, type cos⁻¹(1), and then press Deg. 
Expected result: 1.553 is shown on the screen, when the user types cos⁻¹(1) and presses Deg, 0 is shown.
Cleanup: Press C.

-------------------------------------------------------

Test case 10: Arctangent function check

Instructions: Open the Advanced Calculator App, rotate it, and type tan⁻¹(1). Press C, type tan⁻¹(1), and then press Deg.
Expected result: 0.017 is shown on the screen, when the user types tan⁻¹(1) and presses Deg, 0.785 is shown.
Cleanup: Press C.

-------------------------------------------------------

Test case 11: Natural logarithm function check

Instructions: Open the Advanced Calculator App, rotate it, and type ln(1).
Expected result: 0 is shown on the screen.
Cleanup: Press C.

-------------------------------------------------------

Test case 12: Logarithm check

Instructions: Open the Advanced Calculator App, rotate it, and type log(1000).
Expected result: 3 is shown on the screen.
Cleanup: Press C.

-------------------------------------------------------

Test case 13: Factorial function check

Instructions: Open the Advanced Calculator App, rotate it, and type fac(5).
Expected result: 120 is shown on the screen.
Cleanup: Press C.

-------------------------------------------------------

Test case 14: Second expression evaluation function check

Instructions: Open the Advanced Calculator App, rotate it, and type fac(3)+ln(e^(4))+√(log(10)).
Expected result: 11 is shown on the screen.
Cleanup: Press C.
