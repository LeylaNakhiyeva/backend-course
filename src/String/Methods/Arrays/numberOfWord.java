package String.Methods.Arrays;

import java.util.Scanner;

public class numberOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();
        numberOfWord(sentence);
    }

    public static void numberOfWord(String sentence) {
        int k = 0;

        for (int i = 0; i < sentence.length(); i++) {
           if(sentence.charAt(i)==' ') {
                k++;
            }
        }
        System.out.println(k);
    }}




//        String  []  b=sentence.split(" ");
//                    k= b.length;
//        System.out.println(k);
//        return k;
//    }
//}
//}