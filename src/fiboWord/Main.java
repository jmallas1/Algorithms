package fiboWord;

// https://en.wikipedia.org/wiki/Fibonacci_word ??!!?!?!?

public class Main
{
    static String seed1 = "0";
    static String seed2 = "1";
    static String word = seed1+seed2;
    int iterations = 10;
    public static void main(String[] args)
    {

        System.out.println(word);
    }

    void alterWord(String theWord)
    {
        iterations--;
        word += theWord.substring(word.length()-2, word.length());

    }
}
