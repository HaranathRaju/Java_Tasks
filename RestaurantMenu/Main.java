package RestaurantMenu;
import java.util.*;

public class Main  {
     public static void main(String[] args) {
        List<String> l1=new ArrayList(List.of("veggies","toppins","sos")); 
        List<String> l2=new ArrayList<>(List.of("buns","veggies","cheese"));
        FoodItem pizza=new Pizza(400,40,l1);
        FoodItem burger=new Burger(250, 20, l2);

        List<FoodItem> order=new ArrayList<>();
        order.add(pizza);
        order.add(burger);
        for (FoodItem f : order) {
            f.prepare();
            System.out.println("price is : "+f.getPrice()+" Rs");
            System.out.println("preparing time: "+f.getPreparingtime()+" min");
        }


     }
}
