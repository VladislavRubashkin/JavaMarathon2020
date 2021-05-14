package day9.Task2_2;

public class Triangle extends Figure{
    private double A;
    private double B;
    private double C;

    public Triangle(String color, double A, double B, double C){
        super(color);
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public double area() {
        double p = (A + B + C)/2.0;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }

    @Override
    public double perimeter() {
        return A + B + C;
    }
}
