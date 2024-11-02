package String.Methods.Arrays;

public class task12İntersection {
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5};
        int [] array2={3,4,5,6,7};
        intersectionOfArray(array1, array2);
    }
    public static void intersectionOfArray( int[] arr1, int [] arr2){
       String result="";
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j< arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    result+=arr1[i]+",";
                }
            }
        }
        System.out.println("{"+result.substring(0,result.length()-1)+"}");

    }
}
