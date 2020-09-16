package Office_Hours.Practice_09_08_2020;




public class TestClass {

    public static void main(String[] args) {
        Credentials c1 = new Credentials();

      //  System.out.println(aoj1.userName); // no direct access to the private

        System.out.println("User Name Entered"+c1.getUserName());

       // obj1.userName = "Batch20";

        c1.setUserName("Batch20");

        System.out.println("New User Name Entered: "+ c1.getUserName());

        System.out.println("New User Name Entered Again : "+ c1.getUserName());

        System.out.println("===============");

        System.out.println("Pass Word Entered: "+c1.getPassword());

        // c1.passWord = "JavaTurtles";

        c1.setPassword("JavaTurtles");

        System.out.println("New Pass Word Entered: "+ c1.getPassword());
        System.out.println("New Pass Word Entered Again: "+c1.getPassword());





    }




}
