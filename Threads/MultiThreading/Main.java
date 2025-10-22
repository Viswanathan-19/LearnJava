package MultiThreading;



class A extends Thread{
  
    private String name;
     public A(String name){
        this.name=name;
     }

     public void run(){             //used to run the thread
        
        System.out.println(name+" is currently playing.."+Thread.currentThread().getName());

     }
}
class B extends Thread{
  
    private String sport;
     public B(String sport){
        this.sport=sport;
     }

     public void run(){
        System.out.println(sport+" is currently playing.."+Thread.currentThread().getName());
     }
}

public class Main {
    public static void main(String[] args) {
        A obj1=new A("Viswa");
        B obj2=new B("Football");
        B obj3=new B("Cricket");
        B obj4=new B("Ram");
        obj1.start();           //used to start a new thread
        obj2.start();
        obj3.start();
        obj4.start();
   
        
    }
}
