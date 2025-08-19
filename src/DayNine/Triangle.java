package DayNine;

public class Triangle extends Figure{
    double side1;
    double side2;
    double side3;
    Triangle(double side1, double side2, double side3, String color){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3));
    }

    @Override
    public double perimeter() {
        return side1+side2+side3;
    }
}
