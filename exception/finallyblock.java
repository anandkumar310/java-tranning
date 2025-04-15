/*
Syntax:-
  try{
  
  }
  catch(Exception e){
  
  }
  finally{
  
  }
 */
package exception;
import java.lang.*;
public class finallyblock {
    public static void main(String[] args) {
    int a[]=new int[5];
    try{
        a[6]=50;
        System.out.println("Value is="+a[6]);

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception="+e);
    }finally{
        System.out.println("final block executed");
    }
}
}