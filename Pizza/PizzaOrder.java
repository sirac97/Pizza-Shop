package Pizza;

public class PizzaOrder implements Command{

    Cook cook;
    String[] condimentList;
    String order;


    public PizzaOrder(Cook cook, String order, String[] condimentList){
        this.cook = cook;
        this.order = order;
        this.condimentList = condimentList;
    }



    @Override
    public void orderUp() {
        cook.pizzaType = order;
        cook.condimentList = this.condimentList;
        cook.getOrder("Pizza");

    }
}
