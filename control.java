/*
 * Control statemnet
 * 1.Selection Statement
 *     >if-else
 *     >nested if-else
 *     >if else-if else
 *     >Switch case 
 * 2.iterative statement
 *      >while loop
 *      >do-while loop
 *      >for loop
 * 3.jump statement
 *      >break
 *      >continue
 * 
 */

import java.util.*;
public class control {
    public static void main(String[] args) {
        int a, b;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter value of a=");
        a=sc.nextInt();
        System.out.print("Enter value of b=");
        b=sc.nextInt();

        if(a>b)
        {
            System.out.println("A is greater"+a);
        }
        else{
            System.out.println("B is greater="+b);
        }
    }
}
