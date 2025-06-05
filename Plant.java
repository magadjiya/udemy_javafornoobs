/**
 * Class to inherit from with the Constructor, setters and getters
 */

public class Plant {
    private String name;
    private String species;
    private String type;
    private int age;

    public Plant(String name, String species, String type, int age) {
        this.name = name;
        this.species = species;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }
}