package com.exercises.task3;

import com.exercises.WordReader;

/**
 * 9.15. Дано слово. Вывести на экран его k-й символ.
 */

public class Task3 {
    public static void main(String[] args) {
        WordReader word = new WordReader();
        word.inputWord();
        String line = word.getWord();
        int k = 4;
        Character kChar = word.getCharacter(line, k - 1);
        if (kChar != null) {
            System.out.println(kChar);
        } else {
            System.out.println("The word hasn't index = " + k);
        }
    }
}
