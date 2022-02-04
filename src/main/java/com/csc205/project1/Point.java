package com.csc205.project1;

/**
 * Represents a location on the Cartesian
 * plane.
 */
public class Point {
    private double x;
    private double y;

    /**
     * Initializes a new instance of a Point.
     */
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Initializes a new instance of a Point.
     *
     * @param x the x location of the point
     * @param y the y location of the point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x location of the point.
     *
     * @return the x location of the point
     */
    public double getX() {
        return this.x;
    }

    /**
     * Gets the y location of the point.
     *
     * @return the y location of the point
     */
    public double getY() {
        return this.y;
    }

    /**
     * Sets the x location of the point.
     *
     * @param x the new x location of the point
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets the y location of the point.
     *
     * @param y the new y location of the point
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Sets the x and y locations of the point.
     *
     * @param x the new x location of the point
     * @param y the new y location of the point
     */
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Shifts the x location of the point.
     *
     * @param n the amount to shift the x location
     *          by
     */
    public void shiftX(double n) {
        this.x += n;
    }

    /**
     * Shifts the y location of the point.
     *
     * @param n the amount to shift the y location
     *          by
     */
    public void shiftY(double n) {
        this.y += n;
    }

    /**
     * Computes the distance from one point to
     * another.
     *
     * @param  p2 the second point
     * @return    the distance between the two points
     */
    public double distance(Point p2) {
        return Math.sqrt(Math.pow(this.x - p2.getX(), 2) + Math.pow(this.y - p2.getY(), 2));
    }

    /**
     * Rotates the point by the specified angle
     * around the origin.
     *
     * @param angle the angle to rotate by
     */
    public void rotate(double angle) {
        double oldX = x;

        this.x = (x * Math.cos(angle)) - (y * Math.sin(angle));
        this.y = (oldX * Math.sin(angle)) + (y * Math.cos(angle));
    }

    /**
     * Gives a simple String representation of the
     * point.
     *
     * @return the string representation of the point
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
