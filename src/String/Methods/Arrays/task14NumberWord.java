package String.Methods.Arrays;

import java.util.Scanner;

public class task14NumberWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text= sc.nextLine();
        numberOfWord(text);
    }
    public static void numberOfWord(String text){
        String [] b=text.split(" ");
        int number = b.length;
        System.out.println("number= "+number);
    }
}
