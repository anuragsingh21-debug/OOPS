package inheritance;

public class Box {
    double l;
    double h;
    double b;

    Box() {
        this.l = -1;
        this.h = -1;
        this.b = -1;
    }

    Box(double side) {
        this.l = side;
        this.h = side;
        this.b = side;
    }

    Box(double l, double h, double b) {
        this.l = l;
        this.h = h;
        this.b = b;

        super();  // this class dont have parent class but it doesn't gave error becoz it's a object class
    }
}

class Main {
    public static void main(String[] args) {
        // Box b1 = new Box();
        // System.out.println(b1.l + " " + b1.h + " " + b1.b);

        // Box b2 = new Box(4);
        // System.out.println(b2.l + " " + b2.h + " " + b2.b);

        // Box b3 = new Box(2, 5, 6);
        // System.out.println(b3.l + " " + b3.h + " " + b3.b);

        // boxweight b4 = new boxweight(2.23, 34, 543.43, 43.3);
        // System.out.println(b4.b + " " + b4.h + " " + b4.l + " " + b4.weight);

        Box b5 = new boxweight(70, 50, 10, 12);
        System.out.println(b5.weight); // box class only contains l,h,b thats why when we try to access weight it gives error 

        boxweight b6 = new Box(70, 50, 10, 12); // child class can never make object of parent's constructor
        System.out.println(b6.weight);
    }
}
