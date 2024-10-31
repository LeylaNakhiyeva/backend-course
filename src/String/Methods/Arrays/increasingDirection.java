package String.Methods.Arrays;

import java.util.Scanner;

public class increasingDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i< arr.length; i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }
        System.out.println();
       increasingDirectionOfArray(arr);

    }

    public static void increasingDirectionOfArray(int[] array1) {
        int swap=0;
       for(int i = 0; i < array1.length-1; i++) {
        for(int j=i+1;j<array1.length;j++){
            if(array1[i]>array1[j]){
                swap=array1[i];
                array1[i]=array1[j];
                array1[j]=swap;
            }
        }
        }
       for(int i=0;i<array1.length;i++){
           System.out.println(array1[i]);
       }
    }}
