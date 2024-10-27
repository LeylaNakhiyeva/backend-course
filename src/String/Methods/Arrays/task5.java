package String.Methods.Arrays;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Arrayin ölçüsünü daxil edin: ");
        int n = sc.nextInt();
        System.out.println("Arrayin elementlərini daxil edin: ");
        int[] arr = new int[n];
        int[] arrReverse = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]= " + arr[i]);
        }
        System.out.println();
        reverseArray(arr,arrReverse);
        for (int i=0;i<arrReverse.length;i++){
            System.out.println(arrReverse[i]);
        }
    }
    public static void reverseArray(int [] array,int [] arrayResult){
        int k=0;
        for(int i=array.length-1;i>=0;i--){
            arrayResult[k]=array[i];
            k++;
        }

    }
}
