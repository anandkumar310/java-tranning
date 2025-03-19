/*
 *   Inheritance:- 
 *  Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
 *  It is an important feature of OOPs.
 *  It represents. the IS-A relationship which is also known as a parent-child relationship.
 *  It is used for code reusability and method overriding.
 *  real-world relationships well.
 *  It provides reusability of a code.
 *  It is used to achieve runtime polymorphism.  
    *   Types of Inheritance:-
    *   1>Single Inheritance.
    *   2>Multiple Inheritance. 
    *   3>Multi-level Inheritance.
    *   4>Hybrid Inheritance.
    *   5>Hierarchical Inheritance.
    *   6>Simple Inheritance.
 */

 //Single Inheritance
    //Single Inheritance is a type of inheritance in which a class inherits from only one class.

    //Example of Single Inheritance
/*public class inheritance {
    int x,y;
    void cal(){
        System.out.println("Addition="+(x+y));
        System.out.println("Subtraction="+(x-y));   
        System.out.println("Multiplication="+(x*y));
        System.out.println("Division="+(x/y));
        System.out.println("Remainder="+(x%y));
    }
}
class power extends inheritance{
     power(int a, int b){
        x=a;
        y=b;
    }
    void disp(){
        System.out.println("square of x="+(x*x));
        System.out.println("square of y="+(y*y));
    }
}
class calulater{
    public static void main(String[] args) {
        power obj=new power(5,2);
        obj.cal();
        obj.disp();
    }
}*/

//Multlevel Inheritance:-

//Multilevel Inheritance is a type of inheritance in which a class inherits from a class which is also inherited from another class.

//Example of Multilevel Inheritance
/*public class inheritance {
    int x,y;
    void cal(){
        System.out.println("Addition="+(x+y));
        System.out.println("Subtraction="+(x-y));   
        System.out.println("Multiplication="+(x*y));
        System.out.println("Division="+(x/y));
        System.out.println("Remainder="+(x%y));
    }
}
class power extends inheritance{
  
    void disp(){
        System.out.println("square of x="+(x*x));
        System.out.println("square of y="+(y*y));
    }
}
class c extends power{
    c(int a, int b){
        x=a;
        y=b;
    }
    void display(){
        System.out.println("cube of x="+(x*x*x));
        System.out.println("cube of y="+(y*y*y));
    }
}
class calulater{
    public static void main(String[] args) {
        c obj=new c(5,2);
        obj.cal();
        obj.disp();
        obj.display();
    }
}*/

// Hierarchial Inheritance:-
// Hierarchical Inheritance is a type of inheritance in which more than one class inherits from a single class.

//Example of Hierarchical Inheritance.

/*public class inheritance {
    int x,y;
    void cal(){
        System.out.println("Addition="+(x+y));
        System.out.println("Subtraction="+(x-y));   
        System.out.println("Multiplication="+(x*y));
        System.out.println("Division="+(x/y));
        System.out.println("Remainder="+(x%y));
    }
}
class power extends inheritance{
    power(int a, int b){
        x=a;
        y=b;
    }
  
    void disp(){
        System.out.println("square of x="+(x*x));
        System.out.println("square of y="+(y*y));
    }
}
class c extends inheritance{
    c(int a, int b){
        x=a;
        y=b;
    }
    void display(){
        System.out.println("cube of x="+(x*x*x));
        System.out.println("cube of y="+(y*y*y));
    }
}
class calulater{
    public static void main(String[] args) {
        c obj=new c(5,2);
        power obj1=new power(3,4);
        obj.cal();
        obj.display();
        obj1.cal();
        obj1.disp();
    }
}*/

//======Multiple inheritance:-
//Multiple Inheritance is a type of inheritance in which a class inherits from more than one class.

//Example of Multiple Inheritance
//Multiple Inheritance is not supported in Java.

//Hybrid Inheritance:-
//Hybrid Inheritance is a combination of two or more types of inheritance.
    //Example of Hybrid Inheritance
