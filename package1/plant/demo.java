package plant;


public class demo {
    public int len,br;
    public demo(int a, int b){
        len=a;
        br=b;
    }
    public void area()
    {
        System.out.println("length of reactangle="+len);
        System.out.println("breadth of reactangle="+br);
        System.out.println("area of reactangle="+(len*br));
    }
    public void perameter(){
        System.out.println("parameter of reactangle="+(2*(len+br)));
    }
}
