package PointCircleCylinder;

import java.util.*;

public class Circle{
	float radius;
	Point center;

    public Circle(){}

    public Circle(float radius, Point center){
		this.radius = radius;
		this.center = center;
    }

	public void setRadius(float radius){
		this.radius = radius;
	}

	public void setCenter(Point center){
		this.center = center;
	}

	public float getRadius(){
		return radius;
	}

	public Point getCenter(){
		return center;
	}

    public float area(){
		return (float) (Math.PI * radius * radius);
    }

    public float circumference(){
		return (float) (2 * Math.PI * radius);
    }

	public String toString(){
		return "Center: " + center + " | Radius: " + radius;
	}

	public boolean equals(Object obj){
		boolean ans=false;
		if(obj instanceof Circle){
			Circle c = (Circle)obj;
			if(this.center.equals(c.center) && this.radius==c. radius)
				ans=true;
		}
		return ans;
	}

	public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle 1 radius: ");
		float r1 = input.nextFloat();
        System.out.println("Enter circle 1 center x: ");
        int x1 = input.nextInt();
        System.out.println("Enter circle 1 center y: ");
        int y1 = input.nextInt();
        Point pt1 = new Point(x1,y1);
        Circle circ1 = new Circle(r1,pt1);

        System.out.println("Enter circle 2 radius: ");
		float r2 = input.nextFloat();
        System.out.println("Enter circle 2 center x: ");
        int x2 = input.nextInt();
        System.out.println("Enter circle 2 center y: ");
        int y2 = input.nextInt();
        Point pt2 = new Point(x2,y2);
		Circle circ2 = new Circle(r2,pt2);

        if(circ1.equals(circ2))
            System.out.println("\nEqual");
        else
            System.out.println("\nNot Equal");

		System.out.println("\nCircle 1: " + circ1);
		System.out.println("Circle 1 area: " + circ1.area());
		System.out.println("Circle 1 circumference: " + circ1.circumference());
		System.out.println("\nCircle 2: " + circ2);
		System.out.println("Circle 2 area: " + circ2.area());
		System.out.println("Circle 2 circumference: " + circ2.circumference());
	}
}