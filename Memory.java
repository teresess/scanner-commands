package Test.FOrTesting.src.main.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Memory {
    List<String> string;
    static Map<String, String> users;

    public Memory() {
        string = new ArrayList<>();
        users = new HashMap<>();

        System.out.println("Memory: created");
    }
    public static boolean hasUser(String id) {
        return users.containsKey(id);
    }
    public static String getUser(String id) {
        return users.get(id);
    }
    public static Map<String, String> getUsers() {
        return users;
    }
    public static void addUser(String id, String name) {
        users.put(id, name);
    }
}