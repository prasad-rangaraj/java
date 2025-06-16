public class Task1 {
     public static void main(String[] args) {
        int[] arr = {1,2,3,2,5};
        int temp,min,k;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        min = arr[1] - arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]-arr[i]) <= min){
                    min = arr[j] - arr[i];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[j]-arr[i]) == min){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
