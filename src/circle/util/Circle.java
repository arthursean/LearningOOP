package circle.util;

public class Circle {
    public static final double PI = 3.14159;
    public static double circumference(double radius){
        return PI * 2 * radius;
    }
    public static double volume(double radius){
        return PI * Math.pow(radius, 3) * 4 / 3;
    }

}
