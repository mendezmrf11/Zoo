import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome to the Zoo!");
        boolean stop = false;
        Zoo zoo = new Zoo();

        while (stop == false)
        {
            System.out.println("Choose the number of your action: \n" +
                    "1. Add an animal \n" + "2. Search an animal \n" + "3. Print all the animals \n" + "4. Stop \n");

            int action = Integer.parseInt(scan.nextLine());

            switch(action){
                case 1:
                    System.out.println("Input the name of your animal to add");
                    String name = scan.nextLine();
                    System.out.println("Input the species of your animal to add");
                    String species = scan.nextLine();
                    System.out.println("Input the features of your animal to add");
                    String features = scan.nextLine();
                    System.out.println("Input what do you like of your animal to add");
                    String whatLike = scan.nextLine();

                    Animal animal = new Animal(name, species, features, whatLike);
                    zoo.addAnimal(animal);
                    break;

                case 2:
                    System.out.println("Input the name of your animal to search");
                    String search = scan.nextLine();
                    System.out.println(zoo.searchAnimalByName(search));
                    break;

                case 3:
                    System.out.println(zoo.toString());
                    break;

                case 4:
                    stop = true;
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Please, input a valid option");
            }

        }

    }
}