package pvl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepoReader {

    private String repository = "";
    private String [] figure;
    private List<Integer> figCoordinatesNumbers = new ArrayList<Integer>();
    public static List<Shape> figList= new ArrayList<Shape>();

    public void parsRepository() {

        try (FileInputStream myFile = new FileInputStream("/home/pvl/Desktop/repo.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(myFile, "UTF8");
             BufferedReader reader = new BufferedReader(inputStreamReader);) {

            String sCurrentLine;

            while ((sCurrentLine = reader.readLine()) != null) {

                repository = repository + sCurrentLine;
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        String[] figures = repository.split(";");

        for (String i : figures) {
            parsFigure(i);
        }
    }

    public void parsFigure(String line) {

        figure = line.split(",");

        for (String i : figure) {
            int j = Integer.parseInt(i);
            figCoordinatesNumbers.add(j);
        }

        createFigure(figCoordinatesNumbers);

        figCoordinatesNumbers.clear();
    }


    private void createFigure(List<Integer> list) {

        if (list.size() == 8) {

            figList.add(new Foursquare(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7)));

        } else {
            if (list.size() == 6) {

                figList.add(new Triangle(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)));

            } else {
                if (list.size() == 2) {

                    figList.add(new Round(list.get(0), list.get(1)));

                } else {
                    System.out.println("Wrong coordinates in file");
                    System.exit(0);
                }
            }
        }
    }

}
