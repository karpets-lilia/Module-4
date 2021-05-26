package triangle;
/*Описать класс представляющий треугольник. Предусмотреть методы для создания обьектов, вычисления площади ,
* периметра и точки пересечения медиан. */
public class Triangle {
    private Side A;
    private Side B;
    private Side C;

    private Triangle(Side a, Side b, Side c) {
        A = a;
        B = b;
        C = c;
    }

    static Triangle createTriangle(Point a, Point b, Point c) {
        Side A = new Side(a, b);
        Side B = new Side(b, c);
        Side C = new Side(a, c);
        return new Triangle(A, B, C);
    }

    double calculatePerimeter(){
        return A.calculateSide() + B.calculateSide() + C.calculateSide();
    }

    double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - A.calculateSide()) * (p - B.calculateSide()) * (p - C.calculateSide()));
    }

    Point pointMedianIntersection() {
        double x = (A.getA().getX() + A.getB().getX() + B.getB().getX()) / 3;
        double y = (A.getA().getY() + A.getB().getY() + B.getB().getY()) / 3;
        return new Point(x, y);
    }
}
