
@FunctionalInterface              
interface A{
   void show(int num1,int num2);
}
public class Main {
    public static void main(String[] args) {
        A obj=(int n1,int n2)->{                  //Lambda expression,the compiler knows behind the scenes 
            /*
             new A() {                         
            public void show(){} this is been understood by the compiler,no need to declare it explicitly.
             */
            System.out.println("Yes it works.. "+(n1+n2));
            
        };
        obj.show(5,10);
    }

}




