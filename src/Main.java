public class Main {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(10, 20);
        System.out.println("Original Point: " + point);

        ImmutablePoint newPoint = point.move(5, 5);
        System.out.println("New Point: " + newPoint);

        System.out.println("Original Point (unchanged): " + point);
    }
}
