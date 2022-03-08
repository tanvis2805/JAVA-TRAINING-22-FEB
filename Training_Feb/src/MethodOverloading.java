public class MethodOverloading {

    public void sum(){ //0 i/p para
        System.out.println("sum method--zero para");
    }

    public void sum(int i){ //1 i/p para
        System.out.println("sum method--one para");
        System.out.println(i);
    }

    public void sum(double i ){ //1 i/p para
        System.out.println("sum method--one  para, diff data type");
        System.out.println(i);
    }

    public void sum(int k, int l){ //2 i/p para
        System.out.println("sum method--2  para");
        System.out.println(k+l);
    }

    public void main(int a, int b, int c){
        System.out.println("Overloaded main method");
        System.out.println(a+b+c);
        System.out.print(10);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(55.8);
        obj.sum(5,10);
        obj.main(5,6,7);
    }

    //WRAPPER CLASS
    //CASTING
    //AUTOBOXING AND UNBOXING

}
