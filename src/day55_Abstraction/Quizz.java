package day55_Abstraction;

import java.io.IOException;

public class Quizz {
//    public static void main(String[] args) throws RuntimeException, IOException {
//        method();
//        System.out.println("ali");
//
//    }
//    public static void method() throws IOException{
//        throw new IOException();
//    }

    static int a = 50;
public static void main(String[] args) {
    a =100;
    try{
        a = 200;
    }catch (Exception e){

    }finally {
        a =400;
    }
    System.out.println(a);

}
static {
    a =500;
}

}
