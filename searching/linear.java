public class linear {
    public static void main(String[] args) {
        int arr[]={2,3,6,8,9};
        int target =9;
       int result= linear1(arr,target);
       System.out.println(result);
       System.out.println("--------------------------------------------------");
       int result1= linear1(arr,target);
       System.out.println(result1);

       
    }

    public static int linear1(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
                
            }

        }
        return -1;
    }


    public static int binary(int arr[],int target) {
        int left=0;
        int right=arr.length;
        while(left<=right){
            int mid =(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }

            else if(target<arr[mid]){
                right=mid-1;
                
            }
            else if(target>arr[mid]){
                left=mid+1;
        }

        
           
        }
        
       return -1;

    }
    
}
    