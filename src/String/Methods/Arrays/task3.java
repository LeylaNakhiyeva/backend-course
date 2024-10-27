package String.Methods.Arrays;

import java.util.Scanner;

public class task3 {
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
        changeMaxMinValue(arr);
    }

    public static void changeMaxMinValue(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            else if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Maksimum və minimum elementlər:");
        System.out.println("max= " + max);
        System.out.println("min= " + min);
        System.out.println();
            int b = max + min;
            System.out.println("Maksimum və minimum elementlərin yerini dəyişdikdən sonra: ");
            max = b - max;
            min = b - min;
        System.out.println("max= "+max);
        System.out.println("min= "+min);
        }
    }
