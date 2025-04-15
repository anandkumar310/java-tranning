package abstractionp;

class student{
    int m1,m2;
    void getmarks(int x, int y){
        m1=x;
        m2=y;

    }
    void putmarks(){
        System.out.println("student first sub marks is="+m1);
        System.out.println("student second sub marks is="+m2);
    }
}

 interface sports {
    final int sp=92;
    abstract void spmarks();
    
}

class detail extends student implements sports{
    public void spmarks(){
        System.out.println("Sports marks ="+sp);
    }
    void result(){
        int total=m1+m2+sp;
        putmarks();
        spmarks();
        System.out.println("student total marks="+total);
    }
}
public class interface2 {
    public static void main(String[] args) {
        detail obj=new detail();
        obj.getmarks(85, 95);
        obj.result();
    }
}
