import java.util.*;
public class Fun__Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(Area(b));
		System.out.println(Square_area(a));
	}
	public static int Area(int a) {
		int ar=(int)(3.14*Math.pow(a, 2));
		return ar;
	}
	public static int Square_area(int b) {
		int ar = b*b;
		return ar;
	}

}
