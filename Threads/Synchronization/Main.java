package Synchronization;
class Printer {
    void printDocs(String doc) {
        synchronized(this) {  //same object type with same reference accessing the method,one thread allowed.
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
