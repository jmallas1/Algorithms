package fiboWord;

// https://en.wikipedia.org/wiki/Fibonacci_word ??!!?!?!?

public class Main
{
    static String seq1 = "0";
    static String seq2 = "1";
    static String word = "";
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
            word += seq1;
            word += seq2;
            System.out.println(word);
            seq1 = seq2;
            seq2 = word;
            alterWord();
        }

    }
}
