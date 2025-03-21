package abstractionp;
/*
 *  Abstruction in java:- use to hide data hide-data abstraction show only essential.
    
    Abstraction can be done by two ways in java:-
    1. Abstract class (0 to 100%)
        >Syntax of abstract class:-
            abstract class A{
                void show(){
                    System.out.println("Hello");
                }
            }
    2. Interface (100%)
        >Syntax of interface:-
            interface A{
                void show();
            }
 */

abstract class Demo{
    int x,y;
    void display(){
        System.out.println("Value of x="+x);
        System.out.println("Value of y="+y);    

    }
    abstract void getdata(int a,int b);
   

}

class example extends Demo{
    public void getdata(int a,int b){
      x=a;
      y=b;
    }
    void cal(){
        System.out.println("Square of x="+(x*x));
        System.out.println("Square of y="+(y*y));
    }
}

class abstract1{
    public static void main(String[] args) {
        example obj=new example();
        obj.getdata(4, 6);
        obj.display();
        obj.cal();
    }
}
