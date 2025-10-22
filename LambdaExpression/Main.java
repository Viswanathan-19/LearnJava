
@FunctionalInterface              
interface A{
   void show();
}
public class Main {
    public static void main(String[] args) {
        A obj=()->{                  //Lambda expression,the compiler knows behind the scenes
            System.out.println("Yes it works");
            
        };
        obj.show();
    }
}
