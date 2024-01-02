import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal)
    {
        animals.add(animal);
        System.out.println("Animal added successfully");
    }

    public String searchAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal.toString();
            }
        }
        return ("Animal not found");
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
