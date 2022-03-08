package ExceptionHandling;

public class Exceptions {
    public static void main(String[] args) {


        //uncaught exception
        try {
            int i = 9 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
          System.out.println(e.getMessage());
        }


        System.out.println("Exception handled");

    }

        //caught exception
       // Thread.sleep(2000);





    }

