public class App {
    public static void main(String[] args) {
        Dog snoopy = new Dog();
        Dog spike = new Dog("Spike", "Beagle", 10);

        snoopy.displayAnimalInfo();
        spike.displayAnimalInfo();
        Dog.displaySpecies();

        Cat whiskers = new Cat();
        Cat max = new Cat("Max", "Black", 3);

        whiskers.displayAnimalInfo();
        max.displayAnimalInfo();
        Cat.displaySpecies();
    }


}
