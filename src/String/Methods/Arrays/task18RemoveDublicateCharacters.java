package String.Methods.Arrays;

import java.util.Scanner;

public class task18RemoveDublicateCharacters {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String text= sc.next();
        removeDublicateCharacters(text);
    }
    public  static void removeDublicateCharacters(String text){
        String result="";
        boolean check=false;
        for (int i=0; i<text.length(); i++){     //programming
            check=false;
            for(int j=i+1; j<text.length(); j++){
                if(text.charAt(i)==text.charAt(j)){
                   check=true;                }
            }
            if(!check) result+=text.charAt(i);
        }
        System.out.println(result);
    }}