package org.cvtc.shapes;

import javax.swing.*;

public class Cuboid extends Shape{

    // Variables, bool for checking if values are positive
    float width = 0.0F;
    float height = 0.0F;
    float depth = 0.0F;
    boolean isPositive = true;


    // Getters and setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    // Overloaded constructor. cWidth (c stands for cuboid)
    public Cuboid(float cWidth, float cHeight, float cDepth) {
        // If statement to see if values are negative, then isPositve to false. Otherwise, run as normal.
        if (cWidth < 0 || cHeight < 0 || cDepth < 0) {
            isPositive = false;
        } else {
            width = cWidth;
            height = cHeight;
            depth = cDepth;
        }

    }

    // Formula for getting surface area of cuboid is: 2(dw + wh + hd)
    @Override
    public float surfaceArea() {
        return (2.0F * ((depth * width) + (width * height) + (height * depth)));
    }

    // Formula for getting volume of cuboid is: (h * w * d)
    @Override
    public float volume() {
        return height * width * depth;
    }

    // Render method for computing SA and Volume and showing in a message box
    @Override
    public void render() {

        // If statement for showing dimensions of cuboid, SA, and volume.
        if (isPositive) {
            JOptionPane.showMessageDialog(null, "\nThe dimensions of the Cuboid are: Depth: " + depth + " Height: " + height + " Width: " + width + " \nThe surface Area is: " + surfaceArea() + " \nThe volume is: " + volume());
        } else {
            // Else statement for if user enters negative values for the dimensions of cuboid
            JOptionPane.showMessageDialog(null, "One or more values for the Cuboid is not positive.");
        }

    }
}
