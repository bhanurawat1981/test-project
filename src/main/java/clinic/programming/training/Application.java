package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

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
	stringList.add(" ");
	for(String str : stringList){
	   if(StringUtils.isNotBlank(str)){
		System.out.println("Message : "+str);
	   }else{
		System.out.println("Blank string encountered.");
	   }
	}	
    }
}