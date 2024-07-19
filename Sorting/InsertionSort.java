public class InsertionSort {
    public static void main(String[] args) {
        int [] arr={3,8,5,2,1,6,7};
        insert(arr);
        for(int i :arr){
            System.out.print(i);
        }

    }

    public static void insert(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
           int  j=i-1;
           while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
           }
           arr[j+1]=temp;
        }
    }
    
}
