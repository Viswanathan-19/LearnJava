package GenericsBasicExample;



class GenericExample <T>{
   
   
    public <T extends Number>  T  add(T num1,T num2){
    if(num1 instanceof Integer){ 
        Integer sum=(num1.intValue()+num2.intValue());
       return  (T) sum;     //need cast from Integer to Type T
        }
    if(num1 instanceof Double){ 
       Double sum=(num1.doubleValue()+num2.doubleValue());
       return (T) sum;    
    }
   else {
        throw new IllegalArgumentException("Unsupported numeric type: " + num1.getClass());
    }
}
  
}

public class Main {
    public static void main(String[] args) {
        // GenericExample s=new GenericExample();
        // int ans=(int)s.add(4,6);    //convert from Number to int
        GenericExample<Integer> s=new GenericExample<>();
        int ans=s.add(4,6);    //auto-unboxing
      
        GenericExample<Double> s1=new GenericExample<>();
        Double val=s1.add(4.5,4.6);
        System.out.println(ans);
        System.out.println(val);
    }
}
