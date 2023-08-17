public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;

        double perimeter = calculatePerimeter(width, height);
        double area = calculateArea(width, height);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

    public static double calculatePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }
}
