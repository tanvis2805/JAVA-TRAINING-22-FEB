package SuperKeyword;

public class B extends A{

    public B(){
        super(10);
        System.out.println("child class const");
    }

    public static void main(String[] args) {

        B obj = new B();

    }

}
