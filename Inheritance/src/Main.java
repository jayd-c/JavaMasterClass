public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog noArgsDog = new Dog();
        doAnimalStuff(noArgsDog,"slow");

        Dog dog2 = new Dog("Brown","Bulldog","big",300,"wagged","flaccid");
        doAnimalStuff(dog2,"fast");

        Dog wolf = new Dog ("Wolf",150);
        doAnimalStuff(wolf,"fast");

        Fish gold = new Fish("Goldie","small",0.25,2,3);
        doAnimalStuff(gold,"fast");
    }
    public static void doAnimalStuff (Animal animal, String speed) {
        System.out.println("_______________________________________");

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______________________________________");
    }
}
