abstract class Shape {
    abstract double getarea();
}
class Circle extends Shape {
    int radius;
    Circle (int radius) {
        this.radius=radius;
    }
    @Override
    double getarea() {
        System.out.print("area of circle is: ");
        return 3.14*radius*radius;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;
    Rectangle (int length,int breadth) {
        this.length=length;
        this.breadth=breadth;

    }
    @Override
    double getarea() {
        System.out.print("area of rectangle is: ");
        return length*breadth;
    }
}
class Square extends Shape {
    int side;
    Square(int side) {
        this.side=side;
    }
    @Override
    double getarea() {
        System.out.print("area of square is: ");
        return side*side;
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Circle c=new Circle(3);
        Rectangle r=new Rectangle(4,5);
        Square s=new Square(7);
        System.out.println(c.getarea());
        System.out.println(r.getarea());
        System.out.println(s.getarea());
    }   
}


