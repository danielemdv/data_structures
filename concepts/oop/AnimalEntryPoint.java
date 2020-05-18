

public class AnimalEntryPoint {
    
    public static void main(String[] args){

        Animal a = new Animal("a", 3, 4.5, "Macaque");

        Dog d = new Dog("juan", 7, 90.3, "Golden");

        d.makeANoise();

        d.fetch();

        // Animal -> Dog
        // A dog is an Animal.... but an Animal is not a dog.... right?

        Animal spotty = new Dog("spotty", 7, 10.3, "chihuahua");

        //spotty.makeANoise();

        Animal catty = new Cat("melvin", 123, 14.2, "grey");
        //catty.makeANoise();

        //casting
        Cat cattyConverted = (Cat)catty;


        // why is this useful???

        // logical heirarchy of objects.

        // treat similar groups of objects together.

        Animal[] animalArr = new Animal[12]; // declare an Array of Animals

        animalArr[0] = spotty; // Animal
        animalArr[1] = catty; // Animal
        animalArr[2] = d; // Dog
        animalArr[3] = cattyConverted; // Cat

        Dog doggy = (Dog)animalArr[2]; // have to cast to get it out!

        doggy.fetch();


    }
}