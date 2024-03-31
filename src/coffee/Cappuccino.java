package coffee;

public class Cappuccino implements MakeCoffee{
    @Override
    public void makeCoffee() {
        System.out.println("Preparing your Cappuccino...");
        try {
            Thread.sleep(15000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("\n-----------------------");
        System.out.println("Your Cappuccino. Enjoy!");
        System.out.println("-----------------------");
    }
}
