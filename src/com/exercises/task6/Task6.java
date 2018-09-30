package com.exercises.task6;

/**
 * Reverse string
 */

public class Task6 {
    public static void main(String[] args) {
        String line = "abcdefff";
        char[] arrayOfCharacter = line.toCharArray();
        char character;
        for (int i = 0; i < arrayOfCharacter.length / 2; i++) {
            character = arrayOfCharacter[i];
            arrayOfCharacter[i] = arrayOfCharacter[arrayOfCharacter.length - 1 - i];
            arrayOfCharacter[arrayOfCharacter.length - 1 - i] = character;
        }
        line = new String(arrayOfCharacter);
        System.out.println(line);
    }
}
