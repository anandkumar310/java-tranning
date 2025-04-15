/*
  multiple catch block
    Syntax:-
    try{

    }catch( ){
    
    }catch(){
    
    }
 */

package exception;
import java.lang.*;
public class multiple {
    public static void main(String[] args) {
       int a[] = new int[5];
        try{
            a[6]=10;
            a[4]=10/0;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
