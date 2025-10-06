package RestaurantMenu;
import java.util.*;


class Pizza extends FoodItem {

    Pizza(int price,int preparingtime,List<String > ingredients) {
        super(price,preparingtime,ingredients);
    }
    public void prepare() {
        System.out.println("preparing the item with :"+getIngredients());
    }
}
