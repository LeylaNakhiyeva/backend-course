package String.Methods.Arrays;

import java.util.Scanner;

public class task4CheckValue {
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
        check(arr);
    }
    public static void check(int [] array){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        boolean checkData=false;
        for (int i=0; i<array.length; i++){
            if (array [i]==a){
                System.out.println("Bu elementin indeksi: "+i);
                checkData=true;
                break;
            }
        }
        if(!checkData){
            System.out.println(-1);
        }

            }
        }


