package coffee;

public class Espresso implements MakeCoffee {

    @Override
    public void makeCoffee() {
        System.out.println("Preparing your Espresso...");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n---------------------");
        System.out.println("Your Espresso. Enjoy!");
        System.out.println("---------------------");
    }
}
