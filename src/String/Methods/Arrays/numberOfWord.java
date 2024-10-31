package String.Methods.Arrays;

import java.util.Scanner;

public class numberOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        numberOfWord(sentence);
    }

    public static void numberOfWord(String sentence) {
        int k = 0;
        String  []  b=sentence.split(" ");
                    k= b.length;
        System.out.println(k);
    }
}
