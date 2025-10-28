package MultiThreading;



class A extends Thread{
  
    private String name;
     public A(String name){
        this.name=name;
     }

     public void run(){             //used to run the thread
        
        System.out.println(name+" is currently playing.."+Thread.currentThread().getName());
         try {
         Thread.sleep(100);
      } catch (InterruptedException e) {
        
         e.printStackTrace();
      }
     }
}
class B extends Thread{
  
    
    private String sport;
     public B(String sport){
        this.sport=sport;
     }

     public void run(){
        System.out.println(sport+" is played."+Thread.currentThread().getName());
        try {
         Thread.sleep(100);      //makes the thread to wait for 100millis
      } catch (InterruptedException e) {
        
         e.printStackTrace();
      }
     }
}

public class Main {
    public static void main(String[] args) {
        A obj1=new A("Viswa");
        B obj2=new B("Football");
        B obj3=new B("Cricket");
        A obj4=new A("Ram");
        obj1.start();           //used to start a new thread
        obj2.start();
        obj3.start();
        obj4.start();
   
        obj1.setPriority(Thread.MAX_PRIORITY);           // can set the priority
        System.out.println(obj1.getPriority());
    }
}