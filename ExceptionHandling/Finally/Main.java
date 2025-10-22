package Finally;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // This throws ArithmeticException
        }
        finally {             //Even though there’s no catch, the finally block still runs before the program crashes.
            System.out.println("Finally always runs!");
        }

        System.out.println("After try-finally it doesn't executes");   //this wont get executed because of the arithmetic exception
    }
}

