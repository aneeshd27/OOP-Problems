package lab1;

import java.util.*; 

public class Assignment3 {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.getInput();
        Square s = new Square();
        s.getInput();
        Rectangle r = new Rectangle();
        r.getInput();
    }
}

class Shape {
    int setArea(int l, int b) {
        return l*b;
    }
    double setArea(double pi, int r) {
        return pi*r*r;
    }
    int setArea(int s) {
        return s*s;
    }
}

class Circle extends Shape {
    void getInput() {
        System.out.println("Enter radius of circle : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Area of Circle is : "+setArea(Math.PI, r));
    }
}

class Square extends Shape {
    void getInput() {
        System.out.println("Enter side of square : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Area of Square is : "+setArea(s));
    }
}

class Rectangle extends Shape {
    void getInput() {
        System.out.println("Enter length and breadth of rectangle : ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
	  int b = sc.nextInt();
        System.out.println("Area of Rectangle is : "+setArea(l,b));
}
}