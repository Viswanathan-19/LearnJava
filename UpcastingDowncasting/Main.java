class A{
    public void show1(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B");
    }
}

public class Main{
    public static void main(String[] args) {
        A obj=(A) new B();     //Upcasting ,  B -> A    
        // obj.show2();     Here, obj is declared as type A.The compiler therefore only knows:"obj can access whatever is defined in class A."
        obj.show1(); //this is fine

        // B obj1 =obj;     Type differs,because obj is of type A
        B obj1= (B) obj;    //Downcasting ,Changing reference type from A->B


    }
}