public class Circle extends AShape {
    private double radius;

    public Circle(String name, double radius){
        super(name, Math.PI * Math.pow(2, radius),
                2 * Math.PI * radius);
        this.radius = radius;
    }

    public Circle(double radius){
        this(Circle.class.getSimpleName(), radius);
    }


    @Override
    public void draw() {
        System.out.println(this.getName() + " drawn!");
    }

    @Override
    public void printDimensions() {
        System.out.println("Radius: " + radius);
    }
}
