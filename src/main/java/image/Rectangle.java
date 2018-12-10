package image;
import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    int x,y,width,height;
    Color color;

    public Rectangle(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public boolean contains(Point point){
        return point.x >= this.x && point.y >= this.y && point.x < (this.width + this.x) && point.y < (this.height + this.y);
    }

    public Color getColor(){
        return color;
    }
}
