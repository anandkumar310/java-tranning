import java.util.*;
public class nestedif {
    public static void main(String[] args) {
        int a, b, c, big;
        Scanner obj= new Scanner(System.in);

        System.out.print("Enter value of a=");
        a=obj.nextInt();

        System.out.print("Enter value of b=");
        b=obj.nextInt();

        System.out.print("Enter value of c=");
        c=obj.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                big=a;
            }
            else{
                big=c;
            }
        }
        else
        {
            if(b>c){
                big=b;
            }
            else{
                big=c;
            }
        }
        System.out.println("the bigger number is="+big);
    }
}
