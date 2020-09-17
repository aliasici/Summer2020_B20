package day55_Abstraction.ShapesTask;

public final class Square extends Shape {

    public double side;

    public Square(double side){
        if(side <= 0){
            throw new RuntimeException("side of square can not be negative or zero");
        }
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        name = "Square";
        hasVolume = false;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
