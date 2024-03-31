package coffee;

public class Latte implements MakeCoffee{
    @Override
    public void makeCoffee() {
        System.out.println("Preparing your Latte...");
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n-------------------");
        System.out.println("Your Latte. Enjoy!");
        System.out.println("-------------------");
    }
}
