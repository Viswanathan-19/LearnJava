package Synchronization;
class Printer {
    void printDocs(String doc) {
        // synchronized(this) {  //same object type with same reference accessing the method,one thread allowed.
                                //But for Different reference of same object type ,multiple threads can access the block,each thread has its own lock.
        //     for (int i = 1; i <= 3; i++) {
        //         System.out.println(Thread.currentThread().getName() + " printing " + doc + " page " + i);
        //     }
        // }
        synchronized(Printer.class) {  //only one instance allowed per class at a time(One thread at a time).
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " printing " + doc + " page " + i);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new Printer();

        Thread t1 = new Thread(() -> p1.printDocs("Resume"), "T1");   //same object type with diff reference
        // Thread t3 = new Thread(() -> p1.printDocs("Resume"), "T1");   //same object type with same reference,only one thread is allowed either t1 or t3
        Thread t2 = new Thread(() -> p2.printDocs("Report"), "T2");   //same object type with diff reference
        // t3.setName("T3");
        t1.start();
        t2.start();
        // t3.start();
    }
}
