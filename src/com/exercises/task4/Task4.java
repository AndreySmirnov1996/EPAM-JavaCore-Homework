package com.exercises.task4;

/**
 * 9.64. Дано предложение. Определить, сколько в нём одинаковых соседних букв.
 */

public class Task4 {

    public static int countEqualNeighbouringLetters(String sentence) {
        int result = 0;
        char[] arr = sentence.toCharArray();
        for (int i = 0; i < arr.length; ++i) {
            if (i == 0) {
                if (arr[i] == arr[i + 1]) {
                    result++;
                }
            } else if (i == arr.length - 1) {
                if (arr[arr.length - 1] == arr[arr.length - 2]) {
                    result++;
                }
            } else {
                if ((arr[i] == arr[i - 1]) || (arr[i] == arr[i + 1])) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String line = "ttaa";
        System.out.println(countEqualNeighbouringLetters(line));
    }
}
