package PointCircleCylinder;

public class Point {
	private int x;
	private int y;

	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("X-coordinate: " + x);
        sb.append(" | Y-coordinate: " + y);
		return sb.toString();
	}

	public boolean equals(Object obj) {
		boolean ans = false;
		if (obj instanceof Point) {
			Point point = (Point)obj;
			if(point.x == this.x && point.y == this.y){
				ans = true;
			}
		}
		return ans;
	}
}