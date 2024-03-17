package map;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConversion {

	public static void main(String[] args) {
		// Create a list of strings
        List<String> inputList = Stream.of("aBc", "d", "ef").collect(Collectors.toList());

        // Convert the list to uppercase using map
        List<String> uppercaseList = inputList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original List: " + inputList);
        System.out.println("Uppercase List: " + uppercaseList);
    
	}

}
