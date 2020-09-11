package day51_Exceptions.PetsTask;

import sun.net.www.protocol.http.HttpURLConnection;

public class House {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston","Scotty Terrier",'M',4, "Black");

        System.out.println(dog1.name);
        System.out.println(dog1);

        Cat cat1 = new Cat("marshmallow","small",'F',3,"ragdoll");

        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Brown");
        System.out.println(tiger1);
    }
}
