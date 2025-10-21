package Abstract_AnonymousInnerClass;


abstract class A{
    public abstract void show();
    public abstract void config();
}

public class Main {
    public static void main(String[] args) {
        A obj=new A()    //Can create objects even it is Abstract class,
                         //since it is anonymous inner class we create object for this not for abstract class.
        {                //like normal subclass,this class should inherit all the methods
            @Override
            public void show(){                     
                                                    
                System.out.println("In new Show");
            
            }
            @Override
            public void config() {
                System.out.println("Config");       
            }
        };
        obj.show();
        obj.config();
    }
}
