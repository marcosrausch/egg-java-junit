package UnitTests;

import domain.Password;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordStrength {
    
    private static Password password;
    private static final String SHORT_PASSWORD = "Marcos";
    private static final String LACK_OF_CAPITALS_PASSWORD = "mrausch91";
    private static final String LACK_OF_SPECIAL_CHARACTERS_PASSWORD = "Marcosrausch";
    private static final String STRONG_PASSWORD = "M.rausch91";
    
    public PasswordStrength() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        password = new Password();
    }
    
    @AfterClass
    public static void tearDownClass() {
        password = null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void passwordShouldBeWeakDueToLenght() {
        Assert.assertFalse(password.strong(SHORT_PASSWORD));
    }

    @Test
    public void passwordShouldBeWeakDueToLackOfCapitals() {
        Assert.assertFalse(password.strong(LACK_OF_CAPITALS_PASSWORD));
    }

    @Test
    public void passwordShouldBeWeakDueToLackOfSpecialCharacters() {
        Assert.assertFalse(password.strong(LACK_OF_SPECIAL_CHARACTERS_PASSWORD));
    }
    
    @Test
    public void shouldBeAStrongPassword() {
        Assert.assertTrue(password.strong(STRONG_PASSWORD));
    }
}
