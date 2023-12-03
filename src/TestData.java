import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestData {
    public static void main(String[] args) {

        Product product = new Product();

        Ingredient ingredient = new Ingredient(5);
        Ingredient ingredient1 = new Ingredient(1);
        Ingredient ingredient2 = new Ingredient(500);

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(ingredient);
        ingredientList.add(ingredient1);
        ingredientList.add(ingredient2);
        product.setIngredientList(ingredientList);

        for (Ingredient i : product.getIngredientList()) {
            System.out.println(i.getCalories());
        }

        sumCalories(product);

        System.out.println(product.getCalories());
    }

    public static void sumCalories(Product product) {
        product.setCalories(product.getIngredientList().stream()
                .mapToInt(Ingredient::getCalories).sum());
    }
}
