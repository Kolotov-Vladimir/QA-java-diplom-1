package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTest {
    private Bun bun;
    private final String nameExpected;
    private final float priceExpected;

    public BunTest(String nameExpected, float priceExpected) {
        this.nameExpected = nameExpected;
        this.priceExpected = priceExpected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCountData() {
        return new Object[][]{
                {"cutlet", 45.3f},
                {"minced meat", 0f},
                {"test", 90.3f},
                {"123", 345.5f},
                {"sdf435FEF", 1f},
                {"0", 2222222222220f},
                {null, 0f},
                {"", 1f},
                {null, -11155f},
                {"!№;%:%?%:?((", -1f},
        };
    }

    @Test
    public void createABunSetAndGetCheckPositive() {
        bun = new Bun(nameExpected, priceExpected);
        String nameActual = bun.getName();
        float priceActual = bun.getPrice();
        Assert.assertEquals(nameExpected, nameActual);
        Assert.assertTrue(priceActual == priceExpected);
    }
}
