import plant.demo;
import java.util.*;
public class basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter length & breath of rectangle=");
        a=sc.nextInt();
        b=sc.nextInt();
        demo obj= new demo(a,b);
        obj.area();
        obj.perameter();
    }
}
