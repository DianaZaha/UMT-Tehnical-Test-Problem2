

//Given some points in cartesian coordinate, (X, Y) find the number of rectangles that can be created by those points.
//Take into consideration only the rectangles that are parallel with the X, Y axes.

//Sample input:
//(1,1), (1,3), (2,1), (2,3), (3,1), (3,3)
//Sample output: 3

//If we modify the sample and remove the (2,3) the output will be: 1
//Sample input 2:
//(1,1), (1,3), (2,1), (3,1), (3,3)
//Sample output 2: 1

public class Main {
    public static void main(String[] args) {

        // creating the counter
        RectanglesCounter rc = new RectanglesCounter();

        // adding the points
        rc.addPoint(new Point(1, 1));
        rc.addPoint(new Point(1, 3));
        rc.addPoint(new Point(2, 1));
        rc.addPoint(new Point(2, 3));
        rc.addPoint(new Point(3, 1));
        rc.addPoint(new Point(3, 3));

        System.out.println(rc.countRectangles()); // output: 3

        rc.removePoint(new Point(2, 3));

        System.out.println(rc.countRectangles()); // output: 1
    }
}