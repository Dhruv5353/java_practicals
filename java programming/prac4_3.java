public class prac4_3 {

    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[2];
        
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Square(4);
        
        for (Rectangle shape : shapes) {
            shape.printArea();
            shape.printPerimeter();
        }
        System.out.println(" This Practical is made by 23CS041 - DHRUV LOKADIYA ");
    }
}

class Rectangle {
    int l;
    int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void printArea() {
        int area = l*b;
        System.out.println("Area: " + area);
    }

    public void printPerimeter() {
        int perimeter = 2*(l+b);
        System.out.println("Perimeter: " + perimeter);
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}