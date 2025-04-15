/*
   Throws:- The throws keyword in Java is used in a method declaration to specify the
    exceptions  that a method might throw during its execution. It helps inform the caller
     of the method about the potential exceptions, so they can handle them appropriately.

Key Points:
Purpose: To declare exceptions that a method can throw.

Syntax:
        returnType methodName(parameters) throws ExceptionType1, ExceptionType2 {
            // method body
        }

 */

package exception;

public class throws1 {
    public static int division(int x, int y)throws ArithmeticException {
        return x/y;
        
    }
    public static void main(String[] args) {
        int res;
        try{
            res=division(10,0);
            System.out.println("Result is ="+res);
        }catch(ArithmeticException e){
            System.out.println("Exception "+e);
        }
    }
}
