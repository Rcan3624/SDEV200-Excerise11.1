class Triangle extends GeometricObject {

    // Attributes.
    double side1;
    double side2;
    double side3;


    // No-arg constructor.
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;


    }

    public double getSide1() {
        return this.side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public double getSide3() {
        return this.side3;
    }

    public double getArea() {
        double s = (this.getSide1() + this.getSide2() + this.getSide3())/2;
        double area = Math.sqrt(s + (s-this.getSide1()) +(s-this.getSide2()) + (s-this.getSide3()));

        return s + area;
    }
    public double getPerimeter() {
        return this.getSide1() + this.getSide2() + this.getSide3();
    }
    public String toString() {
        return "Triangle: side1 = " + this.getSide1() + " side2 = " + this.getSide2() +
                " side3 = " + getSide3();

    }

}