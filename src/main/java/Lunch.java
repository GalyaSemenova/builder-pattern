import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
/**
 * @author galya_semenova
 * A class describing a lunch that consists of various foods with an indication of the weight of each.
 */
public class Lunch {
    /**
     * name - name of the lunch
     */
    private final String name;
    /**
     * proteins, ..., sodium - macronutrients of the lunch
     */
    private double proteins = 0;
    private double fats = 0;
    private double carbohydrates = 0;
    private double sugar = 0;
    private double cellulose = 0;
    private double cholesterol = 0;
    private double potassium = 0;
    private double sodium = 0;
    /**
     * calories - calorie content of the lunch
     */
    private double calories = 0;

    /**
     * A class constructor that fills in the fields of macronutrients of each food taking into account the weight.
     * The total calorie content of the dish is calculated, as well as the final value for each parameter separately.
     * @param name - the name of the lunch
     * @param foodItems - the list of food and weight in lunch
     * @throws IllegalArgumentException - it is thrown out if the food list was not passed
     */
    public Lunch(String name, ArrayList<HashMap<Food, Double>> foodItems) {
        super();

        if (Objects.isNull(foodItems))
            throw new IllegalArgumentException("Please add food in this lunch.");

        this.name = name;

        for (HashMap<Food, Double> i : foodItems) {
            i.forEach((k,v) -> proteins += k.getProteins() * v);
            i.forEach((k,v) -> fats += k.getFats() * v);
            i.forEach((k,v) -> carbohydrates += k.getCarbohydrates() * v);
            i.forEach((k,v) -> sugar += k.getSugar() * v);
            i.forEach((k,v) -> cellulose += k.getCellulose() * v);
            i.forEach((k,v) -> cholesterol += k.getCholesterol() * v);
            i.forEach((k,v) -> potassium += k.getPotassium() * v);
            i.forEach((k,v) -> sodium += k.getSodium() * v);
            i.forEach((k,v) -> calories += k.getCalories() * v);
        }
    }

    /**
     * Lunch proteins getter.
     * @return how much protein is in the lunch.
     */
    public double getProteins() {
        return proteins;
    }
    /**
     * Lunch fats getter.
     * @return how many fats is in the lunch.
     */
    public double getFats() {
        return fats;
    }
    /**
     * Lunch carbohydrates getter.
     * @return how many carbohydrates is in the lunch.
     */
    public double getCarbohydrates() {
        return carbohydrates;
    }
    /**
     * Lunch sugar getter.
     * @return how much sugar is in the lunch.
     */
    public double getSugar() {
        return sugar;
    }
    /**
     * Lunch cellulose getter.
     * @return how much cellulose is in the lunch.
     */
    public double getCellulose() {
        return cellulose;
    }
    /**
     * Lunch cholesterol getter.
     * @return how much cholesterol is in the lunch.
     */
    public double getCholesterol() {
        return cholesterol;
    }
    /**
     * Lunch potassium getter.
     * @return how much potassium is in the lunch.
     */
    public double getPotassium() {
        return potassium;
    }
    /**
     * Lunch sodium getter.
     * @return how much sodium is in the lunch.
     */
    public double getSodium() {
        return sodium;
    }
    /**
     * Lunch calories getter.
     * @return how many calories is in the lunch.
     */
    public double getCalories() {
        return calories;
    }
    /**
     * Lunch name getter.
     * @return name of the lunch.
     */
    public String getName() {
        return name;
    }
    /**
     * An overridable method for a readable representation of an instance of an object.
     * @return string representation of an object
     */
    @Override
    public String toString() {
        return "Meal: " + name + "\n=.=.=.=.=.==.=.=.=.=\nproteins = " + proteins + "g\nfats = " + fats + "g\ncarbohydrates = " +
                carbohydrates + "g\nsugar = " + sugar + "g\ncellulose = "+ cellulose + "g\ncholesterol = " +
                cholesterol + "g\npotassium = " + potassium + "g\nsodium = " + sodium + "g\n--------------\ncalories = " + calories + " kcal\n";
    }

}
