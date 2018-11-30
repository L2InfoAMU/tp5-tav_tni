package image;
import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image {
    Color color;
    Color[][] colors;
    int width;
    int height;


    public BruteRasterImage(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                colors[i][j] = color;
            }
        }
    }

    public BruteRasterImage(Color [][] colors){
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
        width = colors.length;
        height = colors[0].length;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++){
                this.colors[i][j] = colors[i][j];
            }
        }
    }


}
