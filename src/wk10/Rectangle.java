package wk10;

public class Rectangle extends Shape{

    int length, width;
    @Override
    public double area(){
        return length * width;
    }

    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    public Rectangle(){}
    public Rectangle(String name, int sides){
        super(name, sides);
    }
    public Rectangle(String name, int sides, int length, int width){
        super(name, sides);
        this.length = length;
        this.width = width;
    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
}
