package de.mathlib;

public class Vector3 {

    public final float x, y, z;

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float length(){
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3 add(float x, float y, float z) {
        return new Vector3(this.x + x, this.y + y, this.z + z);
    }
    public Vector3 add(Vector3 vec) {
        return new Vector3(this.x + vec.x, this.y + vec.y, this.z + vec.z);
    }

    public Vector3 sub(float x, float y, float z) {
        return new Vector3(this.x - x, this.y - y, this.z - z);
    }
    public Vector3 sub(Vector3 vec) {
        return new Vector3(this.x - vec.x, this.y - vec.y, this.z - vec.z);
    }

    public Vector3 mult(float fac) {
        return new Vector3(x * fac, y * fac, z * fac);
    }
    public Vector3 mult(float xFac, float yFac, float zFac) {
        return new Vector3(x * xFac, y * yFac, z * zFac);
    }
    public Vector3 mult(Vector3 velFac) {
        return new Vector3(x * velFac.x, y * velFac.y, z * velFac.z);
    }

    public Vector3 div(float div) {
        return new Vector3(x / div, y / div, z / div);
    }
    public Vector3 div(float divX, float divY, float divZ) {
        return new Vector3(x / divX, y / divY, z / divZ);
    }
    public Vector3 div(Vector3 divVec) {
        return new Vector3(x / divVec.x, y / divVec.y, z / divVec.z);
    }

    public Vector3 normalize() {
        return div(length());
    }

    public float dot(Vector3 vec) {
        return x * vec.x + y * vec.y + z * vec.z;
    }

    public Vector3 clamp(Vector3 min, Vector3 max) {
        return new Vector3(x < min.x ? min.x : x > max.x ? max.x : x, y < min.y ? min.y : y > max.y ? max.y : y, z < min.z ? min.z : z > max.z ? max.z : z);
    }

    @Override
    protected Vector3 clone() throws CloneNotSupportedException {
        return new Vector3(x, y, z);
    }

}
