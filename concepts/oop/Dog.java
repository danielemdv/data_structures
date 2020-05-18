public class Dog extends Animal{
    
    public Dog(String name, int age, double weight, String species){
        super(name, age, weight, species);
    }

    public Dog(){
        super();
    }

    public void makeANoise(){
        System.out.println("BarkBark");
    }

    public void fetch(){
        System.out.println("I've got the ball");
    }

}