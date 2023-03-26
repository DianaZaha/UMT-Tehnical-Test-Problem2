import java.util.*;

public class RectanglesCounter {

    private List<Point> points; // List of Point objects

    //contructor
    public RectanglesCounter() {
        this.points = new ArrayList<>();
    }

    //function to add only the unique points
    public void addPoint(Point P){
        if(!this.containsPoint(P))
            this.points.add(P);
    }

    //function to remove points
    public void removePoint(Point P){
        for(Point p : points)
            if (p.getX() == P.getX() && p.getY() == P.getY()) {
                this.points.remove(p);
                break;
            }
    }

    // function to manually verify if a point is contained in the list
    public boolean containsPoint(Point P){
        for(Point p : points)
            if (p.getX() == P.getX() && p.getY() == P.getY())
                return true;
        return false;
    }

    //function to count the number of rectangles
    public int countRectangles() {
        int count = 0; // number of rectangles

        // Consider each pair of points
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                Point p1 = points.get(i);
                Point p2 = points.get(j);

                // Check if p1 and p2 can form a diagonal of a rectangle
                if (p1.getX() != p2.getX() && p1.getY() != p2.getY()) {
                    // Check if the other two points also exist to form the rectangle
                    Point p3 = new Point(p1.getX(), p2.getY());
                    Point p4 = new Point(p2.getX(), p1.getY());

                    if (this.containsPoint(p3) && this.containsPoint(p4)) {
                        count++;
                    }
                }
            }
        }

        return count / 2; // each rectangle is counted twice for both diagonals
    }
}

