import java.util.ArrayList;
import java.util.Scanner;
public class Input {
// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     ArrayList<String> arr=new ArrayList<String>();
//     System.out.println("element");
//     int size=sc.nextInt();

//     for(int i=0;i<size;i++ ){
//         String elements=sc.nextLine();
//         arr.add(elements);
//     }
//     System.out.println(arr);
// }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt(); // Number of elements
        // Consume the newline character

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            list.add(element);
        }

        // Display the list
        System.out.println("ArrayList: " + list);
    }
}

