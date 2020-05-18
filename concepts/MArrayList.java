/*
Implementing a generic ArrayList data structure.

*/

public class MArrayList<T> {
    
    private Object[] arr;
    //private int arrayLength; // didn't really need it!
    private int end; // Will mean the index of the last available position.

    private final int INIT_LENGTH = 5;

    //Constructor: This is where we initialize our stuff!
    public MArrayList(){
        arr = new Object[INIT_LENGTH];
        end = 0;
    }

}