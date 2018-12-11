package fiboWord;

// https://en.wikipedia.org/wiki/Fibonacci_word ??!!?!?!?

public class Main
{
    static String seed1 = "0";
    static String seed2 = "1";
    static String word = seed1+seed2;
    static int iterations = 10;

    public static void main(String[] args)
    {
        alterWord();
    }

    static void alterWord()
    {
        iterations--;
        if(iterations >0)
        {
            word += word.substring(word.length()-2, word.length());
            System.out.println(word);
            alterWord();
        }

    }
}
