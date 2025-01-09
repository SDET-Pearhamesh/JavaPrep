package stringPrograms;

import java.util.Arrays;

public class stringAnagram {

    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //name formed by rearranging the letters of another, such as spar, formed from rasp.

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram" , "nagxaram"));

    }

    public static boolean isAnagram(String s , String t){

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        // The String valueOf() method is a way to convert different data types into strings.
        return String.valueOf(arrS).equals(String.valueOf(arrT));

    }
}
