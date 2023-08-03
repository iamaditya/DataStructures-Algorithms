public class main {

    public static void sortme(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        sortme(arr);

        for(var x : arr){
            System.out.print(x+" ");
        }
    }
}
