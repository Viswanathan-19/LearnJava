public class Main {
    public static void main(String[] args) {
        int num=9;
        Integer num1=num;     //autoboxing,changing primitive type to  object type
        // Integer num2=new Integer(num1);    //boxing

        num=num1.intValue();     //unboxing  ,changing object type to primitive type
        num=num1;                //auto un-boxing;
        System.out.println(num);

        String s="12";
        int n=Integer.parseInt(s);  //Another example of wrapper classes,Integer is an Wrapperclass(object type)
        System.out.println(n*2);
    }
}
