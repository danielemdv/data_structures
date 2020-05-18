public class Chatbot {
    
    // Attributes (variables)
    private String name;
    private String versionNumber;


    // Functions/methods

    public static Chatbot makeDefaultChatbot(){

        Chatbot cb = new Chatbot("default", "1.0.0");
        return cb;

    }

    // return a string representation of the chatbot instance.
    public String toString() {
        String s = "Name: " + name + "\nVersion number: " + versionNumber;
        return s;
    }


    //Constructors in Java are named like the class.
    public Chatbot(String inpName, String versionNumber){
        
        if(isValidName(inpName)){
            name = inpName;
        }else{
            name = "default";
        }

        this.versionNumber = versionNumber;

    }

    // getter methods!

    public String getName(){
        return name;
    }

    public String getVersionNumber(){
        return versionNumber;
    }

    // setter methods!

    public void setName(String newName){

        if(isValidName(newName)){
            name = newName;
        }

    }


    // util method!

    private boolean isValidName(String s){
        if(s == null){
            return false;
        }
        if(s.isEmpty()){
            return false;
        }
        return true;
    }



    public void greet(){
        System.out.println("Hello! My name is " + name.toUpperCase());
    }
    

}