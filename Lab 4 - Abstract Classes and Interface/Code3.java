package lab4;
abstract class Shape {
    abstract void RectangleArea(float length, float breadth);
    abstract void SquareArea(float radius);
    abstract void CircleArea(float side);
}

class Area extends Shape {
    double Area = 0;
    void RectangleArea(float length, float breadth) {
        Area = length * breadth;
        System.out.println("Area of rectangle: " + Area);
    }

    void SquareArea(float Side) {
        Area = Side * Side;
        System.out.println("Area of Square: " + Area);
    }

    void CircleArea(float radius) {
        Area = (radius * radius) * 3.14;
        System.out.println("Area of Circle: " + Area);
    }
}

public class Lab4 {
    public static void main(String args[]) {
        Area a1 = new Area();
        a1.RectangleArea(10.4 f, 3.6 f);
        a1.SquareArea(12 f);
        a1.CircleArea(5);
    }
}