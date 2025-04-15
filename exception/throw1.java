/*
  Throw=The throw keyword in Java is used to explicitly throw an exception during the execution 
  of a program. It allows you to create custom error messages or handle specific 
  exceptions. Here's a quick overview:

Purpose: To throw an exception manually.
Syntax: throw new ExceptionType("Error message");
Usage: Typically used within a method to signal an error condition.
 */
package exception;

public class throw1 {
    public static void eligible(int age) {
        if(age<18){
            throw new ArithmeticException("not eligible for vote");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args) {
        eligible(18);
    }
}
