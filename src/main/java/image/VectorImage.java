package image;
import javafx.scene.paint.Color;
import java.util.List;

public class VectorImage implements Image {
    List<Shape> shapes ;
    int width;
    int height;

  public  VectorImage(List<Shape> shapes, int width, int height){
      this.width = width;
      this.height = height;
      this.shapes = shapes;


    }

    public Color getPixelColor(int x, int y){
                return shapes.get(shapes.indexOf(new Point(x, y))).getColor();
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }


    protected void setWidth(int width){
        this.width = width;
    }


    protected void setHeight(int height){
      this.height = height;

    }

}
