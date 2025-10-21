
class A{
    public void show(){
        System.out.println("In A show");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show(){                      //Anonymous Inner Class,i.e inside  Main class . It has only implementation without class name ,
                                                    //It has Main$1.class File,number indicates the class,for multiple classes number goes from 1 to n.It is used when use this class only once
                                                    //It reduces instead of creating another class and inherit the method to access them.
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}
