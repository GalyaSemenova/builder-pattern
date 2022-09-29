import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author galya_semenova
 * This class tests the Lunch class
 */
public class LunchTest {
    /**
     * The method tests the correct calculation of proteins, fats, carbohydrates
     * and calories by manually calculating each parameter separately.
     */
    @Test
    public void nutrients(){
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

        Lunch lunch = new Lunch("test lunch", foodItems);

        double prot = 0.0;
        double fats = 0.0;
        double carb = 0.0;
        double kcal = 0.0;

        for (Map.Entry entry : hm.entrySet()) {
            Food f = (Food) entry.getKey();
            Double v = (Double) entry.getValue();
            prot += f.getProteins() * v;
            fats += f.getFats() * v;
            carb += f.getCarbohydrates() * v;
            kcal += f.getCalories() * v;
        }


        assertEquals(prot, lunch.getProteins(), 0.001);
        assertEquals(fats, lunch.getFats(), 0.001);
        assertEquals(carb, lunch.getCarbohydrates(),0.001);
        assertEquals(kcal,lunch.getCalories(),0.001);
    }

    /**
     * The method tests the correct name getter
     */
    @Test
    public void getNameOfLunch() {
        LunchBuilder business = new BusinessLunchBuilder();
        LunchConstructor lcBus = new LunchConstructor(business);
        assertEquals("Business lunch: borsch, rice with pork, fruit drink", lcBus.collectLunch().getName());
    }

    /**
     * The method tests correct representation of an instance of an object
     */
    @Test
    public void infoOfLunch() {
        LunchBuilder business = new BusinessLunchBuilder();
        LunchConstructor lcBus = new LunchConstructor(business);
        String s = "Meal: Business lunch: borsch, rice with pork, fruit drink\n" +
                "=.=.=.=.=.==.=.=.=.=\n" +
                "proteins = 38.18000000000001g\n" +
                "fats = 21.44g\n" +
                "carbohydrates = 68.087g\n" +
                "sugar = 0.0g\n" +
                "cellulose = 0.0g\n" +
                "cholesterol = 0.0g\n" +
                "potassium = 0.0g\n" +
                "sodium = 0.0g\n" +
                "--------------\n" +
                "calories = 618.028 kcal\n";
        assertEquals(s, lcBus.collectLunch().toString());
    }
}