package level1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.IntStream;

public class VowelCheck {
    public static void main(String[] args) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)  // Check if character is in the vowel set
                .forEach(System.out::println);
    }
}
//TC : O(1)
//Set.contains(c) is O(1) (constant time) lookup,
// which is faster than indexOf() O(n) (linear time) when checking large datasets.
