package methodover;

public class parent {
    parent(){
        System.out.println("Parents class construction");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("child class construction");
    }
}
class parent1{
    public static void main(String[] args) {
        child obj=new child();
    }
}
