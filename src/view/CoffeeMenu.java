package view;

public class CoffeeMenu {
    public void menuPrint() {

        System.out.println("Choose a drink");

        int numberList = 1;
        System.out.printf("%d) - Espresso\n", numberList);

        numberList++;
        System.out.printf("%d) - Cappuccino\n", numberList);

        numberList++;
        System.out.printf("%d) - Latte\n", numberList);

        System.out.printf("%d) - Exit\n", 0);

        System.out.print("Select: ");

    }
}
