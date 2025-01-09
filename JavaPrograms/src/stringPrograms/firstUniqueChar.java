package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class firstUniqueChar {

    // Given a string s, find the first non-repeating character in it and return its index.
    // If it does not exist, return -1.

    public static void main(String[] args) {

       System.out.println( uniqueCharacter("grreatgeekyants"));
        System.out.println( firstUniqCharacter("greatgeekyants"));

    }

    public static int uniqueCharacter(String s) {

        // Create HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }

    public static char firstUniqCharacter(String s) {

        if (s == null || s.isEmpty()) {
            return '\0';  // Return null character if string is empty
        }

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (freqMap.get(c) == 1) {
                return c;  // Returns the character
            }
        }
        return '\0';  // Return null character if no non-repeating character found
    }
    }

