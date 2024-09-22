import java.util.Collections;
import java.util.LinkedList;
public class Duplicate {
    public static void main(String[] args) {
        int[] arr={2,2,4,4,5,7,8};
// LinkedList<Integer> list=new LinkedList<Integer>();
 
// for(int i:arr){
//     list.add(i);
//  }
// System.out.println(list);

//  Collections.sort(list);
//  System.out.println(list);
//  System.out.println(Collections.max(list));

 int j=1;
 for(int i=1;i<arr.length-1;i++){
    if(arr[i]!=arr[i+1]){
        arr[j++]=arr[i+1];
    }
 }
 System.out.println("length"+j);
    for(int a:arr){
        System.out.print(a);
    }
 


    }
    

}
    

