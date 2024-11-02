package String.Methods.Arrays;

import java.util.Scanner;                       //task7

public class task7ReverseWord {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String word= sc.next();
        reverseWord(word);
    }
    public static void reverseWord(String word){
       String result="";
        for(int i=word.length()-1;i>=0; i--){
              result+=word.charAt(i);
        }
        System.out.println("result= "+result);
    }
}
