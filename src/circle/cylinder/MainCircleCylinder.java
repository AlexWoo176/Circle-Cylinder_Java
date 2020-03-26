package circle.cylinder;

public class MainCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(17.65, "Green");
        System.out.println(circle1);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(17.65, "Orange", 14.01);
        System.out.println(cylinder1);
    }
}
