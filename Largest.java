import java.util.Arrays;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("largest"+largestele(arr ,n));
        System.out.println();
        Arrays.sort(arr);
        for(int a:arr){
            System.out.println("sort"+a);

        }
       
    }
    public static int largestele(int[] arr,int n) {
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
        return max;
        
    }
    
}
