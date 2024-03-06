
class Sphere implements Shape3D {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double SurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double perimeter() {
        // There's no perimeter for a sphere, so we can just return 0
        return 0;
    }
}