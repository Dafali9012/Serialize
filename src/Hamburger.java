import java.io.Serializable;

public class Hamburger implements Serializable {
    private String name = "Big Mac";
    private String[] ingredients = new String[]{
            "Sesame Bun", "100% Beef Patty", "Shredded Lettuce",
            "Big Mac Sauce", "Cheese", "Pickle Slices", "Onions"};
    private Integer calories = 540, fat = 34;

    public Hamburger() {}

    public String getName() {
        return name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public Integer getCalories() {
        return calories;
    }

    public Integer getFat() {
        return fat;
    }

    public void printInformation() {
        String ingredients = "";
        for(String x:this.ingredients) {
            ingredients = ingredients+x+", ";
        }
        ingredients = ingredients.substring(0,ingredients.length()-2);
        ingredients = ingredients.replaceAll(",(?=[^,]+$)", " and");
        System.out.printf("Name: %s%nIngredients: %s%nCalories: %d%nFat: %d grams", getName(), ingredients, getCalories(), getFat());
    }
}
