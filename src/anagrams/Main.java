package anagrams;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Please Enter Word: ");
        String word = keyboard.nextLine();
        printAnagrams("", word);
    }

    public static void printAnagrams(String prefix,
                                     String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                printAnagrams(prefix + cur, before +
                        after);
            }
        }
    }


}
