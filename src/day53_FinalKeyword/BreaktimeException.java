package day53_FinalKeyword;

public class BreaktimeException extends RuntimeException{ // custom unchecked exception

    public BreaktimeException(){
        super("It's time for a break");
        System.err.println("Time to take 15 minutes break");
    }

    public BreaktimeException(String str){
        super(str);
        System.err.println("Time to take 15 minutes break");
    }


}

class Test{

    public static void main(String[] args) {

        //throw new RuntimeException("This is Runtime exception");
        //   throw new BreaktimeException("You need to give us a break");

        //   System.out.println("Test Completed");

        //   throw new Test();


        throw new BreaktimeException("It's been 45 minutes");

    }


}
