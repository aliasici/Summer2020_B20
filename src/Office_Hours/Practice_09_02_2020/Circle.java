package Office_Hours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI = 3.14;

    public double area;
    public double perimeter;

    static {
        PI = 3.14;
    }

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();


    }
    private double calculateArea(){  // FOR INRENIAL USING
        return  PI* radius * radius;
    }
    private double calculatePerimeter(){
        return   PI * diameter; //   2 * PI * radius;
    }
    public String toString(){
        return "Radius: "+radius + ", Diameter: "+diameter+",Area: "+area +", Perimeter: " +perimeter;
    }



}
