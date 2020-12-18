package de.mathlib;

public class Vector2 {

    // Commonly used vectors
    public static final Vector2 ZERO = new Vector2(0,0), UP = new Vector2(0, -1), DOWN = new Vector2(0, 1),
    LEFT = new Vector2(-1, 0), RIGHT = new Vector2(1, 0), ONE = new Vector2(1, 1);

    public static Vector2 toCartesian(double magnitude, double angle) {
        return new Vector2(magnitude * Math.cos(angle), magnitude * Math.sin(angle));
    }


    // Vector 2 components (final as permutation is not intended, only new Vector2's are returned in calculations)
    public final double x, y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 add(double x, double y) {
        return new Vector2(this.x + x, this.y + y);
    }
    public Vector2 add(Vector2 vec) {
        return new Vector2(this.x + vec.x, this.y + vec.y);
    }

    public Vector2 sub(double x, double y) {
        return new Vector2(this.x - x, this.y - y);
    }
    public Vector2 sub(Vector2 vec) {
        return new Vector2(this.x - vec.x, this.y - vec.y);
    }

    public Vector2 mult(double scalar) {
        return new Vector2(x * scalar, y * scalar);
    }
    public Vector2 mult(double xScalar, double yScalar) {
        return new Vector2(x * xScalar, y * yScalar);
    }
    public Vector2 mult(Vector2 scalarVec) {
        return new Vector2(x * scalarVec.x, y * scalarVec.y);
    }

    public Vector2 div(double div) {
        return new Vector2(x / div, y / div);
    }
    public Vector2 div(double divX, double divY) {
        return new Vector2(x / divX, y / divY);
    }
    public Vector2 div(Vector2 divVec) {
        return new Vector2(x / divVec.x, y / divVec.y);
    }

    public double dot(Vector2 vec) {
        return x * vec.x + y * vec.y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    public double distanceTo(Vector2 vec) {
        return distanceTo(vec.x, vec.y);
    }

    public double angle() {
        return Math.atan2(y, x);
    }

    public Vector2 normalized() {
        return div(length());
    }

    public Vector2 reversed() {
        return new Vector2(-x, -y);
    }
    
    public Vector2 rotated(double angle) {
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        return new Vector2(x * cos - y * sin, x * sin + y * cos);
    }

    public Vector2 rotatedTo(double angle) {
        return toCartesian(length(), angle);
    }

    public Vector2 clamp(Vector2 min, Vector2 max) {
        return new Vector2(Math.max(Math.min(x, max.x), min.x), Math.max(Math.min(y, max.y), min.y));
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector2 vector2 = (Vector2) o;

        if (Double.compare(vector2.x, x) != 0) return false;
        return Double.compare(vector2.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    protected Vector2 clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning a Vector2 is not necessary, as it's fields are final.");
    }

}
