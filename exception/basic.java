/*
   Exception:-an exception is an event that disrupts the normal flow of a program's execution. Exceptions are typically used to handle errors or other unusual conditions in a controlled manner. Java provides a robust mechanism for handling exceptions, which is based on a hierarchy of exception classes.
    => There are three type 
        1. Checked exception
        2. unchecked exception
        3. Error
    location java.lang.throwable
     
    
    Checked Exceptions:
      These are exceptions checked at compile time.
      Example: IOException, SQLException.

      Unchecked Exceptions:
      These are exceptions that are not checked at compile time but rather at runtime.
      Example: ArithmeticException, NullPointerException.

      Errors:
        These are issues that indicate serious problems and are usually not recoverable.
        Example: OutOfMemoryError, StackOverflowError.

        Thing we use the exception
            1. try
            2. catch
            3. finally
            4. throw
            5. throws
    Machenism of exception handling
        1.hit the exception
        2.throw the exception
        3.catch the exception
        handel the exception

        try{
        
        }catch(exception e){
        
        }
 */
package exception;

public class basic {
    public static void main(String[] args) {
        int a=10,b=10,c,d;
        try{
        c=a/(a-b);
        System.out.println("value of c="+c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        d=a/(a+b);
        System.out.println("value of d="+d);
    }
}

/*
  multiple catch block
    Syntax:-
    try{

    }catch( ){
    
    }catch(){
    
    }
 */