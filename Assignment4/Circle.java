public class Circle {
    public double radius;
    public double diameter;
    public double area;

    public Circle() {
        radius = 1;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter = 2 * radius;
        area = (Math.PI * radius) * radius;
    }
    public double getRadius() {
        return radius;
    }
}
