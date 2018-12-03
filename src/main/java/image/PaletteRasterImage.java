package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class PaletteRasterImage implements Image{
    int width;
    int height;
    Color[][] pixels;

    public  PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);

    }


    public PaletteRasterImage(Color[][] pixels) {
        Matrices.requiresNonZeroDimensions(pixels);
        Matrices.requiresRectangularMatrix(pixels);
        width = pixels.length;
        height = pixels[0].length;
        createRepresentation();
        for (int i = 0; i < width; i++){
            for( int j = 0; j < height; j++){
                this.pixels[i][j] = pixels[i][j];
            }
        }


    }


    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setPixelsColor(Color color, int x, int y){
        this.pixels[x][y] = color;
    }

    public void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                pixels[i][j] = color;
            }
        }
    }

    public void setPixelsColors(Color[][] colors) {
        this.pixels = pixels.clone();
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void createRepresentation() {
        pixels = new Color[getWidth()][getHeight()];
    }
}
