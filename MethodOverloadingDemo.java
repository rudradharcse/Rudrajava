package RUDRA;

class OverloadDemo {

   
    void show(int a) {
        System.out.println("Value of a: " + a);
    }

  
    void show(int a, int b) {
        System.out.println("Value of a and b: " + a + " " + b);
    }

    
    void show(double a) {
        System.out.println("Value of double a: " + a);
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        OverloadDemo obj = new OverloadDemo();

        obj.show(10);
        obj.show(10, 20);
        obj.show(5.5);
    }
}
