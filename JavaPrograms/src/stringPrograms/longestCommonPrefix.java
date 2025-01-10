package stringPrograms;

import java.util.ArrayList;
import java.util.List;

public class longestCommonPrefix {


    public static void main(String[] args) {

        longestCommonPrefix solution = new longestCommonPrefix();

        // Test cases
        String[] strs1 = {"aflower", "aflow", "aflight"};
        System.out.println("Longest common prefix of strs1: " + solution.longestCommonPrefix(strs1)); // Output: fl


    }

    public String longestCommonPrefix(String[] strs) {
        // Handle edge cases
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        // Take first string as initial prefix
        String prefix = strs[0];

        // Compare prefix with all other strings
        for (int i = 1; i < strs.length; i++) {

            // While current string doesn't start with prefix
            while (strs[i].indexOf(prefix) != 0) {

                // Shorten prefix by removing last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
