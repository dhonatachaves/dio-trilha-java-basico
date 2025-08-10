import java.util.LinkedHashMap;
import java.util.Map;

// Classe que representa uma pessoa cliente
public class Person {
    private static int idCounter = 1;
    private static final Map<Integer, String> clientsList = new LinkedHashMap<>();

    private final int id;
    private final String name;

    public Person(String name) {
        this.id = idCounter++;
        this.name = name;
        clientsList.put(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Map<Integer, String> getClientsList() {
        return Map.copyOf(clientsList);
    }
}
