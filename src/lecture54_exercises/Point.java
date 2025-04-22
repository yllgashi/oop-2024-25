package lecture54_exercises;


// Kordinatat: x dhe y
//         Te shkruhet metoda qe gjen distances ne mes dy pikave dhe te jete pjese perberese e objektit
// d=√((x2 – x1)² + (y2 – y1)²)

public class Point {
    // attributes
    private int x;
    private int y;

    // constructors
    public Point() {
    }

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    // getters and setters
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // methods
    public double findDistance(Point p2) {
        int x1 = this.getX();
        int y1 = this.getY();

        int x2 = p2.getX();
        int y2 = p2.getY();

        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        return distance;
    }
}
