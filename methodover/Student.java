package methodover;

public class Student {
    String name;
    int id;
}

    class teacher extends Student{
        String name;
        int id;
        teacher(String n1, String n2, int r1,int r2){
            name=n1;
            id=r1;
            super.name=n2;
            super.id=r2;
        }
        void display(){
            System.out.println("Guide name ="+name);
            System.out.println("Guide id ="+id);
            System.out.println("Alloted Student name is="+super.name);
            System.out.println("Allocate Student id="+super.id);
        }
    }
   class Student1{
    public static void main(String[] args) {
        teacher obj=new teacher("Anand", "Abhay", 1, 6);
        obj.display();
    }
   }

 /*Super keyword in java:- super keyword is referance keyword which is used to refer parentce class member.
 >1. super can be refer parent class variable.
 >2. super can be refer parents class method .
 >3. super can be refer parents class constructor.
*/