package DayNine;

public class Circle extends Figure{
    double radius;
    Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }
}
