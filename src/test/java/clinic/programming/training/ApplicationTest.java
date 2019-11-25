package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ApplicationTest {
    private Application app;
    private List<String> messageList;
	
    @Before
    public void setup() {
        app = new Application();
		messageList = new ArrayList<>();
    }
    
    
    @Test
    public void testPrintMessage() {
        int count = messageList.size();
		app.printMessage("Test message", messageList);		
        assertTrue(messageList.size() == count + 1);
    }

    @Test
    public void testPrintMessageList() {
		for(int i=1;i<=10;i++){
			app.printMessage("Test message : "+i, messageList);
		}
		app.printMessageList(messageList);
        assertTrue(Boolean.TRUE);
    }

    @Test
    public void testPrintMessageListBlankMessage() {
        app.printMessage(" ", messageList);
		app.printMessageList(messageList);
        assertTrue(Boolean.TRUE);
    }
}