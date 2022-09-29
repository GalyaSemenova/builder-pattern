import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author galya_semenova
 * This class tests the FoodBuilder class
 */
public class FoodBuilderTest {
    /**
     * food - to check the correctness of the methods, an instance of the Food class is created beforehand
     */
    Food food = new FoodBuilder().name("Napoleon").proteins(6.46).fats(22.36).carbohydrates(36.22).sugar(11.78).sodium(0.113).build();
    /**
     * Method tests the getter of the food name
     */
    @Test
    public void name() {
        assertEquals("Napoleon", food.getName());
    }
    /**
     * Method tests the getter of the food fats
     */
    @Test
    public void fats() {
        assertEquals(22.36, food.getFats(), 0.001);
    }
    /**
     * Method tests the getter of the food cholesterol
     */
    @Test
    public void cholesterol() {
        assertEquals(0, food.getCholesterol(), 0.001);
    }
}