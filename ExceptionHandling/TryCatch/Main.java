package TryCatch;

public class Main {
    public static void main(String[] args) {
        int num1=0;
        int num2=20;
        int result=0;

        // result=num2/num1;            Arithmetic exception

        try{
            result=num2/num1;           
        }
        catch(Exception e){                         //the exception is catched here,results in not stoping the program execution
            System.out.println("Something went wrong");
        }
        System.out.println(result);

        System.out.println("Execution doesn't stop..");
    }
}
