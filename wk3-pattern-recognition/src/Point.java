/*************************************************************************
 * Name:
 * Email:
 *
 * Compilation:  javac Point.java
 * Execution:
 * Dependencies: StdDraw.java
 *
 * Description: An immutable data type for points in the plane.
 *
 *************************************************************************/

import java.util.Comparator;

public class Point implements Comparable<Point> {

    // compare points by slope
    public final Comparator<Point> SLOPE_ORDER = new Comparator<Point>() {
		@Override
		public int compare(Point arg0, Point arg1) {
			return 0;
		}
	};

    private final int x;                              // x coordinate
    private final int y;                              // y coordinate

    // create the point (x, y)
    public Point(final int x, final int y) {
        /* DO NOT MODIFY */
        this.x = x;
        this.y = y;
    }

    // plot this point to standard drawing
    public void draw() {
        /* DO NOT MODIFY */
        StdDraw.point(x, y);
    }

    // draw line between this point and that point to standard drawing
    public void drawTo(final Point that) {
        /* DO NOT MODIFY */
        StdDraw.line(this.x, this.y, that.x, that.y);
    }

    // slope between this point and that point
    public double slopeTo(final Point that) {
//		(y1 − y0) / (x1 − x0)
    	final double result = (double) (that.y - this.y) / (that.x - this.x);
    	return result == Double.NaN ? Double.NEGATIVE_INFINITY : result;
    }

    // is this point lexicographically smaller than that one?
    // comparing y-coordinates and breaking ties by x-coordinates
    public int compareTo(final Point that) {
    	if (this.y == that.y && this.x == that.x) {
    		return 0; // same
    	} else if (this.y < that.y 
    			|| (this.y == that.y && this.x < that.x)) {
    		return -1;
    	} else {
    		return 1;
    	}
    }

    // return string representation of this point
    public String toString() {
        /* DO NOT MODIFY */
        return "(" + x + ", " + y + ")";
    }

    // unit test
    public static void main(final String[] args) {
        /* YOUR CODE HERE */
    }
}
