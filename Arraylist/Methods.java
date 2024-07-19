import java.util.ArrayList;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
    
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(1);
        array.add(7);
        array.add(3);
        array.add(0,8);
        array.set(3, 9);
        boolean present=array.contains(1);
    
     System.out.println(present);
        System.out.println(array);
        System.out.println(array.get(2));
        System.out.println(array.size());
        System.out.println(array.isEmpty());

        array.remove(3);
        array.add(9);
        System.out.println(array);
        System.out.println(array.subList(0,2));
        Object[] arr= array.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        


    }
    
}
