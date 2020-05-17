public class IntegerNode {
 
    public int data; // This holds our integer value for this element.
    public IntegerNode next;  // This holds the reference to the next IntegerNode.

    public IntegerNode(int data){
        this.data = data;
        this.next = null; // When we make a new node we don't know the following one.
    }

}