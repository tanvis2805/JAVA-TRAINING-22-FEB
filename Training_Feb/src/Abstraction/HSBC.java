package Abstraction;

public class HSBC implements USBank,BrazilBank{

    public void credit(){
        System.out.println("HSBC--CREDIT");
    }
    public void debit(){
        System.out.println("HSBC--Debit");
    }

    public void transferMoney(){
        System.out.println("HSBC--Transfer Money");
    }

    public void educationLoan(){
        System.out.println("HSBC-- EDUCATION LOAN");
    }

    public void carLoan(){
        System.out.println("HSBC-- Car LOAN");
    }

    @Override
    public void mutualFunds() {
        System.out.println("HSBC--MUTUAL FUNDS");
    }
}
