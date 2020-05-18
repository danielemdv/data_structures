public class EntryPoint {
    
    public static void main(String[] args){
        // Where our program will run from....

        System.out.println("Running program!");

        Chatbot cb = new Chatbot("Frank", "3.40");

        cb.setName(""); // watch out!

        Chatbot defaultChatbot = Chatbot.makeDefaultChatbot();

        System.out.println(defaultChatbot.toString());

        System.out.println(cb.toString());

        cb.greet(); //greet me!
        


    }
    

}