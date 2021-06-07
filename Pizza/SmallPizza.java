package Pizza;

public class SmallPizza extends Pizza{

    public  SmallPizza(){
        description = "Small Pizza";
    }


    @Override
    public double cost() {
        return 4.0;
    }
}
