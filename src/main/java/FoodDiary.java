import java.util.ArrayList;
/**
 * @author galya_semenova
 * Main class
 */
public class FoodDiary {
    /**
     * Java main method is the entry point of any java program.
     * An object list is created, which consists of both food and dishes.
     * The contents of the list are displayed on the screen
     * @param args - String array argument
     */
    public static void main(String[] args) {
        ArrayList<Object> objList = new ArrayList<>();

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new FoodBuilder().name("Boiled chicken").proteins(25.26).fats(7.2).carbohydrates(0).build());
        foods.add(new FoodBuilder().name("Napoleon").proteins(6.46).fats(22.36).carbohydrates(36.22).sugar(11.78).sodium(0.113).build());

        ArrayList<Lunch> lunches = new ArrayList<>();
        LunchBuilder express = new ExpressLunchBuilder();
        LunchBuilder business = new BusinessLunchBuilder();
        LunchConstructor lcExpr = new LunchConstructor(express);
        LunchConstructor lcBus = new LunchConstructor(business);
        lunches.add(lcExpr.collectLunch());
        lunches.add(lcBus.collectLunch());

        objList.addAll(foods);
        objList.addAll(lunches);

        for (Object obj : objList)
            System.out.println(obj);
    }
}
