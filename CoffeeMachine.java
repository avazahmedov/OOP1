import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    List<BaseCoffee> coffeeList = new ArrayList<>();
    public List<BaseCoffee> getCoffeeList() {
        return coffeeList;
    }

    public CoffeeMachine addCoffee(BaseCoffee coffee){
        coffeeList.add(coffee);
        return this;
    }

    public BaseCoffee searchCoffee(String type, String size){
        for (int i = 0; i < coffeeList.size(); i++) {
            if(getCoffeeList().get(i).getType().equals(type) && getCoffeeList().get(i).getSize().equals(size))
                return getCoffeeList().get(i);
        }
        return null;
    }

    public BaseCoffee searchCoffee(String type){
        for (int i = 0; i < coffeeList.size(); i++) {
            if(getCoffeeList().get(i).getType().equals(type))
                return getCoffeeList().get(i);
        }
        return null;
    }

    public BaseCoffee sellCoffee(BaseCoffee coffee){
        try {
            BaseCoffee soldCoffee = searchCoffee(coffee.getType(), coffee.getSize());
            getCoffeeList().remove(soldCoffee);
            return soldCoffee;
        } catch (Exception ex){
            throw new RuntimeException("Product not found");
        }
    }

}
