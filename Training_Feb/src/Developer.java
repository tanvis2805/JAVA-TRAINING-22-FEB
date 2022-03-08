public class Developer {

    //global / class var
    int salary;
    int age;
    String position;

    //code
    //test
    //learn
    //deploy

    public void code(){//no i/p and no o/p
        System.out.println("Test method");
    }

    public int xyz(){//no i/p , some o/p
        System.out.println("xyz method");
        int a=10;
        int b=5;
        int c=a+b;
        return c;
    }

    public int division(int x, int y){
        System.out.println("division method");
        int d =x/y;
        return d;
    }


    public static void main(String[] args) {

        Developer Akash = new Developer();
        Developer Venkata = new Developer();
        Developer Kapil = new Developer();
        Developer Test = new Developer();

        Akash.salary=50000;
        Akash.age=25;
        Akash.position="Java Developer";

        Venkata.salary=50000;
        Venkata.age=25;
        Venkata.position="QA Engineer";


        Kapil.salary=50000;
        Kapil.age=25;
        Kapil.position="Software Developer";

       System.out.println( Test.division(10,5));





    }
}
