/**
 * @author galya_semenova
 * A food builder that allows you to set a variable number of fields in an instance of a class.
 */
public class FoodBuilder {
    /**
     * name - name of the food
     */
    String name;
    /**
     * proteins, fats, carbohydrates - required fields
     */
    double proteins = -1;
    double fats = -1;
    double carbohydrates = -1;
    /**
     * sugar, ..., sodium - optional macronutrients of the food
     */
    double sugar;
    double cellulose;
    double cholesterol;
    double potassium;
    double sodium;

    /**
     * Constructor of the FoodBuilder.
     */
    public FoodBuilder() {
        super();
    }

    /**
     * Method for filling in the field name and returning FoodBuilder object.
     * @param value - name of the food
     * @return FoodBuilder object
     */
    public FoodBuilder name(String value) {
        name = value;
        return this;
    }
    /**
     * Method for filling in the field proteins and returning FoodBuilder object.
     * @param value - how much protein is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder proteins(double value) {
        proteins = value;
        return this;
    }
    /**
     * Method for filling in the field fats and returning FoodBuilder object.
     * @param value - how many fats is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder fats(double value) {
        fats = value;
        return this;
    }
    /**
     * Method for filling in the field carbohydrates and returning FoodBuilder object.
     * @param value - how many carbohydrates is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder carbohydrates(double value) {
        carbohydrates = value;
        return this;
    }
    /**
     * Method for filling in the field sugar and returning FoodBuilder object.
     * @param value - how much sugar is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder sugar(double value) {
        sugar = value;
        return this;
    }
    /**
     * Method for filling in the field cellulose and returning FoodBuilder object.
     * @param value - how much cellulose is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder cellulose(double value) {
        cellulose = value;
        return this;
    }
    /**
     * Method for filling in the field cholesterol and returning FoodBuilder object.
     * @param value - how much cholesterol is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder cholesterol(double value) {
        cholesterol = value;
        return this;
    }
    /**
     * Method for filling in the field potassium and returning FoodBuilder object.
     * @param value - how much potassium is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder potassium(double value) {
        potassium = value;
        return this;
    }
    /**
     * Method for filling in the field sodium and returning FoodBuilder object.
     * @param value - how much sodium is in the food
     * @return FoodBuilder object
     */
    public FoodBuilder sodium(double value) {
        sodium = value;
        return this;
    }

    /**
     * Method for creating Food object
     * @return Food object with set parameters
     */
    public Food build() {
        return new Food(this);
    }
}
