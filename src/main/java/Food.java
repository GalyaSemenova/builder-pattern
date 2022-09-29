/**
 * @author galya_semenova
 * A class describing food. Defines macronutrients, among which there are both mandatory and not.
 */
public class Food {
    /**
     * name - name of the food
     */
    private final String name;
    /**
     * proteins, ..., sodium - macronutrients of the food
     */
    private double proteins;
    private double fats;
    private double carbohydrates;
    private final double sugar;
    private final double cellulose;
    private final double cholesterol;
    private final double potassium;
    private final double sodium;
    /**
     * calories - calorie content of the food
     */
    private final double calories;

    /**
     * A class constructor that fills in the fields of macronutrients and controls the filling of required fields.
     * The caloric content is also calculated here based on the data obtained.
     * @param foodBuilder - the builder who creates an instance of the food class
     * @throws IllegalArgumentException - if the user has not specified such mandatory fields as
     * foodBuilder/ proteins/ fats/ carbohydrates, then this exception is thrown
     */
    public Food(FoodBuilder foodBuilder) {
        if (foodBuilder == null)
            throw new IllegalArgumentException("Please provide food builder to build food object.");
        if (foodBuilder.name == null)
            throw new IllegalArgumentException("Please provide valid name of food.");
        if (foodBuilder.proteins < 0)
            throw new IllegalArgumentException("Please provide valid protein.");
        if (foodBuilder.fats < 0)
            throw new IllegalArgumentException("Please provide valid fats.");
        if (foodBuilder.carbohydrates < 0)
            throw new IllegalArgumentException("Please provide valid carbohydrates.");

        this.name = foodBuilder.name;
        this.proteins = foodBuilder.proteins;
        this.fats = foodBuilder.fats;
        this.carbohydrates = foodBuilder.carbohydrates;
        this.sugar = foodBuilder.sugar;
        this.cellulose = foodBuilder.cellulose;
        this.cholesterol = foodBuilder.cholesterol;
        this.potassium = foodBuilder.potassium;
        this.sodium = foodBuilder.sodium;
        calories = 4 * proteins + 9 * fats + 4 * carbohydrates;
    }

    /**
     * Food name getter.
     * @return name of the food.
     */
    public String getName() {
        return name;
    }
    /**
     * Food proteins getter.
     * @return how much protein is in the food.
     */
    public double getProteins() {
        return proteins;
    }
    /**
     * Food fats getter.
     * @return how many fats is in the food.
     */
    public double getFats() {
        return fats;
    }
    /**
     * Food carbohydrates getter.
     * @return how many carbohydrates is in the food.
     */
    public double getCarbohydrates() {
        return carbohydrates;
    }
    /**
     * Food sugar getter.
     * @return how much sugar is in the food.
     */
    public double getSugar() {
        return sugar;
    }
    /**
     * Food cellulose getter.
     * @return how much cellulose is in the food.
     */
    public double getCellulose() {
        return cellulose;
    }
    /**
     * Food cholesterol getter.
     * @return how much cholesterol is in the food.
     */
    public double getCholesterol() {
        return cholesterol;
    }
    /**
     * Food potassium getter.
     * @return how much potassium is in the food.
     */
    public double getPotassium() {
        return potassium;
    }
    /**
     * Food sodium getter.
     * @return how much sodium is in the food.
     */
    public double getSodium() {
        return sodium;
    }
    /**
     * Food calories getter.
     * @return how many calories is in the food.
     */
    public double getCalories() {
        return calories;
    }

    /**
     * An overridable method for a readable representation of an instance of an object.
     * @return string representation of an object
     */
    @Override
    public String toString() {
        return "Food: " + name + "\n=.=.=.=.=.==.=.=.=.=\nproteins = " + proteins + "g\nfats = " + fats + "g\ncarbohydrates = " +
                carbohydrates + "g\nsugar = " + sugar + "g\ncellulose = "+ cellulose + "g\ncholesterol = " +
                cholesterol + "g\npotassium = " + potassium + "g\nsodium = " + sodium + "g\n--------------\ncalories = " + calories + " kcal\n";
    }
}
