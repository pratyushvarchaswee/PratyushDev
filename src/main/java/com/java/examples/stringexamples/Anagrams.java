package com.java.examples.stringexamples;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/***
 * Input Format

 The first line contains a single string, .
 The second line contains a single string, .

 Constraints

 It is guaranteed that  and  consist of lowercase English alphabetic letters (i.e.,  through ).
 Output Format

 Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

 Sample Input

 cde
 abc

 Sample Output

 4
 */

public class Anagrams {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeededUsingArray(a, b));

        // version 2

        numberNeededUsingHashMap(a,b);
    }

    /**
     *  This method returns how many characters needs to be removed
     *  to make strings Anagram of each other.
     * @param one
     * @param two
     * Letters
     * @return
     */
    private static int numberNeededUsingArray(String one, String two) {
        int [] frequency =  new int[26];


        one.chars().forEach(c -> {
            frequency[c - 'a']++;
            System.out.println(frequency[c-'a']);
        });
        two.chars().forEach(c -> frequency[c-'a']--);
        return IntStream.of(frequency).map(i -> Math.abs(i)).sum();
    }

    private static int numberNeededUsingHashMap(String one ,String two)

    {
      for(Character ch : ConvertStringToCharacterArray.convertStringToCharacterArray(one))
      {
          System.out.print( ch.charValue());
      }

      return 0;
    }

}
