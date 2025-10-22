
@FunctionalInterface              
interface A{
   int show(int num1,int num2);
}
public class Main {
    public static void main(String[] args) {
        A obj=( n1, n2)->  {        //No need to declare data types,If one variable is used dont need parantheses.Lambda expression,the compiler knows behind the scenes 
            /*
             new A() {                         
            public void show(){} this is been understood by the compiler,no need to declare it explicitly.
             */
            System.out.println("Yes it works.. ");
            return n1+n2;
            
         };
        int result =obj.show(5,10);
        System.out.println(result);
    }

}




