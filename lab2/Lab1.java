import java.util.Scanner;

public class Lab1 {
	public static void main(String[] argv) {
		
		System.out.println("Введите 3 точки");

		Point3d firstPoint = createNewPoint();
		System.out.println();
		Point3d secondPoint = createNewPoint();
		System.out.println();
		Point3d thridPoint = createNewPoint();
		System.out.println();

		if (firstPoint.equals(secondPoint)) {
			System.out.println("Не должно быть равных точек");
		} else if(secondPoint.equals(thridPoint)) {
			System.out.println("Не должно быть равных точек");
		} else if(firstPoint.equals(thridPoint)) {
			System.out.println("Не должно быть равных точек");
		} else {
			double result = computeArea(firstPoint, secondPoint, thridPoint);
			System.out.println("Площадь равна: " + result);
		}
	}

	public static Point3d createNewPoint() {
		Scanner scanner = new Scanner(System.in);
		double xCoord = scanner.nextDouble();
		double yCoord = scanner.nextDouble();
		double zCoord = scanner.nextDouble();
		return new Point3d(xCoord, yCoord, zCoord);
	}

	public static double computeArea(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
		return Math.sqrt(
			(firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) * 
			(- firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) * 
			(firstPoint.distanceTo(secondPoint) - secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) * 
			(firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) - thridPoint.distanceTo(firstPoint))) / 4;
	}
} 