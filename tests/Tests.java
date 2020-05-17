/*package whatever //do not write package name here */

/*
Input: List = ‘a’ -> ‘b’ -> ‘c’ ->’d’ -> ‘e’ -> NULL, k = 3
Output: abc de

Input: List = ‘a’ -> ‘b’ -> ‘c’ -> ‘d’ -> ‘e’ -> ‘f’ -> NULL, k = 2
Output: ab cd ef

*/

import java.io.*;
import java.util.Scanner;

class Tests {
	public static void main (String[] args) {
		
        //Scanner scan = new Scanner(System.in);
        String input = "List = ‘a’ -> ‘b’ -> ‘c’ -> ‘d’ -> ‘e’ -> ‘f’ -> NULL, k = 2";

		
        Scanner s = new Scanner(input);
        s.useDelimiter("\\s*'\\s*");
        
		
		while(s.hasNext()){
		    System.out.println(s.next());
        }
        s.close();
        
        Tests tests = new Tests();

        tests.mm();


		System.out.println("All in order");
    }
    
    public void mm(){


        MyLinkedList<Integer> ll = new MyLinkedList();

        ll.add(new Integer(1));
        ll.add(new Integer(2));
        ll.add(new Integer(3));
        System.out.println(ll.toString());

    }
	
	
	class MyLinkedList<T>{
	    
	    public Node<T> head;
        
        public MyLinkedList(){
            head = null;
        }

	    public MyLinkedList(T d){
	        
	        if(d != null){
                Node<T> n = new Node(d);
                head = n;
            }
        }
        
        public MyLinkedList(T[] t){
            // Convert an array of stuff into nodes...
            
        }
        
        public void add(T t){

            if(head == null){
                Node<T> n = new Node(t);
                head = n;
                return;
            }

            Node<T> n = new Node(t);
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            
            current.next = n;
        }

        public String toString(){
            String s = "LL:\n";

            if(head == null){
                return s + "empty";
            }

            Node<T> current = head;
            while(current.next != null){
                s += current.data.toString() + ", ";
                current = current.next;
            }

            s += current.data.toString(); // the last one.

            return s;
        }

	    class Node<T>{
	        public T data;
	        public Node<T> next;
	        
	        public Node(T d){
	            data = d;
	            next = null;
	        }
	    }
	    
	}
	

	
} 