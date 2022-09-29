import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;
/**
 * @author galya_semenova
 * This class tests the ExpressLunchBuilder class
 */
public class ExpressLunchBuilderTest {
    /**
     * The method tests the creation of an object with the help of a director and by simply creating a lunch
     * with passing parameters. If the string representations are the same, then the Director is working correctly.
     */
    @Test
    public void expressLunchBuilder() {
        LunchBuilder business = new BusinessLunchBuilder();
        LunchConstructor lcBus = new LunchConstructor(business);
        Lunch express = lcBus.collectLunch();

        ArrayList<HashMap<Food, Double>> foodItems = new ArrayList<>();
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

        Lunch expected = new Lunch(express.getName(), foodItems);

        assertEquals(expected.toString(), express.toString());
    }
}