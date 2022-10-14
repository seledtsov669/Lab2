public class Rectangle_Square extends Geometric_shapes {
    int a;
    int b;

    public static void main(String[] args) {
        Rectangle_Square obj1 = new Rectangle_Square("прямоугольник",1,2);
        obj1.print();
        obj1.information();
        obj1.change(5,10);
        obj1.print();
        obj1.information();
        Rectangle_Square obj2 = new Rectangle_Square("квадрат",11,5);
        obj2.print();
        obj2.information();
        obj2.change(5,5);
        obj2.print();
        obj2.information();


    }

    public Rectangle_Square(String type, int a, int b) {
        super(type);
        this.a = a;
        this.b = b;
    }

    public String toString() {
        String text = "";
        if (a == b) {
            text = "Это " + "квадрат" + ". " + "Моя сторона a = " + a + ".";
        } else {
            text = "Это " + "прямоугольник" + ". " + "Моя сторона a = " + a +
                    " , моя вторая сторона b = " + b + ".";
        }
        return text;
    }
    public void change(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public void information() {
        double perimeter = 2 * (a + b) ;
        double square = a * b;
        System.out.println("Мой периметр = " + perimeter + "." + "\n" + "Площадь = " + square + ".");
    }
}
