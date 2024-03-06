import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of Circle in cm:");
        double radius = scan.nextDouble();

        Circle circle = new Circle();
        circle.setRadius(radius);

        System.out.println("Area of Circle is:" + circle.area());
        System.out.println("Perimeter of Circle is:" + circle.perimeter());

        System.out.println("Enter the radius of the sphere in cm:");
        double sphereRadius = scan.nextDouble();

        Sphere sphere = new Sphere();
        sphere.setRadius(sphereRadius);

        System.out.println("Surface Area of Sphere is: " + sphere.SurfaceArea());
        System.out.println("Volume of Sphere is: " + sphere.volume());

        System.out.println("Enter the radius of the cylinder in cm:");
        double cylinderRadius = scan.nextDouble();
        System.out.println("Enter the height of the cylinder in cm:");
        double cylinderHeight = scan.nextDouble();

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(cylinderRadius);
        cylinder.setHeight(cylinderHeight);

        System.out.println("Surface Area of Cylinder is: " + cylinder.SurfaceArea());
        System.out.println("Volume of Cylinder is: " + cylinder.volume());

        System.out.println("Enter the Base length of the pyramid in cm:");
        double pyramidBase= scan.nextDouble();;
        System.out.println("Enter the height of the pyramid in cm:");
        double pyramidHeight = scan.nextDouble();
        System.out.println("Enter the Slant Height of the pyramid in cm:");
        double pyramidSlant = scan.nextDouble();

        Pyramid pyramid = new Pyramid();
        pyramid.setBase(pyramidBase);
        pyramid.setHeight(pyramidHeight);
        pyramid.setSlant(pyramidSlant);

        System.out.println("Surface Area of Cylinder is: " + pyramid.SurfaceArea());
        System.out.println("Volume of Cylinder is: " + pyramid.volume());

    }
}
