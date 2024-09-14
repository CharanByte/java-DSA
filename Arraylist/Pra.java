import java.lang.reflect.Array;
import java.util.*;

/**
 * Pra
 */
public class Pra {

    public static void main(String[] args) {
        ArrayList<Integer> arrlist =  
                        new ArrayList<Integer>(5); 
  

        arrlist.add(12); 
        arrlist.add(20); 
        arrlist.add(45); 
  
        System.out.println("Printing list1:"+arrlist); 
      
        ArrayList<Integer> arrlist2 =  
                            new ArrayList<Integer>(5); 
  
        arrlist2.add(25); 
        arrlist2.add(20); 
        arrlist2.add(31); 
        arrlist2.add(35); 

        System.out.println("Printing list2:"+arrlist2); 

     arrlist.addAll(1,arrlist2);
        System.out.println(arrlist);
        Collections.sort(arrlist);
        System.out.println("sorted :"+arrlist);
    int[] arr={3,5,7,2,1,3,2,9};
    System.out.println(Arrays.toString(arr));

    HashSet<Integer> s=new HashSet<>();
    
    HashSet<Integer> s1=new HashSet<>();


    s1.add(20);
        s1.add(5);
        s1.add(6);
        s1.add(5);
System.out.println("s1 : "+s1.size());
    for(int i=0;i<arr.length;i++){
        s.add(arr[i]);
    }

        System.out.println(s);

        s.addAll(s1);
        
        System.out.println("sort : "+s);
        System.out.println("sort : "+s);

    System.out.println(s.toString());


TreeSet<Integer> s2=new TreeSet<>();
    
    TreeSet<Integer> s3=new TreeSet<>();


    s1.add(20);
        s1.add(5);
        s1.add(6);
        s1.add(5);
System.out.println("s1 : "+s1.size());
    for(int i=0;i<arr.length;i++){
        s.add(arr[i]);
    }

        System.out.println(s);

        s.addAll(s1);
        
        System.out.println("sort : "+s);
        System.out.println("sort : "+s);

    System.out.println(s.toString());


    }
}