package Pizza;

public class PizzaFactory {

    public Pizza makePizza(String pizzaType) {
        if(pizzaType.equals(null)){
            return null;
        }
        else if(pizzaType.equals("Small Pizza")){
            return new SmallPizza();
        }
        else if(pizzaType.equals("Medium Pizza")){
            return new MediumPizza();
        }
        return null;
    }
}
