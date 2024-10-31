package String.Methods.Arrays;

public class toUpper {
    public static void main(String[] args) {
        String name="leyla";
        char c= (char) (name.charAt(0)-32);
        System.out.println(c+name.substring(1));
    }
}
