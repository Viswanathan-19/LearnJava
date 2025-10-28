package RaceCondition;

class Counter{
    int count;
    public synchronized void increment(){    //synchronization
            count++;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        
        
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
               c.increment();
            }
        });
       
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();    //completes and joins to the main thread
        t2.join();     //completes and joins to the main thread ,t1,t2->main thread
        System.out.println(c.count);
    }
}
