public class ConstructorConcepts {


    //default constructor
    public ConstructorConcepts(){
        System.out.println("Default Constructor");
    }

    public ConstructorConcepts(int i){
        System.out.println("Single para cons");
        System.out.println("the value of i is : " + i);
    }
    public ConstructorConcepts(int i, int j){
        System.out.println("2 para cons");
        System.out.println("the value of i + j  is : " + (i+j));
    }

    public static void main(String[] args) {

        ConstructorConcepts c = new ConstructorConcepts();

        ConstructorConcepts c1 = new ConstructorConcepts(10);

        ConstructorConcepts c2 = new ConstructorConcepts(10,22);
    }
}
