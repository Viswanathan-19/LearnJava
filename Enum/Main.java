
enum Status{             //enum is a named constants instead of using strings,numbers
        Running,Failed,Pending,Success;
}

enum Bikes{

   

    RoyalEnfield(350),KTMAdventure,Dominar(400),Himalayan(411);      //Every object has its own CC Capacity
     private static int times;
    private int cc;
    
    
    private Bikes() {      //can create objects without constructor and manually assign its value
        cc=390;
        System.out.println("Calling Default Constructor");
    }

    private Bikes(int cc) {
        this.cc = cc;
        System.out.println("Constructor is called ");  //the constructor is called for all enum objects
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }


    
}

public class Main {
    public static void main(String[] args) {
        Status s=Status.Success;
        System.out.println(s);              //It outputs success
        Status []a=Status.values();      //It returns all the values of enum as an array
        // System.out.println(s.ordinal());   prints the index number of enum i.e  output=3 

        // for(Status st:a){
        //     System.out.println(st+" : "+ st.ordinal());
        // }
        for(Status st:Status.values()){
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
            
            default:
                 System.out.println("Success");
                 break; 
        }

        // System.out.println(Bikes.Dominar+" "+Bikes.Dominar.cc);  //If the instance variables is public can directly access
        Bikes b=Bikes.Dominar;
        System.out.println(b+" "+b.getCc());     //if the instance field is private,then we need getters & setters to access it

        Bikes []c=Bikes.values();                         //another way of accessing non fields 
        System.out.println(c[1]+" "+c[1].getCc());
    }
}
