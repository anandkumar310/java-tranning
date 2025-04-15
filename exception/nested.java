/*
   Syntax:-
   try{
   
   }try{
   
   }catch( ){
   
   }
   try{
   
   }
   catch( ){
   
   }

 */
package exception;

public class nested {
    public static void main(String[] args) {
        int a[]= new int[5];
        int num;
        try{
            num=10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            a[6]=50;

        }catch(ArrayIndexOutOfBoundsException e){

        }
    }
}
