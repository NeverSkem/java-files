package PointCircleCylinder;

import java.util.*;

public class Cylinder {
    Circle circle;
    float height;

    public Cylinder(){}

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

	public String toString(){
        return "Center: " + circle.getCenter() + " | Radius: " + circle.getRadius() + " | Height: " + height;
	}

    public boolean equals(Object obj){
        boolean ans=false;
        if(obj instanceof Cylinder){
            Cylinder c = (Cylinder) obj;
            if(c.getCircle().equals(circle) && c.getHeight() == height){
                ans=true;
            }
        }
        return ans;
    }

    public float area(){
        return (float) (2 * circle.area() + 2 * Math.PI * circle.getRadius() + height);
    }

    public float volume(){
        return (float) (circle.area() * height);
    }

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Cylinder 1 radius: ");
        float r1 = input.nextFloat();
        System.out.println("Enter Cylinder 1 height: ");
        float h1 = input.nextFloat();
        System.out.println("Enter cylinder 1 center x: ");
        int x1 = input.nextInt();
        System.out.println("Enter cylinder 1 center y: ");
        int y1 = input.nextInt();
        Point pt1 = new Point(x1,y1);
        Circle circ1 = new Circle(r1,pt1);
        Cylinder cyl1 = new Cylinder(circ1,h1);


        System.out.println("Enter cylinder 2 radius: ");
        float r2 = input.nextFloat();
        System.out.println("Enter cylinder 2 height: ");
        float h2 = input.nextFloat();
        System.out.println("Enter cylinder 2 center x: ");
        int x2 = input.nextInt();
        System.out.println("Enter cylinder 2 center y: ");
        int y2 = input.nextInt();
        Point pt2 = new Point(x2,y2);
        Circle circ2 = new Circle(r2,pt2);
        Cylinder cyl2 = new Cylinder(circ2,h2);

        if(cyl1.equals(cyl2))
            System.out.println("\nEqual");
        else
            System.out.println("\nNot Equal");

        System.out.println("\nCylinder 1: " + cyl1);
        System.out.println("Cylinder 1 area: " + cyl1.area());
        System.out.println("Cylinder 1 circumference: " + cyl1.volume());
        System.out.println("\nCylinder 2: " + cyl2);
        System.out.println("Cylinder 2 area: " + cyl2.area());
        System.out.println("Cylinder 2 circumference: " + cyl2.volume());
	}
}


