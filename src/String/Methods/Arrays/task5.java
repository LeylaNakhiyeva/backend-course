package String.Methods.Arrays;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Arrayin ölçüsünü daxil edin: ");
        int n = sc.nextInt();
        System.out.println("Arrayin elementlərini daxil edin: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]= " + arr[i]);
        }
        System.out.println();
        reverseArray(arr);
    }
    public static void reverseArray(int [] array){
        array= new int[]{1, 2, 3, 4, 5};
        for (int i= 0; i>= array.length; i++){
           array[i]=array[array.length-1];
                System.out.println("array["+i+"]="+array[i]);

        }                 //problemli
    }
}
