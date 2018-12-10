package image;

import javafx.scene.paint.Color;
import util.Matrices;

import java.util.LinkedList;
import java.util.List;

public class PaletteRasterImage extends RasterImage{
    int width;
    int height;
    List<Color> palette;
    int[][] indexesOfColors;

    public  PaletteRasterImage(Color color, int width, int height){
        super(width, height);
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);

    }


    public PaletteRasterImage(Color[][] pixels) {
        super(pixels.length, pixels[0].length);
        Matrices.requiresNonZeroDimensions(pixels);
        Matrices.requiresRectangularMatrix(pixels);
        width = pixels.length;
        height = pixels[0].length;
        createRepresentation();
        setPixelsColors(pixels);

        }


    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }


    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color))
            palette.add(color);
        indexesOfColors[x][y] = palette.indexOf(color);
    }

    public void setPixelsColor(Color color) {
        if(!palette.contains(color))
            palette.add(color);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                indexesOfColors[i][j] = palette.indexOf(color);
            }
        }
    }

    public void setPixelsColors(Color[][] colors) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                setPixelColor(colors[i][j], i, j);
            }
        }
    }


    public void createRepresentation() {
        indexesOfColors = new int[getWidth()][getHeight()];
        palette = new LinkedList<>();
    }
}
