package RUDRA;

class Area {

    void area(double r) {
        double result = 3.14 * r * r;
        System.out.println("Area of Circle = " + result);
    }

    void area(double l, double b) {
        double result = l * b;
        System.out.println("Area of Rectangle = " + result);
    }

    void area(float b, float h) {
        double result = 0.5 * b * h;
        System.out.println("Area of Triangle = " + result);
    }
}

public class MethodOverloadingArea {
    public static void main(String[] args) {

        Area a = new Area();

        a.area(5);        
        a.area(4, 6);     
        a.area(3f, 4f);   
    }
}