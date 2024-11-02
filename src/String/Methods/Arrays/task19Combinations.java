package String.Methods.Arrays;

public class task19Combinations {
    public static void main(String[] args) {
        String word = "abc";
        combinations(word);
    }

    public static void combinations(String text) {
        String result = "";
        int n = faktorial(text.length());
        for (int i = 0; i <= n; i++) {//abc acb bac bca cab cba  123  132 213 231 312
                result += (text.charAt(i - 2) + text.charAt(i) + text.charAt(i - 1));
                System.out.println(result);
            }
        }
        public static int faktorial ( int n){
            n = 1;
            for (int i = n; i > 0; i--) {
                n *= i;
            }
            System.out.println("Bütün kombinasiyaların sayı n!= " + n);
            return n;
        }

    }
