public class Dog {

    static String species = "Canine";
    public String name;
    private String breed;
    protected int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(){
        name = "Unknown";
        breed = "Unknown";
        age = 0;
    }

    public String getBreed(){
        return breed;
    }

    protected void displayAnimalInfo(){
        System.out.println("Name: " + name + ", " + "Breed: " + breed + ", " + "Age: " + age);

    }

    public static void displaySpecies(){
        System.out.println("All dogs are of species: " + species);
    }
}
