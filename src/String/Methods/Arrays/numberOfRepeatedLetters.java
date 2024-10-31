package String.Methods.Arrays;

import java.util.Scanner;

public class numberOfRepeatedLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        int say=1;
        for (int i = 0; i < item.length(); i++) {
            say=1;//salam
            for (int j = i+1; j < item.length(); j++) {
                if (item.charAt(i)==item.charAt(j)) {
                    say++;
                }
            }
            if(say>1)System.out.println(item.charAt(i)+" : "+say);

        }
    }
}
