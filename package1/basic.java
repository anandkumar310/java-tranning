/*
 package=> package is a collection of classes, interfaceses & sub-package as.
    there are two type of package
        1> pre-defind package
        2> user-difine packeage
 */

//package package1;
import plant.demo;
import plant.leaf.calculater;
public class basic {
    public static void main(String[] args) {
        demo obj= new demo(4,5);
        obj.area();
        obj.perameter();
        calculater obj1= new calculater(3, 6);
        obj1.calc();
    }
}
