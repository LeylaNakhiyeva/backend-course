package String.Methods.Arrays;

import java.util.Scanner;

public class task13ReverseSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence= sc.nextLine();
        reverseSentence1(sentence);
        reverseSentence2(sentence);
    }
    public static void reverseSentence1(String sentence){//Hello World
      String[] splitWord=sentence.split(" ");
      String result="";
      for(int i=splitWord.length-1;i>=0;i--){
          result+=splitWord[i]+" ";

      }
        System.out.println(result);
    }
    public static void reverseSentence2(String sentence){
        String result="";
            for(int j=sentence.length()-1; j>=0; j--){
                result+=sentence.charAt(j);
            }
        System.out.println(result);
    }
}


