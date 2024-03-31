package machine;

import coffee.Cappuccino;
import coffee.Espresso;
import coffee.Latte;
import coffee.MakeCoffee;
import view.CoffeeMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeMachine {
    private MakeCoffee makeCoffee;

    public void chooseDrink() {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        Scanner scanner = new Scanner(System.in);

        do {
            coffeeMenu.menuPrint();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    this.makeCoffee = new Espresso();
                    break;
                case 2:
                    this.makeCoffee = new Cappuccino();
                    break;
                case 3:
                    this.makeCoffee = new Latte();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
            }
            choiceDrink();
            System.out.println();
        } while (true);
    }

    private void choiceDrink() {
        if (this.makeCoffee != null) {
            this.makeCoffee.makeCoffee();
        } else {
            System.out.println("\n----------------------------------------------------");
            System.out.println("Invalid choice. Please select an item from the list!");
            System.out.println("----------------------------------------------------");

        }
    }
}
