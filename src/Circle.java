public class Circle extends Geometric_shapes {
    int radius;

    public static void main(String[] args) {
        Circle obj1 = new Circle("круг", 5);
        obj1.print();
        obj1.information();
        obj1.change(6);
        obj1.print();

    }

    public Circle(String type, int radius) {
        super(type);
        this.radius = radius;
    }

    public String toString() {
        return "Это " + getType() + ". " + "Его радиус: " + radius + ".";
    }

    public void change(int x) {
        this.radius = x;
    }

    public void information() {
        double length = 2 * radius * Math.PI;
        double square = Math.PI * radius * radius;
        System.out.println("Длина окружности = " + length + "." + "\n" + "Площадь круга = " + square + ".");
    }
}
