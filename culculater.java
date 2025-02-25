import java.util.*;
public class culculater {
    public static void main(String[] args) {
        char ch;
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter first value=");
        a=obj.nextInt();
        System.out.print("Enter your choice +,-,*,/,%=");
        ch=obj.next().charAt(0);
        System.out.print("Enter second value=");
        b=obj.nextInt();
        switch (ch) {
            case '+':
                System.out.println("Addition="+(a+b));
                break;
                case '-':
                System.out.println("Subtraction="+(a-b));
                break;
                case '*':
                System.out.println("multiplication="+(a*b));
                break;
                case '/':
                System.out.println("Division="+(a/b));
                break;
                case '%':
                System.out.println("remainder="+(a%b));
                break;
            default:
            System.out.println("invalid sign");
                break;
        }
    }
}
