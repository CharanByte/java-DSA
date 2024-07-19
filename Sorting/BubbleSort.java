public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,9,5};
        bubble(arr);
        for(int i :arr){
            System.out.print(i);
        }
        
    }
    public static void bubble(int[] arr){
        int total=arr.length;
        for(int i=0;i<total-1;i++){
            for(int j=0;j<total-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
           
        }
       
    }
    
}
