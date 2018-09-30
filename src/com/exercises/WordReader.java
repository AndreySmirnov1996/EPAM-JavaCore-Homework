package com.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String reader
 */

public class WordReader {
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void inputWord() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean flag = true;
            while (flag) {
                System.out.print("Enter the word: ");
                word = reader.readLine();
                flag = false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Character getCharacter(String str, int index) {
        Character ch = null;
        try {
            ch = str.charAt(index);
        } catch (StringIndexOutOfBoundsException ex) {
            System.err.println();
        }
        return ch;
    }
}
