public abstract class AQuadrant extends AShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public AQuadrant(String name, double area, double perimeter, double sideA, double sideB, double sideC, double sideD) {
        super(name, area, perimeter);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    @Override
    public void printDimensions() {
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.println("Side D: " + sideD);
    }
}
