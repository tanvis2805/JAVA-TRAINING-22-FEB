public class StaticNonStatic {

    String name = "Venkata"; //non static global var
    static int age = 27; //static global var

    public void sendMail() {
        System.out.println("send mail method");
    }

    public static void sum() {
        System.out.println("sum method");
    }


    public static void main(String[] args) {
        //direct calling
        System.out.println(age);
        sum();

        //calling by classname
        StaticNonStatic.sum();
        System.out.println(StaticNonStatic.age);


        StaticNonStatic obj = new StaticNonStatic();
        obj.sendMail();
        System.out.println(obj.name);

    }
}
