package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	List<String> stringList = new ArrayList<>();
	stringList.add("I am here.");
	stringList.add("Where are you?");	
	for(String str : stringList){
	   System.out.println("Message : "+str);
	}
    }
}