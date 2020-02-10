import java.io.Serializable;

public class Hamburger implements Serializable {
    private String taste = "wonderful";
    private String appearance = "fantastic";

    public Hamburger() {

    }

    public String getTaste() {
        return taste;
    }

    public String getAppearance() {
        return appearance;
    }

    @Override
    public String toString() {
        return "Hamburger tastes "+taste+", looks "+appearance;
    }
}
