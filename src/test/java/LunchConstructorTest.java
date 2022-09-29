import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;
/**
 * @author galya_semenova
 * This class tests the LunchConstructor class
 */
public class LunchConstructorTest {
    /**
     * The method tests the creation of an object with the help of a Director and by simply creating a Lunch
     * with passing parameters. If the getter results are equal, then the Director is working correctly.
     */
    @Test
    public void collectLunch() {
        ArrayList<HashMap<Food, Double>> foodItems = new ArrayList<>();

        HashMap<Food, Double> hm = new HashMap<>();
        Food hotDog = new FoodBuilder().name("Hot dog").proteins(11.86).fats(15).carbohydrates(18.4).build();
        Food coffee = new FoodBuilder().name("Cappuccino").proteins(4.08).fats(4).carbohydrates(5.84).build();
        Food twix = new FoodBuilder().name("Twix").proteins(4.1).fats(24.2).carbohydrates(64.8).build();
        hm.put(hotDog, 3.0);
        hm.put(coffee, 2.4);
        hm.put(twix, 0.82);
        foodItems.add(hm);


        LunchBuilder express = new ExpressLunchBuilder();
        LunchConstructor lcExpr = new LunchConstructor(express);
        Lunch lunch = new Lunch("Express lunch: hot dog, coffee and twix", foodItems);
        Lunch test = lcExpr.collectLunch();
        assertEquals(lunch.getName(), test.getName());
    }
}