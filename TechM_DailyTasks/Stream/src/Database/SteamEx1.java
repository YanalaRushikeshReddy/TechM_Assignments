package Database;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamEx1 {
    public static void main(String[] args) {
    	char ch = 'h';
    		       
        List<String> words = Arrays.asList("java", "WorLd", "TrEe", "StrEaMs" , "hi" ,"hi");
        
        List<String> upper = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
       
        List<String> lower = words.stream()
        		                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
       
        List<String> distinct = words.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
        List<String> sorted = words.stream()
        		.map(String::toLowerCase)
                                            .sorted()
                                            .collect(Collectors.toList());
        Long CountSpecificwords = words.stream()
                                             .filter(word -> word.startsWith(String.valueOf(ch)))
                                             .count();
        
        System.out.println("Uppercase words: " + upper);
        System.out.println("Lowercase words: " + lower);
        System.out.println("Distinct words: " + distinct);
        System.out.println("Sorted words: " + sorted);
        System.out.println("Count: " + CountSpecificwords);
    }
}