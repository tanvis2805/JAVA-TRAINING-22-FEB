package InheritanceConcepts;

public class Test {

    public static void main(String[] args) {

        //static polymorphism/compile time polymorphism
        BMW b = new BMW();
        b.start();// overridden method
        b.stop();
        b.refuel();
        b.theftSafety();

        System.out.println("--------------------------------");

        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
       // c.theftSafety(); //not possible

        System.out.println("--------------------------------");

       // top casting
        //dynamic poly/ run time poly
        Car c1 = new BMW(); // child class object can be referred by the parent class reference var
c1.start();//child class
c1.stop();
c1.refuel();
//c1.theftSafety();

        System.out.println("--------------------------------");
    b.engine();

    //down casting
      //  BMW b1 = new Car();


    }
}
