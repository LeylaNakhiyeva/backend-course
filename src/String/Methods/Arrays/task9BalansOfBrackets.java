package String.Methods.Arrays;

public class task9BalansOfBrackets {
    public static void main(String[] args) {
        String arr = "aaa(hfhh)gjj(yt(jt}}}}thjh][gfhd{";
        String a = "(", b=")", c="{", d="}", e="[", k="]";
        int say_a = 0, say_b=0, say_c=0, say_d=0, say_e=0, say_k=0;
            for (int i = 0; i < arr.length(); i++) {
                if (a.contains(String.valueOf(arr.charAt(i)))) {
                    say_a++;
                }
            }
            System.out.print("(: "+say_a+",    ");
        for (int i = 0; i < arr.length(); i++) {
            if (b.contains(String.valueOf(arr.charAt(i)))) {
                say_b++;
            }
        }
        System.out.println("): "+say_b+"  ");
        for (int i = 0; i < arr.length(); i++) {
            if (c.contains(String.valueOf(arr.charAt(i)))) {
                say_c++;
            }
        }
        System.out.print("{: "+say_c+",    ");
        for (int i = 0; i < arr.length(); i++) {
            if (d.contains(String.valueOf(arr.charAt(i)))) {
                say_d++;
            }
        }
        System.out.println("}: "+say_d+"  ");
        for (int i = 0; i < arr.length(); i++) {
            if (e.contains(String.valueOf(arr.charAt(i)))) {
                say_e++;
            }
        }
        System.out.print("[: "+say_e+",    ");
        for (int i = 0; i < arr.length(); i++) {
            if (k.contains(String.valueOf(arr.charAt(i)))) {
                say_k++;
            }
        }
        System.out.println("]: "+say_k+" ");
        if (say_a==say_b) System.out.println("( )- balanslıdır");
        else System.out.println("( )- balanslı deyil");
        if (say_c==say_d) System.out.println("{ }- balanslıdır");
        else System.out.println("{ }- balanslı deyil");
        if (say_e==say_k) System.out.println("[ ]- balanslıdır");
        else System.out.println("[ ]- balanslı deyil");
        }
    }
