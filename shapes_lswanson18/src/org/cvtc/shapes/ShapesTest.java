package org.cvtc.shapes;

public class ShapesTest {

    public static void main(String[] args) {


        Shape cuboid = new Cuboid(20.54F, 30.23f, 11.4f);
        Shape sphere = new Sphere(15f);
        Shape cylinder = new Cylinder(10f, 5f);



        cuboid.render();
        sphere.render();
        cylinder.render();


    }

}
