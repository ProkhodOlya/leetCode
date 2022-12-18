public class Box {
    private double width;
    private double height;
    private double depth;

    Box() {

    }

    Box(double w, double height, double depth) {
        width = w;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    double getWidth() {
        return width;
    }

    void showWidth() {
        System.out.println("Ширина " + width);
    }
}
