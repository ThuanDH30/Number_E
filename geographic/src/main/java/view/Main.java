/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Manager;

/**
 *
 * @author Bravo
 */
public class Main {
    public static void main(String[] args) {
        Manager run = new Manager();
        String[] options = {"Input the information of 11 countries in East Asia", "Display the information of country you've just input", "Search the information of country by user-entered name", "Display the information of countries sorted name in ascending order", "Exit"};
        Menu menu = new Menu("MENU\n"
                + "==========================================================================", options) {
            @Override

            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        run.inputCountry();
                        break;
                    case 2:
                        run.printCountry();
                        break;
                    case 3:
                        run.searchByName();
                        break;
                    case 4:
                        run.printCountrySorted();
                        break;
                    case 5:
                        System.out.println("Exit");
                }
            }
        };
        menu.run();
    }

}
