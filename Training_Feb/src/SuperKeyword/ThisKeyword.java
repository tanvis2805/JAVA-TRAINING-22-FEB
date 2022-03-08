package SuperKeyword;

public class ThisKeyword {
    String name;
    int age;

    public ThisKeyword(String name, int age) {

     this.name = name;
        this.age=age;
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword("Bhanu",27);
        ThisKeyword obj1 = new ThisKeyword("Kapil",27);
    }
}
