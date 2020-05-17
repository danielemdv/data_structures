class IntegerList{
    //implement a flexible length list of integers.

    private int[] intArr;
    private int arrayLength;
    private int end; // Will mean the index of the last available position.

    private final int INIT_LENGTH = 5;

    // intArr: [3,4,4,5,7]
    //         [*,*,*,*,*]e

    // IntegerList: [3,4]

    //Constructor: This is where we initialize our stuff!
    public IntegerList(){
        arrayLength = INIT_LENGTH;
        intArr = new int[INIT_LENGTH];
        end = 0;
    }

    // Add a new number to the end of the list.
    public void add(int newNumber){
        // Check if the list is full 
        if (end == arrayLength) {
            // list is full, do something!
            expandList();
        }

        // Add the number to the list.
        intArr[end] = newNumber;
        end = end + 1;
    }

    private void expandList(){
        // make new larger array (double previous capacity)
        int[] newArray = new int[arrayLength * 2];

        // copy the numbers in the current array to the new array.
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = intArr[i];
        }

        // update our variables to reflect the new state.
        arrayLength = arrayLength * 2;
        intArr = newArray; // switch the arrays! We'll use the new one now!
    }

    // return number at given index.
    public int getAtIndex(int index) throws Exception{
        if (index >= end || index < 0)
        {
            throw new Exception("Index out of bounds!");
        }
        else
        {
            return intArr[index];
        }
        
    }

    // return the length of the list. e.g. il.length()
    public int length(){
        return end;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public String toString(){
        String s = "IntegerList: ";

        for(int i = 0; i < end; i++){
            s = s + intArr[i] + ", "; 
        }

        return s;
    }

    public String stringInternals(){
        String s = "IL internals: ";

        for(int i = 0; i < intArr.length; i++){
            s = s + intArr[i] + ", "; 
        }

        return s;
    }

}