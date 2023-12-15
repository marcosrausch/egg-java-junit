package UnitTests;

import domain.Task;
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
public class TaskManager {
    
    private static Task task;
    private static final String[] TASK_LIST = {"Cook", "Broom", "Shop"};
    private static final String[] TASK_ADDED = {"Cook", "Broom", "Shop", "Do Laundry"};
    private static final String[] TASK_DELETED = {"Cook", "Shop"};
    private static final String LAUNDRY = "Do Laundry";
    private static final String BROOM = "Broom";

    
    @BeforeClass
    public static void setUpClass() {
        task = new Task();
    }
    
    @AfterClass
    public static void tearDownClass() {
        task = null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void shouldAddATask() {
        Assert.assertArrayEquals(TASK_ADDED, task.manager(TASK_LIST, Task.Action.ADD, LAUNDRY));
    }
    
    @Test
    public void shouldDeleteTask() {
        Assert.assertArrayEquals(TASK_DELETED, task.manager(TASK_LIST, Task.Action.DELETE, BROOM));
    }
    
    @Test
    public void shouldListTasks() {
        Assert.assertArrayEquals(TASK_LIST, task.manager(TASK_LIST, Task.Action.LIST, ""));
    }
}
