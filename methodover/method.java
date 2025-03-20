/*
    Method overriding in java
    :- 
 */
package methodover;
public class method {
    int x,y;

    void display(){
        System.out.println("squere of x="+(x*x));
        System.out.println("squere of y="+y*y);
        System.out.println("Addition="+x+y);
        System.out.println("subtraction="+(x-y));
        System.out.println("multiplication="+x*y);
        System.out.println("divide="+x/y);
    }
}

class comput extends method{
    comput (int a,int b){
        x=a;
        y=b;

    }
    void display(){
        super.display();
        System.out.println("cube of x="+(x*x*x));
        System.out.println("cube of y="+(y*y*y));

    }
}
class method1{
    public static void main(String args[]){
        comput obj=new comput(4,5);
        obj.display();
        obj.display();
    }
}