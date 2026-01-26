package annotations.implementcustomserialization;

public class Main {
    public static void main(String[] args) {

        User user = new User("shweta", 22);

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
