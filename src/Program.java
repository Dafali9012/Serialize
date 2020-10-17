import java.nio.file.Paths;

public class Program {
    private static boolean init = false;
    private static final String fileFolder = "serialized-files/";

    private Hamburger hamburger = new Hamburger();
    private Person dennis = new Person("Dennis", 18, new Pet("David", 11, "Cat"));

    public static void main(String[] args) {
        if (init) {
            throw new IllegalCallerException("Program may only be run once!");
        }
        new Program();
    }

    private Program() {
        if (init) {
            throw new IllegalCallerException("Program may only be run once!");
        }
        init = true;

        Serializer.serialize(dennis, Paths.get(fileFolder + "dennis.ser"));
        System.out.println(Serializer.deSerialize(Paths.get(fileFolder + "dennis.ser")).toString());
        System.out.println();
        Serializer.serialize(hamburger, Paths.get(fileFolder + "hamburger.ser"));
        System.out.println(Serializer.deSerialize(Paths.get(fileFolder + "hamburger.ser")).toString());
    }
}
