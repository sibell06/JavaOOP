package P02_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Point bottomLeftPoint = new Point(coordinates[0], coordinates[1]);
        Point topRightPoint = new Point(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeftPoint, topRightPoint);

        int countPoint = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <= countPoint ; count++) {
            processedPoints(scanner, rectangle);

        }

    }
    private static void processedPoints(Scanner scanner, Rectangle rectangle){
        String coordinatesString = scanner.nextLine();

        int x = Integer.parseInt(coordinatesString.split(" ")[0]);
        int y = Integer.parseInt(coordinatesString.split(" ")[1]);

        Point pointToCheck = new Point(x, y);
        System.out.println(rectangle.contains(pointToCheck));
    }
}
