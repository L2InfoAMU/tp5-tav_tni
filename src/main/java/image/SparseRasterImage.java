package image;

import javafx.scene.paint.Color;

public class SparseRasterImage extends RasterImage{

    int width;
    int height;
    map<k,v>;

    public SparseRasterImage(Color color , int width, int height) {

    }

    public SparseRasterImage(Color[][] pixels) {

    }


    @Override
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
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
        this.colors[x][y] = color;
    }

    public void setPixelsColor(Color color) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                colors[i][j] = color;
            }
        }
    }

    public void setPixelsColors(Color[][] colors) {
        this.colors = colors.clone();
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void createRepresentation() {
        colors = new Color[getWidth()][getHeight()];
    }
}

}
