public class CircleAreaPerimeter {
    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = calculatePerimeter(radius);
        double area = calculateArea(radius);
        
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
    
    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
