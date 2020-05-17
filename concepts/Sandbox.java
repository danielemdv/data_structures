import java.util.ArrayList;
import java.util.List;

class Sandbox{


    public static void main(String[] args){
        //System.out.println("Hello world!");

        Sandbox s = new Sandbox();
        s.otherMain();
    }

    public void otherMain(){

        //  - - - - - - 

        //NumberList stuff:

        IntegerList il = new IntegerList();


        il.add(4);
        il.add(5);
        il.add(9);
        il.add(3);
        il.add(4);

        il.add(4);
        il.add(4);
        il.add(4);

        // TESTS
        System.out.println("Before indexed add: " + il.stringInternals());
        il.add(3, 99);
        // ----
        System.out.println(il.length());

        try{
            System.out.println(il.getAtIndex(42)); // This should fail!!
        }catch(Exception e){
            // can do something about the exception...
            // for example, exit the application gracefully.
            System.out.println("An exception was thrown: " + e.getMessage());
        }

        try{
            //int b = a[9];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("An exception was thrown: " + e.getMessage());
        }

        

        System.out.println(il.toString());
        System.out.println(il.stringInternals());


        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(56);
        al.add(56);
        al.add(85);
        al.add(56);
        al.add(96);


        System.out.println(al.size());

    }



class Cat{

    public String name;
    private String surname;

    public Cat(){
        name = "defaultN";
        surname = "defaultS";
    }

    //overloading the constructor
    public Cat(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    // static method belongs to the CLASS!
    // public static Cat createEmptyCat(){
    //     Cat emptyCat = new Cat("","");
    //     return emptyCat;
    // }

    public void printData(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println();
    }

}


}

