package String.Methods.Arrays;

public class task17ToUpperWords {
public static void main(String[] args) {
    String sentence="java develop kit";
    toUpperCaseOfEachWord(sentence);
}
public static void toUpperCaseOfEachWord( String text){
    String result="";
    String [] b=text.split(" ");
    for (int i=0; i<b.length; i++){
        char c=(char) (b[i].charAt(0)-32);
        result+=(c+b[i].substring(1))+" ";
    }
    System.out.println(result);
}
}
