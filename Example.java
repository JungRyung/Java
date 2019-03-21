import java.util.Scanner;

class Point{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object ob){
		Point p = (Point)ob;
		return this.x == p.x && this.y == p.y;
	}
}

public class Example {
	public static void main(String[] arg) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		Point p3 = new Point(3,4);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
	}
}