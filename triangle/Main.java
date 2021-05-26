package triangle;

import java.util.Locale;
import static triangle.Triangle.createTriangle;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(2,-2);
        Point b = new Point(4,9);
        Point c = new Point(5,3);
        System.out.printf(Locale.US,"\n" + "вершины треугольника : " +
                "a(%.1f,%.1f); b(%.1f,%.1f); c(%.1f,%.1f).%n",
                a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());

        Triangle triangle = createTriangle(a, b, c);

        double perimeter = triangle.calculatePerimeter();
        System.out.printf(Locale.US,"периметр треугольника: %f.%n", perimeter);

        double area = triangle.calculateArea();
        System.out.printf(Locale.US,"площадь треугольника: %f.%n", area);

        Point o = triangle.pointMedianIntersection();
        System.out.printf(Locale.US, "точки пересечения медиан: x(%f,%f).", o.getX(), o.getY());
    }
}
