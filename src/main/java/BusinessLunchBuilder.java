import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author galya_semenova
 *
 */
public class BusinessLunchBuilder implements LunchBuilder{
    /**
     * name - name of the business lunch
     */
    private String name;
    /**
     * foodItems - list of food with its weights
     */
    private final ArrayList<HashMap<Food, Double>> foodItems = new ArrayList<>();
    /**
     * Constructor of the business lunch builder
     */
    public BusinessLunchBuilder() {
        super();
    }
    /**
     * Method for filling in the field name and returning BusinessLunchBuilder object.
     * @return BusinessLunchBuilder object
     */
    @Override
    public LunchBuilder name() {
        this.name = "Business lunch: borsch, rice with pork, fruit drink";
        return this;
    }
    /**
     * Method for filling in the field foodItems with hashmap and returning BusinessLunchBuilder object.
     * @return BusinessLunchBuilder object
     */
    @Override
    public LunchBuilder foodItem() {
        HashMap<Food, Double> hm = new HashMap<>();
        Food borsch = new FoodBuilder().name("Borsch").proteins(1.37).fats(1.64).carbohydrates(3.37).build();
        Food rice = new FoodBuilder().name("Rice").proteins(2.75).fats(0.4).carbohydrates(24.84).build();
        Food pork = new FoodBuilder().name("Pork").proteins(27.1).fats(13.8).carbohydrates(0.0).build();
        Food fruitDrink = new FoodBuilder().name("Fruit drink").proteins(0.0).fats(0.0).carbohydrates(12.0).build();
        hm.put(borsch, 3.5);
        hm.put(rice, 1.3);
        hm.put(pork, 1.1);
        hm.put(fruitDrink, 2.0);
        foodItems.add(hm);
        return this;
    }

    /**
     * Method for creating Lunch object
     * @return Lunch object with set parameters
     */
    @Override
    public Lunch build() {
        return new Lunch(name, foodItems);
    }
}
