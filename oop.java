/*
    Class : class is a place where we can store function 
            and attribute of an object where object is blue print of class.

            >Syntax

            accessspecifier class class_name{
                feild declaration
                method declaration
                constructor            
            }
                >Field declaration
                   accesspecifier data_type variable_name=value;
                   public int a=10;
            >To create an object
                    syntax:
                        class_name object_name= new class_name();
                        ex; ram obj=new ram();

            >Method in class
              Syntax:>
                    accessspecifier return type method_name(Argunments)
                    {
                    ------
                    ......
                    }
                    Example : public void sum(int a,int b){
                        a+b;                    
                    } 
 */
//========first object program=======
/* 
import java.util.*;
public class oop {
    String name;
    int roll;
      

}
    class Main{
    public static void main(String args[]){
     
        oop obj=new oop();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name=");
        obj.name=sc.nextLine();
        System.out.println("Enter roll no=");
        obj.roll=sc.nextInt();
        System.out.println("my name is "+obj.name);
        System.out.println("Roll no="+obj.roll);
    }
}*/

//========object program with method===========
/*import java.util.*;
public class oop {
    String name;
    int roll;
    void diplay(){
        System.out.println("my name is "+name);
        System.out.println("Roll no="+roll);
    }

}
    class Main{
    public static void main(String args[]){
     
        oop obj=new oop();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name=");
        obj.name=sc.nextLine();
        System.out.println("Enter roll no=");
        obj.roll=sc.nextInt();
        obj.diplay();
        
    }
}*/

 //=====program with object and method with arrgunment=======
/*import java.util.*;
public class oop {
    String name;
    int roll;

    void diplay(String name, int roll){
        String name1=name;
        int roll1=roll;
        System.out.println("my name is "+name1);
        System.out.println("Roll no="+roll1);
    }

}
    class Main{
    public static void main(String args[]){
     
        oop obj=new oop();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name=");
        obj.name=sc.nextLine();
        System.out.println("Enter roll no=");
        obj.roll=sc.nextInt();
        obj.diplay(obj.name,obj.roll);
        
    }
}*/

/*
   Constructor: conastructor is a special type of method which is used to instansilate 
   class member. constructor call implicity i.e 
   constructor invoke automaticaly at the time of object creation of a class.
   cunstructor name should be same name of class name.

   > There are two type of constructor
        1: Default constructor.
        2.parameter Constructor.
 */


    

