package RTTI;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by c-consalpa on 7/11/2017.
 */
public class Main {
    public static void main(String[] args) {


        try {
            Class c = Class.forName("RTTI.Circle");
            Class sh = c.getSuperclass();
            Object ob = sh.newInstance();




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Shape {
    public Shape() {
        System.out.println("Created: "+this);
    }
    public int i;
    public void draw() {
        System.out.println(this+" draw()");
    }
}

class Triangle extends Shape {
public Triangle() {
    System.out.println("Created: "+this);
}
}

class Circle extends Shape {
    public Circle() {
        System.out.println("Created: "+this);
    }
}
