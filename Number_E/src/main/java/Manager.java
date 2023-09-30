/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import controller.Number_E;
import view.Menu;

/**
 *
 * @author Bravo
 */
public class Manager {
    public static void main(String[] args) {
    Number_E run = new Number_E();
    String[] options = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    Menu menu = new Menu("========= Equation Program =========", options) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    run.superlativeEquation();
                    break;
                case 2:
                    run.quadraticEquation();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
            }
        }

    };
    menu.run ();
}
}
