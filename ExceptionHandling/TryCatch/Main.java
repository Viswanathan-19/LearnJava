package TryCatch;

public class Main {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        int result=0;
        String s=null;

        int[] a=new int[5];
        // result=num2/num1;            Arithmetic exception

        try{
            result=num2/num1;            //If this is an exception,following statements in try block dont get executed, it directly jumps to catch block.
            System.out.println(a[1]);        
            System.out.println(s.length());
        }
        catch(ArithmeticException e){                         //the exception is catched here,results in not stoping the program execution
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
        }
        
        catch(Exception e){
            System.out.println("Something went wrong "+e);
        }
        System.out.println(result);

        System.out.println("Execution doesn't stop..");
    }
}
