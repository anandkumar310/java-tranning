/* 
type of operator

1. unary operator =>increment/decremnet operator
2. Binary operator => 1. Arithematic operater 
3. ternary operator

*/

import java.util.Scanner;

class Add{
public static void main(String args[]){
   int a,b,c;
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter any two value for add=");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.print("Addition="+c);

	c=a-b;
	System.out.print("\nSubtraction="+c);
	
	c=a*b;
	System.out.print("\nmultiplication="+c);

	c=a/b;
	System.out.print("\nDivision="+c);

    }
}