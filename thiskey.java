/*
this keyword :- this is a reference keyword by which we refer class member.
        1> this keyword can be refer class variable .
        2> this keyword can  be refer class method .
        3> this keyword can be refer class constructor.
          
*/

//=====using of this keyword=======
/*import java.util.Scanner;

public class thiskey{
    String name;
    int roll;
    char gread;
    thiskey(String Name , int Roll, char Gread)
    {
        this.name=Name ;
        this.roll=Roll;
        this.gread=Gread;

    }
    void disp(){
        System.out.println("Student name is="+this.name);
        System.out.println("Student roll is ="+this.roll);
        System.out.println("Student gread is ="+this.gread);
    }
}
class ram{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        String n;
        int r;
        char g;
        System.out.println("Enter Student name=");
        n=obj.nextLine();
        System.out.println("Enter student roll no=");
        r=obj.nextInt();
        System.out.println("Enter sudent gread=");
        g=obj.next().charAt(0);

        thiskey sc= new thiskey(n,r,g);
        sc.disp();
    }
}*/

import java.util.Scanner;

public class thiskey{
    int x,y;
    thiskey(){
        System.out.println("Default constructor");
    }
    thiskey(int a, int b)
    {
        x=a;
        y=b;

    }
    void disp(int a, int b){
        x=a;
        y=b;
        int c=x+y;
        System.out.println("Add of integer="+c);
    }
  void area(){
        this.disp(y, x);
        System.out.println("area of rectangle="+(x*y));
    }
}
class ram{
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int a,b;
        
        System.out.println("Enter two number=");
        a=obj.nextInt();
        b=obj.nextInt();
       
        thiskey sc1=new thiskey();
        thiskey sc= new thiskey(a,b);
        sc.area();

    }
}