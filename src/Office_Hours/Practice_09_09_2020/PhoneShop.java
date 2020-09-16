package Office_Hours.Practice_09_09_2020;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 Pro", 1000);

        iphone.call(911);
        iphone.text(123456789);

        System.out.println(iphone);

        System.out.println("=========================");

        Samsung samsung = new Samsung("Galaxy S20",799);
        samsung.call(123);
        samsung.text(112233445);

        System.out.println(samsung);

        System.out.println("=========================");

        Nokia nokia = new Nokia("Genesis",599);
        nokia.call(123456789);
        nokia.text(113);

        System.out.println(nokia);
    }
}
