package PointCircleCylinder;

import java.util.*;

public class Cylinder {
    private Circle circle;
    private float height;

    public Cylinder() {}

    public Cylinder(Circle circle, float height) {
        this.circle = circle;
        this.height = height;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Circle getCircle() {
		return circle;
    }

    public float getHeight() {
        return height;
    }

    public float area() {
        return (float) (2 * circle.area() + 2 * Math.PI * circle.getRadius() + height);
    }

    public float volume() {
        return (float) (circle.area() * height);
    }

	public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(circle.getCenter());
        sb.append(" | Radius: " + circle.getRadius());
        sb.append(" | Height: " + height);
        sb.append("\nArea: " + area());
        sb.append(" | Volume: " + volume());
        return sb.toString();
	}

    public boolean equals(Object obj) {
        boolean ans = false;
        if (obj instanceof Cylinder) {
            Cylinder cylinder = (Cylinder) obj;
            if (cylinder.getCircle().equals(this.circle) && cylinder.getHeight() == this.height){
                ans = true;
            }
        }
        return ans;
    }

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Cylinder 1 radius: ");
        float r1 = input.nextFloat();
        System.out.print("Input Cylinder 1 height: ");
        float h1 = input.nextFloat();
        System.out.print("Input cylinder 1 center x: ");
        int x1 = input.nextInt();
        System.out.print("Input cylinder 1 center y: ");
        int y1 = input.nextInt();
        Point pt1 = new Point(x1, y1);
        Circle circ1 = new Circle(r1, pt1);
        Cylinder cyl1 = new Cylinder(circ1, h1);

        System.out.print("Input cylinder 2 radius: ");
        float r2 = input.nextFloat();
        System.out.print("Input cylinder 2 height: ");
        float h2 = input.nextFloat();
        System.out.print("Input cylinder 2 center x: ");
        int x2 = input.nextInt();
        System.out.print("Input cylinder 2 center y: ");
        int y2 = input.nextInt();
        Point pt2 = new Point(x2, y2);
        Circle circ2 = new Circle(r2, pt2);
        Cylinder cyl2 = new Cylinder(circ2, h2);

        if(cyl1.equals(cyl2))
            System.out.println("\nEqual");
        else
            System.out.println("\nNot Equal");

        System.out.println("\nCylinder 1\n" + cyl1);
        System.out.println("\nCylinder 2\n" + cyl2);
	}
}


