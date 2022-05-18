package loopshape;

public class LoopShape {

    static void createRectangle(int width, int height) {
        //Draw a Rectangle
        if (width < 1 || height < 1) {
            return;
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }

    static void createTriangle(int leg) {
        //Draw an Isosceles Right Triangle
        for (int i = 1; i <= leg; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == leg || j == 1 || j == i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
