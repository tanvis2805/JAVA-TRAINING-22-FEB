package Abstraction;

public interface USBank {


    //abstraction: - hiding the details
    //partial-> abstract classes ( both abstract and non abstract methods)
    //100% - > interfaces ( only abstract methods)

    int minBalance =100;//by default static and final/const
    public void credit();
    public void debit();
    public void transferMoney();

}
