package pvl;

public class Triangle extends Shape {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    private double square;
    private double perimeter;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double calcPerimeter() {

        calculation();

        return perimeter;
    }

    @Override
    public double calcSquare() {

        calculation();

        return square;
    }

    private void calculation() {

        double ab = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        double bc = Math.sqrt(((x2-x3)*(x2-x3)) + ((y2-y3)*(y2-y3)));
        double ca = Math.sqrt(((x3-x1)*(x3-x1)) + ((y3-y1)*(y3-y1)));

        perimeter = ab + bc + ca;

        double p = perimeter / 2;
        square = Math.sqrt((p*(p-ab)*(p-bc)*(p-ca)));
    }
}
