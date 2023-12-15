package UnitTests;

import domain.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Marcos
 */
public class DiscountCalculator {

    // attributes
    private static Calculator calculator;
    private static final int TEN_PERCENT = 10;
    private static final int MAXIMUM_DISCOUNT = 100;
    private static final int NO_DISCOUNT = 0;

    @BeforeClass
    public static void setUpClass() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDownClass() {
        calculator = null;
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldInitCalculator() {
        Assert.assertNotNull(calculator);
    }

    @Test
    public void shouldApply_10PercentDiscount() {
        Assert.assertEquals(90.0, calculator.discount(100.00, TEN_PERCENT), 0);
    }

    @Test
    public void shouldApplyMaximumDiscount() {
        Assert.assertEquals(0.0, calculator.discount(100.0, MAXIMUM_DISCOUNT), 0);
    }
    
    @Test
    public void shouldNotApplyDiscount() {
        Assert.assertEquals(100.0, calculator.discount(100.00, NO_DISCOUNT), 0);
    }
    
}
