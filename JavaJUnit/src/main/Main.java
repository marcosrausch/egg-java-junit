
package main;

import domain.Task;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Task taskManager = new Task();
        
        String[] tasks = {"Cook", "Broom", "Shop"};
        
        System.out.println(Arrays.toString(taskManager.manager(tasks, Task.Action.ADD, "Do laundry")));
        
        System.out.println(Arrays.toString(taskManager.manager(tasks, Task.Action.DELETE, "Cook")));
    }
    
}
