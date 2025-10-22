 package CustomException;

 class ViswaException extends Exception{
        public ViswaException(String s){
            super(s);               //passing the message given in the constructor to super class(Exception) constructor.
        }
}

public class Main {
    public static void main(String[] args) {
        int num1=2;
        int num2=20;
       
       

        try{
            num1=num2/num1; 
    
            if(num1 == 10)                      
             throw new ViswaException("Viswa made a own exception");  //CustomException  and passing the msg to the constructor in ViswaException Class
                                                                      
            
        }
        catch(ViswaException e){      
            num1=20/1;
            System.out.println("default value for num1 "+num1);                   
            System.out.println(e);
            // System.out.println(e.getMessage());
        }
       
        catch(Exception e){
            System.out.println("Something went wrong "+e);
        }
        System.out.println(num1);

        System.out.println("Execution doesn't stop..");
    }
}

