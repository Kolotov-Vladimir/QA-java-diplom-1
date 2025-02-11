package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType ingredientType;
    private final String stringIngredientType;

    public IngredientTypeTest(IngredientType ingredientType, String stringIngredientType) {
        this.ingredientType = ingredientType;
        this.stringIngredientType = stringIngredientType;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][] {
                {IngredientType.SAUCE, "SAUCE"},
                {IngredientType.FILLING, "FILLING"}
        };
    }
    @Test
    public void valueOfReturnCorrectEnum() {
        Assert.assertEquals("Результат не корректный, ожидалось: " + ingredientType.toString(),ingredientType, IngredientType.valueOf(stringIngredientType));
    }
}