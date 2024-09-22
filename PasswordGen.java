import java.util.Random;
import java.util.Scanner;

public class PasswordGen {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] a=passwordgenarator(n);
        System.out.println(a);
        System.out.println(a+"@gmail.com");
    }
    public static char[] passwordgenarator(int n){
        char[] pass=new char[n];
        Random random=new Random();
         String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String lower="abcdefghijklmnopqrstuvwxyz";
         String spec="@#$!";
         String num="1234567890";
         String combine=upper+lower+spec+num;

         pass[0]=upper.charAt(random.nextInt(upper.length()));
         pass[1]=lower.charAt(random.nextInt(lower.length()));
         pass[2]=spec.charAt(random.nextInt(spec.length()));
         pass[3]=num.charAt(random.nextInt(num.length()));
        for(int i=4;i<n;i++){
            pass[i]=combine.charAt(random.nextInt(combine.length()));
        }
        
        return pass;
    }
    
}
