import java.io.Serializable;

public class Pet implements Serializable {
    private String name;
    private int age;
    private String species;

    public Pet() {

    }

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }
}
