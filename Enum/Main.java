
enum Status{             //enum is a named constants instead of using strings,numbers
        Running,Failed,Pending,Success;
}

public class Main {
    public static void main(String[] args) {
        Status s=Status.Success;
        System.out.println(s);              //It outputs success
        Status []a=Status.values();      //It returns all the values of enum as an array
        // System.out.println(s.ordinal());   prints the index number of enum i.e 3 

        for(Status st:a){
            System.out.println(st);
        }
    }
}
