public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return Math.sqrt((x*x) + (y*y));
    }
    public double distance (Point point) {
        int w = point.getX() - x;
        int h = point.getY() - y;
        Point p = new Point(w,h);
        return p.distance();
    }
    public double distance (int x, int y) {
        return Math.sqrt((this.x -x) * (this.x - x) + (this.y - y) * (this.y-y));
    }

}
