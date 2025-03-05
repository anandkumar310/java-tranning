/*
 * Array in java: Array is user-defined datatype which is used to store similar type of data items.
 *      type of Array
 *      >1-D array
 *      >2-D array
 *      >Multi-D array
 * 
 *  SYNTAX
 *  
 *      1. Data_name arrgunment[];
 *      2. Array_name[]= new data_type[Size];
 *      3. array_name[]={......}
 *          datatype array_name[]=new datatype[size];
 */
/*import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n,i;
        System.out.println("Enter size of array="); 
        n=obj.nextInt();
        int arr[]=new int[200];
        System.out.println("Enter value in array=");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Array=");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}*/

//--------Check how many number is odd or even--------
/*import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n,i;
        System.out.print("Enter size of array="); 
        n=obj.nextInt();
        int arr[]=new int[200];
        System.out.println("Enter value in array=");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Even number=");
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" "); 
            }
            
        }
        System.out.println("\n odd number=");
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" "); 
            }
            
        }
    }
}*/

//-------sum of odd number and sum of even number----AND----check how many number is even OR odd---------

/*import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n,i,even=0,odd=0,e=0,o=0;
        System.out.print("Enter size of array="); 
        n=obj.nextInt();
        int arr[]=new int[200];
        System.out.println("Enter value in array=");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("Even number=");
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e++;
                System.out.print(arr[i]+" "); 
                even=even+arr[i];
            }
            
        }
        System.out.println("\n odd number=");
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                o++;
                odd=odd+arr[i];
                System.out.print(arr[i]+" "); 
            }
            
        }
        System.out.print("\nsum of Even number="+even+"\n number of even="+e);
        System.out.print("\nsum of odd number="+odd+"\n number of odd="+o);
    }
}*/


// ----2-D Array---
/*
    Syntax
    datatype array_name[][]=new data_type[][]
 */
import java.util.*;
public class Array {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int i,j;
        System.out.println("Enter element in matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("Element=");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("Pattern=");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    System.out.print(" "+arr[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Pattern=");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if((i+j)%2==0){
                    System.out.print(" "+arr[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        System.out.println("Pattern=");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if((i+j)%2!=0){
                    System.out.print(" "+arr[i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
