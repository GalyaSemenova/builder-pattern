import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author galya_semenova
 * This class tests the Food class
 */
public class FoodTest {
    /**
     * Throwing an IllegalArgumentException exception when passing an empty builder is being tested.
     */
    @Test
    public void emptyFoodBuilder() {
        FoodBuilder fb = null;
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new Food(fb));
        assertEquals("Please provide food builder to build food object.", thrown.getMessage());
    }

    /**
     * Throwing an IllegalArgumentException exception when passing an empty field from required fields
     */
    @Test
    public void emptyFats() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> new FoodBuilder().name("Boiled chicken").proteins(25.26).carbohydrates(0).build());
        assertEquals("Please provide valid fats.", thrown.getMessage());
    }

    /**
     * The carbohydrate getter is tested to get the correct value
     */
    @Test
    public void getCarbohydrates() {
        Food f = new FoodBuilder().name("Napoleon").proteins(6.46).fats(22.36).carbohydrates(36.22).sugar(11.78).sodium(0.113).build();
        assertEquals(36.22, f.getCarbohydrates(), 0.001);
    }
    /**
     * The calories getter is tested to get the correct value and calculate the correct calorie value
     */
    @Test
    public void getCalories() {
        Food f = new FoodBuilder().name("Napoleon").proteins(6.46).fats(22.36).carbohydrates(36.22).sugar(11.78).sodium(0.113).build();
        assertEquals(371.96, (f.getProteins() + f.getCarbohydrates()) * 4 + f.getFats() * 9, 0.001);
    }

    /**
     * This method is tested to get the correct information of object of Food class
     */
    @Test
    public void infoOfFood() {
        Food f = new FoodBuilder().name("Napoleon").proteins(6.46).fats(22.36).carbohydrates(36.22).sugar(11.78).sodium(0.113).build();
        String s = "Food: Napoleon\n" +
                "=.=.=.=.=.==.=.=.=.=\n" +
                "proteins = 6.46g\n" +
                "fats = 22.36g\n" +
                "carbohydrates = 36.22g\n" +
                "sugar = 11.78g\n" +
                "cellulose = 0.0g\n" +
                "cholesterol = 0.0g\n" +
                "potassium = 0.0g\n" +
                "sodium = 0.113g\n" +
                "--------------\n" +
                "calories = 371.96000000000004 kcal\n";
        assertEquals(s, f.toString());
    }
}