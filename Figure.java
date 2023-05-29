public abstract class Figure {
    Paint point;
    double p, s;
    public abstract double area();
    public abstract double perimetr();

    public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW,
        BLACK
    }
}