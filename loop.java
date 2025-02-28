/*
 * while loop
 *  >Syntax
 *      initialization
 *          while(condition)
 *              {
 *                  inc/dec
 *              }
 *          
 * do-while loop
 *   >SYNTEX
 *  >do{
 *      // STATATMENT
 *      }WHILE(CONDITION);
 * for loop
 *      > Syntax
 *          for(initialization;condition;incr/dec)
 *              {
 *                  //Statement
 *              }
 */
import java.util.*;
/*public class loop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n ,t;
        System.out.print("Enter any number to print any number=");
        n=obj.nextInt();
        int i=1;
        while (i<=10) {
           t=n*i; 
           System.out.println(n+"*"+i+"="+t);
           i++;
        }
    }
   }*/
//-------Cheak num is prime or not---------
public class loop {
   public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int n,t=0,i;
       System.out.print("Enter any number to print any number=");
       n=obj.nextInt();
       
      for(i=1;i<=n;i++){
      if(n%i==0){
         t++;
      }
      }
      if(t<=2){
         System.out.println("number is prime ");
      }
      else{
         System.out.println("number is not prime");
      }
   }
}

//----Factorial------
// import java.util.*;
// public  class loop {
//  public static void main(String[] args) {
//     int n, f=1;
//     Scanner obj=new Scanner(System.in);
//     System.out.print("Enter any number to find factirial=");
//     n=obj.nextInt();
//     for(int i=n;i>=1;i--)
//     {
//         f=f*i;
//     }
//     System.out.println("factorial="+f);

//  }
    
// }
//-------Sum of digit-------
/*import java.util.*;
 public  class loop {
  public static void main(String[] args) {
     int n, sum=0,temp;
     Scanner obj=new Scanner(System.in);
    System.out.print("Enter any number to find sum of digit=");
     n=obj.nextInt();
     while(n>0){
        temp=n%10;
        sum=sum+temp;
        n=n/10;
     }
     System.out.println("sum of digit="+sum);
  }
}
  */


  //-------Product of digit------
/*import java.util.*;
 public  class loop {
  public static void main(String[] args) {
     int n, sum=1,temp;
     Scanner obj=new Scanner(System.in);
    System.out.print("Enter any number to find product of digit=");
     n=obj.nextInt();
     while(n>0){
        temp=n%10;
        sum=sum*temp;
        n=n/10;
     }
     System.out.println("product of digit="+sum);
  }
}
  */


  //-------Polindrom number-------
/*import java.util.*;
 public  class loop {
  public static void main(String[] args) {
     int n, sum=0,temp,t;
     Scanner obj=new Scanner(System.in);
    System.out.print("Enter any number to check polindrom of digit=");
     n=obj.nextInt();
     t=n;
     while(n>0){
        temp=n%10;
        sum=temp+sum*10;
        n=n/10;
     }
     if(sum==t)
     {
        System.out.println(t+" is polindrom");
     }
     else{
        System.out.println(t+" is not polindrom");
     }
  }
}*/

 //-------Armstrong number-------
 /*import java.util.*;
 public  class loop {
  public static void main(String[] args) {
     int n, sum=0,temp,t;
     Scanner obj=new Scanner(System.in);
    System.out.print("Enter any number to check Armstrong of digit=");
     n=obj.nextInt();
     t=n;
     while(n>0){
        temp=n%10;
        sum=(temp*temp*temp)+sum;
        n=n/10;
     }
     if(sum==t)
     {
        System.out.println(t+" is Armstrong");
     }
     else{
        System.out.println(t+" is not Armstrong");
     }
  }
}*/



  