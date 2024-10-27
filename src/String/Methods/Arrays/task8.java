package String.Methods.Arrays;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int sozlerinsayi;
        numberOfWords(a);

    }

    public static void numberOfWords(String sentence) {
        sentence = "Hello world";
        String[] b = sentence.split(" ");
        for (String word : b) {
           for (int i=0; i<word.length();i++){
           //    word.charAt(0)=
           }
            System.out.println(word);
        }

//        int say= b.length;
//        System.out.println(say);
//
//return say;
    }
}

