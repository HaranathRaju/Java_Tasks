
package RestaurantMenu;
import java.util.*;

public abstract class FoodItem {
    private int price;
    private int preparingtime;
    List<String > ingreadients;
    

    public FoodItem(int price,int preparingtime,List<String > ingredients) {
        this.price=price;
        this.preparingtime=preparingtime;
        this.ingreadients=ingredients;
    } 
    public int getPrice() {
        return price;
    }  
    public int getPreparingtime() {
        return preparingtime;
    }

    public List<String> getIngredients() {
        return ingreadients;
    }

    public abstract void prepare(); 
}

