package image;

import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends RasterImage{
    HashMap<Point, Color> maps;


    public SparseRasterImage(Color color , int width, int height) {
        super(width,height);
        createRepresentation();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                maps.put(new Point(i,j),color );
            }
        }
    }

    public SparseRasterImage(Color[][] pixels) {
        super(pixels.length, pixels[0].length);
        createRepresentation();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                maps.put(new Point(i,j),pixels[i][j]);
            }
        }
    }


    @Override
    public Color getPixelColor(int x, int y) {
        return maps.getOrDefault(new Point(x,y), Color.BLACK);
    }


    public void setPixelsColor(Color color, int x, int y){
        maps.put(new Point(x,y),color);
    }

    public void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                maps.put(new Point(i,j),color);
            }
        }
    }

    public void setPixelsColors(Color[][] colors) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                maps.put(new Point(i,j),colors[i][j]);
            }
        }
    }

    public void createRepresentation() {
        maps = new HashMap<Point, Color>();
    }
}

