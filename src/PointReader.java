import java.util.*;

public class PointReader {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Point> list = new ArrayList<>();
		
		while (in.hasNextDouble()) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			Point p = new Point(x,y);
			if (! list.contains(p)) {
				list.add(p);
			}
		}
		System.out.printf("read %d points\n", list.size());
		System.out.println(list);
	}
}
