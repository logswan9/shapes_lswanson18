package org.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shape{

    // Variables, bool for checking if values are positive
    float radius = 0.0F;
    boolean isPositive = true;


    // Getters and setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    // Overloaded constructor. sRadius (s stands for Sphere)
    public Sphere(float sRadius) {
        // If statement to see if values are negative, then isPositve to false. Otherwise, run as normal.
        if (sRadius < 0) {
            isPositive = false;
        } else {
            radius = sRadius;
        }

    }

    // Formula for getting SA of Sphere is: 4 * PI * r^2
    @Override
    public float surfaceArea() {
        return (float) (4F * Math.PI * (radius * radius));
    }

    // Formula for getting Volume of Sphere is: 4/3 * PI * r^3
    @Override
    public float volume() {
        return (float) ((4F / 3F) * Math.PI * (radius * radius * radius));
    }

    // Render method for computing SA and Volume and showing in a message box
    @Override
    public void render() {
        // If statement for showing radius of Sphere, SA, and volume.
        if (isPositive) {
            JOptionPane.showMessageDialog(null, "\nThe dimensions of the Sphere are: Radius: " + radius + " \nThe surface Area is: " + surfaceArea() + " \nThe volume is: " + volume());
        } else {
            // Else statement for if user enters negative value for radius
            JOptionPane.showMessageDialog(null, "The radius value for the Sphere is not positive.");
        }
    }
}
