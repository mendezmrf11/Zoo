public class Animal {

    private String name;
    private String species;
    private String features;
    private String whatLike;

    public Animal(String name, String species, String features, String whatLike) {
        this.name = name;
        this.species = species;
        this.features = features;
        this.whatLike = whatLike;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", features='" + features + '\'' +
                ", whatLike='" + whatLike + '\'' +
                '}';
    }
}
