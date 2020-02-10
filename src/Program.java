import java.nio.file.Paths;

public class Program {
    private static final Program instance = new Program();
    private static final String fileFolder = "serialized-files/";

    private Hamburger hamburger = new Hamburger();
    private Person dennis = new Person("Dennis", 18, new Pet("David", 11, "Cat"));

    private Program() {
        Serializer.serialize(dennis, Paths.get(fileFolder+"dennis.ser"));
        Serializer.deSerialize(Paths.get(fileFolder+"dennis.ser")).toString();
        System.out.println();
        Serializer.serialize(hamburger, Paths.get(fileFolder+"hamburger.ser"));
        Serializer.deSerialize(Paths.get(fileFolder+"hamburger.ser")).toString();
    }

    public static Program getInstance() {
        return instance;
    }
}
