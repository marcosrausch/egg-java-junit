
package UnitTests;

import domain.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateValidator {
    
    private static Date date;    
    
    @BeforeClass
    public static void setUpClass() {
        date = new Date();
    }
    
    @AfterClass
    public static void tearDownClass() {
        date = null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void shouldBeAValidDate() {
        Assert.assertTrue(date.isValid("14/08/1991"));
    }
    
    @Test
    public void shouldNotBeAValidDate() {
        Assert.assertFalse(date.isValid("1991/14/08"));
    }
}
