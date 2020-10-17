public class Program {
    private static boolean init = false;
    private static final String fileFolder = "serialized-files/";

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

        Hamburger originalHamburger = new Hamburger();
        String serializedHamburgerFilePath = Serializer.serialize(originalHamburger, fileFolder, "hamburger", "ser");
        Hamburger deSerializedHamburger = (Hamburger) Serializer.deSerialize(serializedHamburgerFilePath);

        deSerializedHamburger.printInformation();
    }
}
