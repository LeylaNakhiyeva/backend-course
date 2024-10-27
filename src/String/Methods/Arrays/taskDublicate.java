package String.Methods.Arrays;

public class taskDublicate {
    public static void main(String[] args) {
        int[] dataDublicate=new int[]{1,2,3,4,1,1,2};
        int[] data=new int[dataDublicate.length];
        removeDublicate(dataDublicate,data);
        printArray(data);

    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void removeDublicate(int[]dataDublicate,int[] data){
        boolean check=false;
        int k=0;
        for(int i=0;i<dataDublicate.length;i++){
            check=false;
            for(int j=0;j<data.length;j++){
                if(dataDublicate[i]==data[j]){
                    check=true;break;
                }
            }
            if(!check){
                data[k]=dataDublicate[i];
                k++;
            }
        }
    }
}
