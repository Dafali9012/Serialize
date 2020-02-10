import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class Serializer {

    public static void serialize(Object obj, Path path) {
        try {
            new ObjectOutputStream(Files.newOutputStream(path)).writeObject(obj);
            System.out.println("Serialized: "+obj);
        } catch (Exception e) { e.printStackTrace();}
    }

    public static Object deSerialize(Path path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
            Object obj = ois.readObject();
            System.out.println("Deserialized: "+obj);
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
