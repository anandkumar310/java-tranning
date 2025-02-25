import java.util.Scanner;

class input1{
  public static void main(String args[])
   {
     String a;
     int n;
     double per;
     char grad;
	Scanner obj= new Scanner(System.in);
	System.out.print("Enter student name=");
	a=obj.nextLine();

	System.out.print("Enter student roll no=");
	n=obj.nextInt();

	System.out.print("Enter student percentage=");
	per=obj.nextDouble();

	System.out.print("Enter student Grad=");
	grad=obj.next().charAt(0);

	System.out.println("-----Student Detail------");
	System.out.println("Student name="+a);
	System.out.println("Student roll no="+n);
	System.out.println("Student percentage="+per);
	System.out.println("Student grad="+grad);

    }
 }




     