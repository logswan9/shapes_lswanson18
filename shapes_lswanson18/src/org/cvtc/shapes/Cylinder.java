package org.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shape{

    // Variables, bool for checking if values are positive
    float radius = 0.0F;
    float height = 0.0F;
    boolean isPositive = true;

    // Getters and Setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Overloaded Constructor with cRadius, c is for Cylinder
    public Cylinder(float cRadius, float cHeight) {
        // If statement to see if values are negative, then isPositve to false. Otherwise, run as normal.
        if (cRadius < 0 || cHeight < 0) {
            isPositive = false;
        } else {
            radius = cRadius;
            height = cHeight;
        }

    }

    // Formula for getting SA of cylinder is: (2 * PI * r * h) + (2 * PI * r^2)
    @Override
    public float surfaceArea() {
        return (float) ((2F * Math.PI * radius * height) + (2F * Math.PI * (radius * radius)));
    }

    // Formula for getting Volume of cylinder is: PI * r^2 * h
    @Override
    public float volume() {
        return (float) (Math.PI * (radius * radius) * height);
    }

    // Render method for computing SA and Volume and showing in a message box
    @Override
    public void render() {
        // If statement for showing dimensions of cylinder, SA, and volume.
        if (isPositive) {
            JOptionPane.showMessageDialog(null, "\nThe dimensions of the Cylinder are: Radius: " + radius + " Height: " + height + " \nThe surface Area is: " + surfaceArea() + " \nThe volume is: " + volume());
        } else {
            // Else statement for if user enters negative values for the dimensions of cylinder
            JOptionPane.showMessageDialog(null, "One or more values for the Cylinder is not positive.");
        }
    }
}
