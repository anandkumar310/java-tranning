import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) 
    {
        int m1,m2,m3,m4,m5;
        double per;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter 5 subject marks=");
        m1=obj.nextInt();
        m2=obj.nextInt();
        m3=obj.nextInt();
        m4=obj.nextInt();
        m5=obj.nextInt();
        per=((m1+m2+m3+m4+m5)*100)/500;
        System.out.println("persentage="+per);
        if(per>=75)
        {
            System.out.println("honors");
        }
        else if(per>=60){
            System.out.println("first");
        }
        else if(per>=50)
        {
            System.out.println("Second");
        }
        else if(per>=40)
        {
            System.out.println("third");
        }
        else{
            System.out.println("Failed");
        }

    }
}
