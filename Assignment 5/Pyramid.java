public class Pyramid {

    private double base;
    private double height;

    private double slant;

    public void setBase(double base) {
        this.base = base;
    }

    public double getRadius() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setSlant(double slant) {
        this.slant = slant;
    }

    public double getSlant() {
        return slant;
    }

    public double SurfaceArea() {
        return 2 * base * slant + (base*base);
    }

    public double volume() {
        return (1/3)*Math.pow(base, 2)*height;
    }
}

