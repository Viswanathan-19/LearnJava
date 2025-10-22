package Throw;

public class Main {
    public static void main(String[] args) {
        int num1=2;
        int num2=20;
       
       

        try{
            num1=num2/num1; 
    
            if(num1 == 10)    //Here num1 is not zero ,but we r calling the catch block with the help of if statement.                             
             throw new ArithmeticException("This message is passed here to catch block");            //It throws the exception to catch block,if anything goes wrong.Even if the catch block doesn't get executed,we can call the catch block using throw keyword 
                                                                        //can pass message to the constructor,to be displayed in catch block e .
            
        }
        catch(ArithmeticException e){      
            num1=20/1;
            System.out.println("default value for num1 "+num1);                   
            System.out.println(e);
        }
       
        catch(Exception e){
            System.out.println("Something went wrong "+e);
        }
        System.out.println(num1);

        System.out.println("Execution doesn't stop..");
    }
}

