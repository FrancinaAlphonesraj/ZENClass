package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a list of strings
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter non-empty strings
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Original List: " + listStrings);
        System.out.println("List with Non-Empty Strings: " + nonEmptyStrings);
	}

}
