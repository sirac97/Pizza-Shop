package Pizza;

import Beverage.Beverage;
import Pizza.PizzaDecorator.Mushroom;
import Pizza.PizzaDecorator.Olive;
import Pizza.PizzaDecorator.Peperoni;

public class Cook {
    public static String pizzaType="" ;
    public static String beverageType="";
    public static String[] condimentList = null;
    Pizza pizza;
    Beverage beverage ;

    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Pizza")){
            System.out.println(pizzaType + " order received.");

            PizzaFactory factory = new PizzaFactory();
            pizza = factory.makePizza(pizzaType);
            pizza.prepareDough(pizzaType);
            pizza.cookDough(pizzaType);
            pizza.dishUp(pizzaType);
            pizza = decorate(condimentList);

            System.out.println(pizza.getDescription() + " order completed.");
            System.out.println("Cost: ₺" + pizza.cost());

        }
        else if(factoryType.equalsIgnoreCase("Beverage")){
            System.out.println(beverageType + " order received.");

            BeverageFactory factory = new BeverageFactory();
            beverage = factory.makeBeverage(beverageType);
            beverage.prepareBeverage();

            System.out.println(beverage.getDescription() + " order completed.");
            System.out.println("Cost: $" + beverage.cost());
        }
        System.out.println("");
    }



    public Pizza decorate(String[] condimentList){
        for (int i = 0; i < condimentList.length; i++) {
            String condiment = condimentList[i];
            if(condiment.equals("Olive")){
                pizza = new Olive(pizza);
            }
            else if(condiment.equals("Peperoni")){
                pizza = new Peperoni(pizza);
            }
            else if(condiment.equals("Mushroom")){
                pizza = new Mushroom(pizza);
            }
        }
        return pizza;
    }

}
