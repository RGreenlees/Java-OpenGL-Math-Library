/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joml.vector;

/**
 *
 * @author RGreenlees
 */
public class Vector2f {

    public float x;
    public float y;

    public Vector2f() {

    }

    public Vector2f(float newX, float newY) {
        x = newX;
        y = newY;
    }

    public Vector2f(Vector2f clone) {
        x = clone.x;
        y = clone.y;
    }

    /** Sets the X and Y attributes using the supplied float values */
    public void set(float newX, float newY) {
        x = newX;
        y = newY;
    }

    /** Sets this Vector2f to be a clone of v */
    public void set(Vector2f v) {
        x = v.x;
        y = v.y;
    }

    /** Stores the perpendicular of v in dest. Does not modify v */
    public static void perpendicular(Vector2f v, Vector2f dest) {
        dest.x = v.y;
        dest.y = v.x * -1;
    }

    /** Sets this Vector2f to be its perpendicular */
    public void perpendicular() {
        set(y, x * -1);
    }

    /** Subtracts b from a and stores the result in dest. Does not modify a or b */
    public static void sub(Vector2f a, Vector2f b, Vector2f dest) {
        dest.x = a.x - b.x;
        dest.y = a.y - b.y;
    }

    /** Subtracts v from this Vector2f */
    public void sub(Vector2f v) {
        x -= v.x;
        y -= v.y;
    }

    /** Returns the dot product of a and b */
    public static float dot(Vector2f a, Vector2f b) {
        return ((a.x * b.x) + (a.y * b.y));
    }

    /** Returns the dot product of this vector and v */
    public float dot(Vector2f v) {
        return ((x * v.x) + (y * v.y));
    }

    /** Returns the length of a */
    public static float length(Vector2f a) {
        return (float) Math.sqrt((a.x * a.x) + (a.y * a.y));
    }

    /** Returns the length of this Vector2f */
    public float length() {
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /** Returns the distance between the start and end vectors */
    public static float distance(Vector2f start, Vector2f end) {
        return (float) Math.sqrt((end.x - start.x) * (end.x - start.x)
                + (end.y - start.y) * (end.y - start.y));
    }

    /** Returns the distance between this Vector and v */
    public float distance(Vector2f v) {
        return (float) Math.sqrt((v.x - x) * (v.x - x)
                + (v.y - y) * (v.y - y));
    }

    /** Stores a normalized copy of the supplied Vector2f in dest. Does not modify a */
    public static void normalize(Vector2f a, Vector2f dest) {
        float length = (float) Math.sqrt((a.x * a.x) + (a.y * a.y));
        dest.x = a.x / length;
        dest.y = a.y / length;
    }
    
    /** Normalizes this Vector2f */
    public void normalize() {
        float length = (float) Math.sqrt((x * x) + (y * y));
        x /= length;
        y /= length;
    }

}
