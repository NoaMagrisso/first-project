public class Rectangle extends AQuadrant{

    public Rectangle(String name, double sideAC, double sideBD) {
        super(name, sideAC * sideBD, (sideAC + sideBD) * 2, sideAC, sideBD, sideAC, sideBD);
    }

    public Rectangle(double sideAC, double sideBD) {
        //this("Rectangle", sideAC, sideBD); //it is the way to call the instructor of this class
        this(Rectangle.class.getSimpleName(), sideAC, sideBD);
    }

    @Override
    public void draw() {
        System.out.println(getName() + " drawm!");
    }
}
