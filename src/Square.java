public class Square extends Rectangle {
    public Square(String name, double side){
        super(name, side, side);
    }

    public Square(double side){
        this(Square.class.getSimpleName(), side);
    }
}
