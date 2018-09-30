package com.exercises.task5;

import com.exercises.WordReader;
import java.util.Arrays;

/**
 * 9.100. Дано слово. Поменять местами его вторую и пятую буквы.
 */

public class Task5 {
    public static void main(String[] args) {
        WordReader word = new WordReader();
        word.inputWord();
        char[] array = word.getWord().toCharArray();
        Character second = word.getCharacter(word.getWord(), 1);
        Character fifth = word.getCharacter(word.getWord(), 4);
        if (second != null && fifth != null) {
            array[1] = fifth;
            array[4] = second;
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("The word is less then five characters.");
        }
    }
}
