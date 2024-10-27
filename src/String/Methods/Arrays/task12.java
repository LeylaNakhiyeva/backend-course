package String.Methods.Arrays;

public class task12 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={3,4,5,6,7};
        kesisme( arr1, arr2);
    }
    public static int kesisme(int [] array1, int [] array2){
        array1 =new int[] {11,13,12,17};
        array2= new int[]{11,17,23,45,56,455};
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array2.length; j++){
                if (array1[i]==array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
        return 0;
    }
}

