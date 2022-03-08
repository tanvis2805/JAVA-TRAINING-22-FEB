package ExceptionHandling;

import jdk.swing.interop.SwingInterOpUtils;

public class ThrowsKeyword {

    public void div() throws ArithmeticException{
        int i =9/0;
    }

    public void sum() throws ArithmeticException{
       try{
           div();
       }catch(ArithmeticException e){
           System.out.println("Exception handled");
       }
    }

    public static void main(String[] args) throws ArithmeticException{
        ThrowsKeyword keyword = new ThrowsKeyword();
        keyword.sum();


    }
}
