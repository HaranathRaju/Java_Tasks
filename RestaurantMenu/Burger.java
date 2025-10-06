
package RestaurantMenu;
import java.util.*;


public class Burger extends FoodItem {
    Burger(int price,int preparingtime,List<String> ingredients) {
        super(price,preparingtime,ingredients);
    }

    public void prepare() {
        System.out.println("preparing with items: "+getIngredients());
    }
}
