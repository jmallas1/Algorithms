package football;

import java.util.Scanner;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {
        long reference=System.nanoTime();
        int score = getNumberFromUser();
        for (int c=0;c < score; c++) {
            for (int x=0;x < score; x++) {
                for (int t=0;t < score; t++) {
                    for (int f=0;f < score; f++) {
                        for (int s=0;s < score; s++) {
                            correctScore(score, s,f,t,x,c);
                        }
                    }
                }
            }
        }
        System.out.println(count + " different ways to score.");
        long finishm=System.nanoTime();
        System.out.println(( (double)(finishm-reference) )/1000000000.0 + " Nano Seconds for a score of " + score);
    }
    public static int getNumberFromUser() {
        Scanner keyboard = new Scanner(System.in);
        boolean goodInput = false;
        int score = 0;
        do {
            System.out.print("Please Enter a Football score to be used in calculation: ");
            String temp = keyboard.nextLine();
            if (temp.indexOf('.') >= 0) {
                temp = temp.substring(0,temp.indexOf('.'));
            }
            if (isNumeric(temp)) {
                score = Integer.parseInt(temp);
                goodInput = true;
            }
        } while (!goodInput);
        return score;
    }
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    public static void correctScore(int score, int s, int f, int t, int x, int c) {
        if ((s*2 + f*3 + t*6 + x*7 + c*8) == score) {
            count++;
            String wayScoreWasAchieved = ((s > 0)?s + " Safties ":"") +
                                            ((f > 0)?f + " Field Goals ":"") +
                                            ((t > 0)?t + " Touchdowns ":"") +
                                            ((x > 0)?x + " Touchdowns with Extra Point ":"") +
                                            ((c > 0)?c + " Touchdowns with Two Point Conversion ":"");
            System.out.println(wayScoreWasAchieved);
        }
    }
}
