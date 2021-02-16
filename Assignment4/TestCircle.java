public class TestCircle{
    public static void main(String[] args) {
    Circle bigCircle = new Circle();
    bigCircle.setRadius(25);

    Circle mediumCircle = new Circle();
    mediumCircle.setRadius(5);

    Circle smallCircle = new Circle();
    
    System.out.println(bigCircle.radius);
    System.out.println(bigCircle.diameter);
    System.out.println(bigCircle.area);

    System.out.println(mediumCircle.radius);
    System.out.println(mediumCircle.diameter);
    System.out.println(mediumCircle.area);

    System.out.println(smallCircle.radius);
    System.out.println(smallCircle.diameter);
    System.out.println(smallCircle.area);

    
    }
}