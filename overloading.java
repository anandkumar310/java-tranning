/*
    Method overloading: Method overloading in java is also known as polymorphism.

        => There are three limitation of overloading.
            1: Number of pairameter.
                    void dis(){
                    .....
                    }
                    void dis(int a)
                    {
                        ...
                    }
                        obj.dis();
                        obj.dis(5);

            2: type of parameter.
                void dis(int x){
                ......
                }
                void dis(float x);
                {
                .....
                }
                obj.dis(5);
                obj.dis(5.5);

            3:Sequence of parameter
                void dis(int x,float y)
                {
                .....
                }
                void dis(float x,int y){
                .....
                }
                obj.dis(5,5.5);
                obj.dis(3.4,6);

*/

//========overloading all type program=============
import java.util.*;

class overloading{
    int x,y;
    float z;
    void disp(int a){
        int x=a;
        System.out.print("Area of squere="+x*x);
    }
    void disp(float a)
    {
        float x=a;
        System.out.print("\nArea of squere="+x*x);

    }
    void disp(int a, int b)
    {
        int x,y;
        x=a;
        y=b;
        System.out.print("\nAdd="+(x+y));
        System.out.print("\nSub="+(x-y));
        System.out.print("\nmul="+(x*y));
        System.out.print("\ndiv="+(x/y));

    }
    void disp(int a,float b){
        int x=a;
        float y=b;
        System.out.print("\nValue of x="+x);
        System.out.print("\nValue of y="+y);
        System.out.print("\nSquere of x="+x*x);
        System.out.print("\nSquere of y="+y*y);
    }
    void disp(float a,int b){
        float x=a;
        int y=b;
        System.out.print("\nValue of x="+x);
        System.out.print("\nValue of y="+y);
        System.out.print("\nSquere of x="+x*x);
        System.out.print("\nSquere of y="+y*y);
    }

}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        float c;
        System.out.print("Enter two integer value=");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.print("Enter any float value=");
        c=sc.nextFloat();
        overloading obj= new overloading();
        obj.disp(a);
        obj.disp(c);
        obj.disp(a,b);
        obj.disp(a,c);
        obj.disp(b,c);
    }
}
