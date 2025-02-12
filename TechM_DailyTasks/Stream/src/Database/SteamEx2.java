package Database;

import java.util.Arrays;
import java.util.List;
public class SteamEx2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        double max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        double min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);
        double sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("sum: " + sum);
        System.out.println("Average: " + average);
    }
}