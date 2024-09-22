// Input :
// 8  – Value of N
// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
// Output:
// 4 5 1 9 5 0 0 0
// Example 2:
// Input:
// 6 — Value of N.
// [6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline
// Output:
// 6 1 8 2 0 0
/**
 * PushZero
 */
import java.util.*;
public class PushZero {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<N;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }

        }
        for(int i=count;i<N;i++){
            arr[i]=0;
        }
        for(int i=0; i<N;i++){
            System.out.print(arr[i]);
        }
        
    }
}