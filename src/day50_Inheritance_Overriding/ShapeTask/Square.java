package day50_Inheritance_Overriding.ShapeTask;

public class Square extends Shape{
    public double side;

    public Square(double side){
        this.side = side;
    }

    public double calculateArea(){
        return side * side;
    }
    public double calculatePerimeter(){
        return 4 * side;
    }
}
