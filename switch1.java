import java.util.*;
public class switch1 {
    public static void main (String args[]){
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter any charecter=");
        ch=obj.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("charecter is vowel");
                break;
        
            default:
            System.out.println("charecter is constent");
                break;
        }
    }
}
