import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author galya_semenova
 * An express lunch builder with a food list specific for this type of lunch.
 */
public class ExpressLunchBuilder implements LunchBuilder {
    /**
     * name - name of the express lunch
     */
    private String name;
    /**
     * foodItems - list of food with its weights
     */
    private final ArrayList<HashMap<Food, Double>> foodItems = new ArrayList<>();

    /**
     * Constructor of the express lunch builder
     */
    public ExpressLunchBuilder() {
        super();
    }

    /**
     * Method for filling in the field name and returning ExpressLunchBuilder object.
     * @return ExpressLunchBuilder object
     */
    @Override
    public LunchBuilder name() {
        this.name = "Express lunch: hot dog, coffee and twix";
        return this;
    }
    /**
     * Method for filling in the field foodItems with hashmap and returning ExpressLunchBuilder object.
     * @return ExpressLunchBuilder object
     */
    @Override
    public LunchBuilder foodItem() {
        HashMap<Food, Double> hm = new HashMap<>();
        Food hotDog = new FoodBuilder().name("Hot dog").proteins(11.86).fats(15).carbohydrates(18.4).build();
        Food coffee = new FoodBuilder().name("Cappuccino").proteins(4.08).fats(4).carbohydrates(5.84).build();
        Food twix = new FoodBuilder().name("Twix").proteins(4.1).fats(24.2).carbohydrates(64.8).build();
        hm.put(hotDog, 3.0);
        hm.put(coffee, 2.4);
        hm.put(twix, 0.82);
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
