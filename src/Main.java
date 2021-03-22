import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        playWithShapes();
    }

    private static void playWithShapes() {
        List<AShape> shapes = getShapes();
        printShapes(shapes);
    }

    private static List<AShape> getShapes() {
        List<AShape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3, 7));
        shapes.add(new Circle(8));
        shapes.add(new Square(5));
        return shapes;
    }


    private static void printShapes(List<AShape> shapes) {
        for (AShape shape : shapes){
            System.out.println("************************");
            System.out.println("Global details:");
            shape.printGlobalDetails();
            System.out.println("Print Dimensions:");
            shape.printDimensions();
            
        }
    }


}
