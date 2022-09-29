/**
 * @author galya_semenova
 * LunchBuilder interface
 */
public interface LunchBuilder {
    LunchBuilder name();
    LunchBuilder foodItem();
    Lunch build();
}
