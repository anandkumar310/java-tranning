/*  interface:- in act like a class. is used for to achive
    -> complete abstraction
    -> to perform multiple inheritance.
        =>Syntax
                interface interface-name{
                    final field declaration;
                    method (abstract,static final)
                
                }
*/

package abstractionp;
interface A {
final int NUM1=40;
//abstract 
void display();   
}

interface B{
    final int NUM2=20;
    //abstract
     void display1();
}
class C implements A,B{
    public void display(){
        System.out.println("Number is "+NUM1);
    }
    public void display1()
    {
        System.out.println("Number is "+NUM2);
    }
    void calc(){
        System.out.println("Addition="+(NUM1+NUM2));
        System.out.println("Sub="+(NUM1-NUM2));
        System.out.println("MUL="+(NUM1*NUM2));
        System.out.println("Div="+(NUM1/NUM2));
        
    }
}
public class interface1 {
    public static void main(String[] args) {
        C ob=new C();
        ob.display();
        ob.display1();
        ob.calc();
    }
    
}
