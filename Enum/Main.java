
enum Status{             //enum is a named constants instead of using strings,numbers
        Running,Failed,Pending,Success;
}

public class Main {
    public static void main(String[] args) {
        Status s=Status.Success;
        System.out.println(s);              //It outputs success
        Status []a=Status.values();      //It returns all the values of enum as an array
        // System.out.println(s.ordinal());   prints the index number of enum i.e  output=3 

        for(Status st:a){
            System.out.println(st+" : "+ st.ordinal());
        }

        switch(s){
            case Status.Running:               //This is also Correct
                 System.out.println("Running");
                 break;
            
            case Pending:                        //Can use directly,because switch recognises this is enum
                 System.out.println("Pending");
                 break;
            
            case Failed:
                 System.out.println("Failed");
                 break;
            
            case Success:
                 System.out.println("Success");
                 break;
            
        }
    }
}
