
public class Foursquare extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;

    public Foursquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    @Override
    public double calcPerimeter() {

        double ab = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        double bc = Math.sqrt(((x2-x3)*(x2-x3)) + ((y2-y3)*(y2-y3)));
        double cd = Math.sqrt(((x3-x4)*(x3-x4)) + ((y3-y4)*(y3-y4)));
        double da = Math.sqrt(((x4-x1)*(x4-x1)) + ((y4-y1)*(y4-y1)));
        double perimeter = ab + bc + cd + da ;

        return perimeter;
    }

    @Override
    public double calcSquare() {

        double ab = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        double bc = Math.sqrt(((x2-x3)*(x2-x3)) + ((y2-y3)*(y2-y3)));
        double s = ab * bc;
        double square = Math.abs(s);
        return square;
    }


}
