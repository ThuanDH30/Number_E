/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package controller;

import static java.lang.Math.sqrt;

/**
 *
 * @author Bravo
 */
public class Number_E extends FunctionManager {
    private Validation valid = new Validation();
    @Override
    public void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = valid.checkInputDouble();
        System.out.print("Enter B: ");
        double b = valid.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        System.out.print("Number is odd: ");
        if (valid.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (valid.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (valid.checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is even: ");
        if (valid.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (valid.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (valid.checkEven(x)) {
            System.out.print(x + " ");
        }
        System.out.print("Number is perfect square: \n");
        if (valid.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (valid.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (valid.checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
    }

    @Override
    public void quadraticEquation() {
        System.out.println("----quadratic Equation----");
        System.out.println("Enter A: ");
        double a = valid.checkInputDouble();
        System.out.println("Enter B: ");
        double b = valid.checkInputDouble();
        System.out.println("Enter c: ");
        double c = valid.checkInputDouble();
        double delta = b * b - 4 * a * c;
        System.out.println("delta :" + delta);
        if (delta < 0) {
            System.out.println("the equation has no solution");
        } else if (delta == 0) {
            System.out.println("The equation has a double solution:");
            double result = -b / 2 * a;
            System.out.println("X1=X2= " + result);
        } else {
            System.out.println("The equation has two distinct solutions");
            double x1 = (-b + sqrt(delta)) / 2 * a;
            double x2 = (-b - sqrt(delta)) / 2 * a;
            System.out.println("X1= " + x1);
            System.out.println("X2= " + x2);
            if (valid.checkOdd(a)) {
                System.out.print(a + " ");
            }
            if (valid.checkOdd(b)) {
                System.out.print(b + " ");
            }
            if (valid.checkOdd(c)) {
                System.out.print(c + " ");
            }
            if (valid.checkOdd(x1)) {
                System.out.print(x1 + " ");
            }
            if (valid.checkOdd(x2)) {
                System.out.print(x2 + " ");
            }
            System.out.println();
            System.out.print("Number is even: ");
            if (valid.checkEven(a)) {
                System.out.print(a + " ");
            }
            if (valid.checkEven(b)) {
                System.out.print(b + " ");
            }
            if (valid.checkEven(c)) {
                System.out.print(b + " ");
            }
            if (valid.checkEven(x1)) {
                System.out.print(x1 + " ");
            }
            if (valid.checkEven(x2)) {
                System.out.print(x1 + " ");
            }
            System.out.println();
            System.out.print("Number is perfect square: ");
            if (valid.checkSquareNumber(a)) {
                System.out.print(a + " ");
            }
            if (valid.checkSquareNumber(b)) {
                System.out.print(b + " ");
            }
            if (valid.checkSquareNumber(c)) {
                System.out.print(c + " ");
            }
            if (valid.checkSquareNumber(x1)) {
                System.out.print(x1 + " ");
            }
            if (valid.checkSquareNumber(x2)) {
                System.out.print(x2 + " ");
            }
            System.out.println();
        }
    }

}
