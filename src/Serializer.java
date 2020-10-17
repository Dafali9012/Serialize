import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class Serializer {

    public static String serialize(Object obj, String folderPath, String fileName, String extension) {
        String filePath = folderPath+fileName+"."+extension;
        try (ObjectOutputStream ous = new ObjectOutputStream(Files.newOutputStream(Paths.get(filePath)))) {
            ous.writeObject(obj);
            return filePath;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object deSerialize(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(filePath)))) {
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
