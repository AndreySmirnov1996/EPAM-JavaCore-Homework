package com.exercises.task2;

import com.exercises.WordReader;

/**
 * 9.14. Дано слово. Вывести на экран его последний символ.
 */

public class Task2 {
    public static void main(String[] args) {
        WordReader word = new WordReader();
        word.inputWord();
        String line = word.getWord();
        Character last = word.getCharacter(line, line.length() - 1);
        if (last != null) {
            System.out.println(last);
        } else {
            System.out.println("The word is empty!");
        }
    }
}

