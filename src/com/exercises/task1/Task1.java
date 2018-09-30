package com.exercises.task1;

import com.exercises.WordReader;

/**
 * 9.13. Дано слово. Вывести на экран его третий символ.
 */

public class Task1 {
    public static void main(String[] args) {
        WordReader word = new WordReader();
        word.inputWord();
        Character third = word.getCharacter(word.getWord(), 2);
        if (third != null) {
            System.out.println(third);
        } else {
            System.out.println("The word is less then three characters.");
        }
    }
}
