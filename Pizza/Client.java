package Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String beverageType="";
    public static void main(String[] args){
        Waitress waitress = new Waitress();
        Cook cook = new Cook();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("What do you want to order ? ");
            System.out.println("(1) Pizza ");
            System.out.println("(2) Drink ");
            System.out.println("(Any) Finish ordering");

            int a =scanner.nextInt();
            if(a == 1) {
                ArrayList<String> condimentList = new ArrayList<>();

                String pizzaType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which pizza size do you want ? ");
                    System.out.println("(1) Small Pizza");
                    System.out.println("(2) Medium Pizza");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try{
                        answer = input.readLine();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }

                    if(answer.equals("1")) {
                        pizzaType = "Small Pizza" ;
                        System.out.println("Small is choosen");
                        break;
                    }else if (answer.equals("2")) {
                        pizzaType ="Medium Pizza" ;
                        System.out.println("Medium is chosen");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- INGREDIENTS --------------------");
                Scanner scan2 = new Scanner(System.in);
                for(int i =0 ; i<3 ; i++) {

                    System.out.println("-------------------- Material Types --------------------");
                    System.out.println("(1) Olive --- 0.75$");
                    System.out.println("(2) Mushroom --- 0.65$");
                    System.out.println("(3) Peperoni --- 0.85$");
                    System.out.println("(Other) Finished the selection.");

                    int value = scan2.nextInt();
                    if(value == 1) {
                            condimentList.add("Olive");
                        System.out.println("Olive is chosen");
                    }else if (value == 2) {
                        condimentList.add("Mushroom");
                        System.out.println("Mushroom is chosen");
                    }else if  (value == 3) {
                        condimentList.add("Peperoni");
                        System.out.println("Peperoni is chosen");
                    }else break;
                }

                System.out.println("The selection of materials is completed.");
                System.out.println("");

                String[] condimentArr = new String[condimentList.size()];
                condimentArr = condimentList.toArray(condimentArr);

                PizzaOrder pizzaOrder = new PizzaOrder(cook,pizzaType,condimentArr) ;
                waitress.takeOrder(pizzaOrder);

            }

            else if(a==2){
                Scanner scanBeverage = new Scanner(System.in);
                System.out.println("-------------------- DRINKS --------------------");

                for(int i = 0; i<1; i++) {
                    System.out.println("Drink types");
                    System.out.println("(1) Cola");
                    System.out.println("(2) Fanta");
                    System.out.println("(3) IceTea");
                    System.out.println("(4) Sprite");
                    System.out.println("(Other) I finished the drink selection.");

                    int drink = scanBeverage.nextInt();
                    if(drink==1){
                        beverageType="Cola";
                        System.out.println("Cola is selected");
                    }
                    else if(drink==2){
                        beverageType="Fanta";
                        System.out.println("Fanta is selected");
                    }
                    else if(drink==3){
                        beverageType="IceTea";
                        System.out.println("IceTea is selected");
                    }
                    else if(drink==4){
                        beverageType="Sprite";
                        System.out.println("Sprite is selected");
                    }
                    else {
                        break;
                    }
                }
                System.out.println("The selection of drinks is completed.");
                System.out.println("");

                BeverageOrder beverageOrder = new BeverageOrder(cook, beverageType);
                waitress.takeOrder(beverageOrder);
            }
            else {
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("BON APPETIT");
                break;
            }

        }

    }
}
