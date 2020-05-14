import java.util.*;

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

static class Static{
	public int a = 20;
	static int b = 0;
}

public class test001 {
	public static void main(String[] arg) {
		int a = 10;
		Static.b = a;
		Static st = new Static();

		system.out.println(Static.b++);
		system.out.println(st.b);
	}
}