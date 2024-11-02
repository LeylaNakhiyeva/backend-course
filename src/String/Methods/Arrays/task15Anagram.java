package String.Methods.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class task15Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        checkAnagram(word1, word2);
    }

    public static void checkAnagram(String word1, String word2) {
        boolean check=false;
        word1=word1.toLowerCase();
        word2=word2.toLowerCase();
        char [] s= word1.toCharArray();
        char [] c=word2.toCharArray();
        if(word1.length()!=word2.length()){
            System.out.println("Bu sözlər anaqram deyil!");
        }
            for (int i=0; i< s.length; i++){
                for (int j=0; j< c.length; j++){
                    if(s[i]==c[j]){
                        check=true;
                    }
                }
            }
            if (check==true) System.out.println("bu sozler anagramdir");
            else System.out.println("deyil");
//        for(int i=0; i<word2.length(); i++){
//        if (word1.contains(String.valueOf(word2.charAt(i)))) {
//            check=true;
//        }
//    }
//        if (check){
//            System.out.println("Bu sözlər anagramdır.");
//        }
//        else System.out.println("Bu sözlər anagram deyil!");
}
    }
