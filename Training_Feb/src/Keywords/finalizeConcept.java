package Keywords;

public class finalizeConcept {

    protected void finalize() {
        System.out.println("Finalize method");
    }

    public static void main(String[] args) {

        FinallyConcept f1 = new FinallyConcept();
        FinallyConcept f2 = new FinallyConcept();

        f1 = null;
        f2 = null;

        System.gc();
    }
}
