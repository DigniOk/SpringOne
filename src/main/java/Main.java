import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nick", "Krapivin", 28);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
        String jsonDes = "{\"firstName\":\"Svetlana\",\"lastName\":\"Dobralubova\",\"age\":25}";
        Person person2 = gson.fromJson(jsonDes, Person.class);
        System.out.println(person2);
    }
}
