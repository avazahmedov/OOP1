import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.addCoffee(new BlackCoffee("small", 50, 320, "black coffee"))
                .addCoffee(new Latte("medium", 40, 360, "latte", "caramel syrup"))
                .addCoffee(new Сappuccino("big", 55, 370, "cappuccino", "coconut milk"))
                .addCoffee(new Raff("extra big", 65, 380, "raff", "citrus"))
                .addCoffee(new BlackCoffee("medium", 50, 350, "black coffee"))
                .addCoffee(new Latte("big", 40, 375, "latte", "chocolate syrup"))
                .addCoffee(new Сappuccino("small", 55, 325, "cappuccino", "almond milk"))
                .addCoffee(new Raff("extra big", 65, 380, "raff", "vanilla"));

        for (int i = 0; i < coffeeMachine.getCoffeeList().size(); i++) {
            System.out.println(coffeeMachine.getCoffeeList().get(i));
        }

        System.out.println("Enter the coffee type you want to buy: ");
        Scanner in = new Scanner(System.in);
        String requestType = in.nextLine();
        System.out.println("Enter the coffee type you want to buy: ");
        String requestSize = in.nextLine();
        try {
            BaseCoffee sellingCoffee = coffeeMachine.sellCoffee(coffeeMachine.searchCoffee(requestType, requestSize));
            System.out.println("Successfully!");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining products: ");
        for (int i = 0; i < coffeeMachine.getCoffeeList().size(); i++) {
            System.out.println(coffeeMachine.getCoffeeList().get(i));
        }
    }
}
