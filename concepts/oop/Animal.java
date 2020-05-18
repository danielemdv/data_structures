public class Animal {

    public double weight; // decimal
    public String name;
    public String species;
    public int age;
    
    public Animal(String name, int age, double weight, String species){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Animal(){
        
    }

    public void makeANoise(){
        System.out.println("Animal noise!");
    }
    
}