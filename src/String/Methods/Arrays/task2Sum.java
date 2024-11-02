package String.Methods.Arrays;

import java.util.Scanner;

public class task2Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Massivin ölçüsü: ");
        int n= sc.nextInt();
        System.out.println("Massivin elementləri: ");
        int [] arr= new int[n];
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0; i< arr.length; i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }
        System.out.println();
        cemHasil(arr);
    }
    public static void cemHasil(int [] array){
        int cem=0, hasil=1;
        for (int i=0; i< array.length; i++){
            if (array[i]%2!=0){
                cem+=array[i];
            }
            if (array[i]%2==0){
                hasil*=array[i];
            }
        }
        System.out.println("Massivin tək elementlərinin cəmi: "+cem);
        System.out.println("Massivin cüt elementlərinin hasili: "+hasil);
    }
}
