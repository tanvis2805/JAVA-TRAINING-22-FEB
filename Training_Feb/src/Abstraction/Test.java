package Abstraction;

public class Test {
    public static void main(String[] args) {

        //USBank US = new USBank();
        HSBC hs = new HSBC();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.carLoan();
        hs.educationLoan();
    }
}
