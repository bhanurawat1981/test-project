package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

/**
 * @author bharawat
 *
 */
public class Application {

	public Application() {
		System.out.println("Inside Application");
	}

	// method main(): ALWAYS the APPLICATION entry point
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting Application");
		Application application = new Application();
		// creating message list.
		List<String> stringList = new ArrayList<>();
		// adding messages to list.
		application.printMessage("I am here.", stringList);
		application.printMessage("Where are you?", stringList);
		application.printMessage(" ", stringList);
		// printing messages in list.
		application.printMessageList(stringList);
		System.out.println("Closing Application");
	}

	/**
	 * @param message
	 * @param stringList
	 */
	public void printMessage(String message, List<String> stringList) {
		stringList.add(message);
		if (StringUtils.isNotBlank(message)) {
			System.out.println("Message : " + message);
		} else {
			System.out.println("Blank string encountered.");
		}
	}

	/**
	 * @param stringList
	 */
	public void printMessageList(List<String> stringList) {
		for (String message : stringList) {
			if (StringUtils.isNotBlank(message)) {
				System.out.println("Message : " + message);
			} else {
				System.out.println("Blank string encountered.");
			}
		}
	}
}