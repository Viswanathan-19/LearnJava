package GenericsTypesInClass;



    // class GenericsTypes<T>{       unbounded type
    // }

    class GenericsTypes<T extends Number>{                  //only subclasses Of Number are allowed
        private T num1;
        private  T num2;


        public GenericsTypes(T num1, T num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
            @SuppressWarnings("unchecked")                  //to tell the compiler that this UncheckedCast is safe
            public T add() {
            Double sum = num1.doubleValue() + num2.doubleValue();

            if (num1 instanceof Integer)
                return (T) Integer.valueOf(sum.intValue());
            else if (num1 instanceof Double)
                return (T) (sum);
            else if (num1 instanceof Float)
                return (T) Float.valueOf(sum.floatValue());
            else
                throw new IllegalArgumentException("Unsupported type");
        }

        
    }

    public class Main {
        public static void main(String[] args)  {
            GenericsTypes<Integer> g=new GenericsTypes<>(19, 8);
            GenericsTypes<Double> g1=new GenericsTypes<>(19.5991, 8.0);
            GenericsTypes<Float> g2=new GenericsTypes<>(5.96f,5.7f);  //if we didn't specify float,compiler treats its as double
            Integer ans=g.add();
            Number ans1=g1.add();   
            Number ans2=g2.add();
            System.out.println(ans);
            System.out.println(ans1);
            System.out.println(ans2);
        }
    }
