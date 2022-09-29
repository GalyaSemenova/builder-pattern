/**
 * @author galya_semenova
 * Lunch constructor that controls the creation of a class instance Lunch
 */
public class LunchConstructor {
    /**
     * builder - builder of Lunch object
     */
    private LunchBuilder builder;

    /**
     * Constructor of Lunch
     * @param builder - builder of Lunch object
     * @throws IllegalArgumentException - it is thrown out if the builder was not passed
     */
    public LunchConstructor(LunchBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Constructor can't do lunch!");
        }
    }

    /**
     * Lunch picker
     * @return Lunch object with the specified name and food list
     */
    public Lunch collectLunch() {
        return builder.name().foodItem().build();
    }
}
