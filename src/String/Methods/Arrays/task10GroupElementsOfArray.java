package String.Methods.Arrays;

public class task10GroupElementsOfArray {
    public static void main(String[] args) {
        int [] array={5,12,19,22,8,25,30};
        groupElementsOfArray(array);
    }
    public static void groupElementsOfArray(int [] arr){
        int a=0, b=0, c=0;
        for (int i=0; i< arr.length; i++){
            if(arr[i]>=0 && arr[i]<=10){
                a++;
            }
        }
        System.out.println("[0;10]: "+a+" element");
        for (int i=0; i< arr.length; i++){
            if(arr[i]>=11 && arr[i]<=20){
                b++;
            }
        }
        System.out.println("[11;20]: "+b+"element");
        for (int i=0; i< arr.length; i++){
            if(arr[i]>=21 && arr[i]<=30){
                c++;
            }
        }
        System.out.println("[21:30]: "+c+"element");
    }
}
