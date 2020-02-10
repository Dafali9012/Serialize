import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private Pet pet = null;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return name+"("+age+") "+pet.getSpecies()+": "+pet.getName()+"("+pet.getAge()+")";
    }
}
