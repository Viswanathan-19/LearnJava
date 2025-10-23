package InheritanceExample;


class Sport{
    protected  String playername;
    public String sports;

    public void changeplay(String sports){
        this.sports=sports;
    }
}

class Players extends Sport{
    
    public void setPlayerName(String name,String sport ){
        playername =name;                           //can use this variables without declaring,bcoz all these are inherited from super class except private
        sports=sport;
    }

    public void display(){
        System.out.println(playername+" plays "+sports);
    }
}

public class Main {
    public static void main(String[] args) {
        Players p1=new Players();
        Players p2=new Players();
        Players p3=new Players();
        p1.setPlayerName("viswa","football");
        p2.setPlayerName("vishal","carrom");
        p3.setPlayerName("kishore","cricket");
        p3.changeplay("football");    //can call the parent method using subclass reference
        p1.display(); 
        p2.display(); 
        p3.display(); 
    }
}
