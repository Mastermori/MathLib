package de.mathlib;

public class Vector2 {

    public final float x, y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float length() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vector2 add(float x, float y) {
        return new Vector2(this.x + x, this.y + y);
    }
    public Vector2 add(Vector2 vec) {
        return new Vector2(this.x + vec.x, this.y + vec.y);
    }

    public Vector2 sub(float x, float y) {
        return new Vector2(this.x - x, this.y - y);
    }
    public Vector2 sub(Vector2 vec) {
        return new Vector2(this.x - vec.x, this.y - vec.y);
    }

    public Vector2 mult(float fac) {
        return new Vector2(x * fac, y * fac);
    }
    public Vector2 mult(float xFac, float yFac) {
        return new Vector2(x * xFac, y * yFac);
    }
    public Vector2 mult(Vector2 velFac) {
        return new Vector2(x * velFac.x, y * velFac.y);
    }

    public Vector2 div(float div) {
        return new Vector2(x / div, y / div);
    }
    public Vector2 div(float divX, float divY) {
        return new Vector2(x / divX, y / divY);
    }
    public Vector2 div(Vector2 divVec) {
        return new Vector2(x / divVec.x, y / divVec.y);
    }

    public Vector2 normalize() {
        return div(length());
    }

    public float dot(Vector2 vec) {
        return x * vec.x + y * vec.y;
    }

    public Vector2 clamp(Vector2 min, Vector2 max) {
        return new Vector2(x < min.x ? min.x : x > max.x ? max.x : x, y < min.y ? min.y : y > max.y ? max.y : y);
    }

    @Override
    protected Vector2 clone() throws CloneNotSupportedException {
        return new Vector2(x, y);
    }
}
