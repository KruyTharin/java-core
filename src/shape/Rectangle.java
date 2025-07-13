package shape;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }
}
