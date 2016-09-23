package pvl;

public class Hello {

    public static void main(String[] args) {

        RepoReader rr = new RepoReader();

        rr.parsRepository();

        FiguresCalculation fc = new FiguresCalculation();

        fc.showMaxPerimeter();
        fc.showMinPerimeter();
        fc.showMaxSquare();
        fc.showMinSquare();
    }
}