package praktikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import praktikum.constants.TestData;
import static org.junit.jupiter.api.Assertions.*;

public class BunTest {

    private Bun bun;

    @BeforeEach
    public void setUp() {
        bun = new Bun(TestData.BUN_NAME, TestData.BUN_MAX_PRICE);
    }

    @Test
    public void testGetName() {
        assertEquals(TestData.BUN_NAME, bun.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(TestData.BUN_MAX_PRICE, bun.getPrice(), TestData.DELTA);
    }
// не добавился в гитхаб
}