package Keywords;

public class FinallyConcept {
    public void test1(){
        try{
            System.out.println("Inside test 1 method");
            throw new RuntimeException("test");
        }catch(Exception e){
            System.out.println("Inside catch block");
        }
        finally{
            System.out.println("Inside finally block");
        }
    }

    public void test2(){
        try{
            System.out.println("inside test 2");
        }
        finally{
            System.out.println("finally code in test 2 method");
        }
    }

    public static void main(String[] args) {
        FinallyConcept obj = new FinallyConcept();
        obj.test1();
        obj.test2();
    }


}
