package pvl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

import static pvl.RepoReader.figList;

public class FiguresCalculation {

    List<Double> perimeterList = new ArrayList<>();
    List<Double> squareList = new ArrayList<>();

    private void iterateList() {

        Iterator itr = figList.iterator();

        while (itr.hasNext()) {

            Shape element = (Shape) itr.next();

            perimeterList.add(element.calcPerimeter());
            squareList.add(element.calcSquare());
        }
    }

    public double showMaxPerimeter() {

        perimeterList.clear();

        iterateList();

        double d = Collections.max(perimeterList).doubleValue();

        System.out.println("perimeter list is: " + perimeterList);

        System.out.println("max perimeter is " + d);

        return d;
    }

    public double showMinPerimeter() {

        perimeterList.clear();

        iterateList();

        double d = Collections.min(perimeterList).doubleValue();

        System.out.println("min perimeter is " + d);

        return d;
    }

    public double showMaxSquare() {

        squareList.clear();

        iterateList();

        double d = Collections.max(squareList).doubleValue();

        System.out.println("square list is: " + squareList);

        System.out.println("max square is " + d);

        return d;
    }

    public double showMinSquare() {

        squareList.clear();

        iterateList();

        double d = Collections.min(squareList).doubleValue();

        System.out.println("min square is " + d);

        return d;
    }

}
