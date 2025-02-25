import java.util.*;
public class odd {
    public static void main(String[] args) {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any value for check even or odd ");
        a=obj.nextInt();
        if(a%2==0)
        {
            System.out.println("A is even number");
        }
        else
        {
            System.out.println("A is odd number");
        }
        
        if(a>0)
        {
            System.out.println("A is positive number");
        }
        else{
            System.out.println("A is negative number");
        }
    }
}
