package Throws;

class A{
    public void show() throws ClassNotFoundException{      //throws the exception to the method which it calls,i.e main method in this case
        Class.forName("calc");
    }
}

public class Main {
    public static void main(String[] args)   {
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
                                             //Handles the exception from show() method
            System.out.println(e);
        }
    }
}
