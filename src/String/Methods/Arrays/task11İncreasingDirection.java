package String.Methods.Arrays;

import java.util.Scanner;

public class task11İncreasingDirection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massivin ölçüsü: ");
        int n = sc.nextInt();
        System.out.println("Massivin elementləri: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Massiv: ");
        for (int i=0; i< arr.length; i++){
            System.out.println("arr["+i+"]= "+arr[i]);
        }
        System.out.println();
        System.out.println("Artan istiqamətdə massivin elementləri: ");
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
