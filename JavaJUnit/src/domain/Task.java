package domain;

public class Task {

    public static String[] manager(String[] tasks, Action action, String task) {
        switch (action) {
            case ADD:
                tasks = add(tasks, task);
                break;
            case DELETE:
                tasks = delete(tasks, task);
                break;
            case LIST:
                tasks = list(tasks);
                break;                
        }
        return tasks;
    }

    public enum Action {
        ADD,
        DELETE,
        LIST
    }

    static String[] add(String[] array, String element) {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);

        newArray[newArray.length - 1] = element;
        return newArray;
    }

    static String[] delete(String[] array, String element) {
        String[] newArray = new String[array.length - 1];
        
        for (int i = 0, k = 0; i < array.length; i++) {
            if (!array[i].equals(element)) {
                newArray[k++] = array[i];
            }
        }

        return newArray;
    }
    
    static String[] list(String[] array) {
        return array;
    }
}
