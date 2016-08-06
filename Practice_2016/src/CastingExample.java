
class Parent{
    int x=10;
    void show(){
        System.out.println("parent-show");
    }
    
    void OnlyParentShow(){
        System.out.println("OnlyParentShow");
    }
}
 
class Child extends Parent{
    int x=20;
    void show(){
        System.out.println("child-show");
    }
    void OnlyChildShow(){
        System.out.println("OnlyChildShow");
    }
}
 
public class CastingExample {
 
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        p.OnlyParentShow();
        System.out.println(p.x);
    }
}