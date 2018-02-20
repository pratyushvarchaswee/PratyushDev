package com.java.examples.stringexamples;

public class ConvertStringToCharacterArray {

    public static  Character [] convertStringToCharacterArray(String str)
    {
      return   str.chars().mapToObj(c->(char)c).toArray(Character[]::new);
    }

    public static Character[] convertStringToCharacterArrayNonStream(String str)
    {

        Character[] characters=new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i]=str.charAt(i);

        }
       return  characters;
    }
}
