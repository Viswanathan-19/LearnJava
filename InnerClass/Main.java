
/*
static class A; invalid!

When you mark something static in Java, it means:
It belongs to the class itself, not to any particular object.

So the compiler says ❌ “You can’t make a top-level class static.”

There’s nothing above it to “belong to”.
*/
class A{
     
    public void show(){
        System.out.println("Shown..");
    }

      class B{
        public void config(){
            System.out.println("Config..");
        }

        static class C{
            public void deliver(){
                System.out.println("delivered..");
            }
        }
    }
}

public class Main {
   public static void main(String[] args) {
      A obj=new A();   //It works fine
      obj.show();     
    //   A obj1=new B();    this is not correct,because B is a part Of A
    A.B obj1=obj.new B();   //This is correct,A.B(A belongs to B),obj.new B()->bcoz u need object of outer class to access inner class;
       obj1.config();
    // A.B obj1=new A.B();   //If the inner class is static ,u dont need object of outer class
    //because  static methods,classes dont need objects to access inside them.
    //Note:[You cant make outer class static!,You can’t make a top-level class static]

    A.B.C obj2=new A.B.C();      //when C Class is static,this is the definition
    obj2.deliver();

   }    
}
