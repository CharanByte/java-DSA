public class SelectionSort {
    
    public static void main(String[] args) {
        int [] arr={7,4,10,8,3,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
            for(int nu: arr){
                System.out.print(nu);
            }
            System.out.println();
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
