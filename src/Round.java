
public class Round extends Shape {

    private double r1;
    private double r2;

    public Round(double r1, double r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public double calcPerimeter() {

        double perimeter = 4 * (((Math.PI * r1 *r2 + (r1 -r2)) / (r1 + r2)));
        return perimeter;
    }

    @Override
    public double calcSquare() {

        double square = Math.PI * r1 *r2;

        return square;
    }

}
