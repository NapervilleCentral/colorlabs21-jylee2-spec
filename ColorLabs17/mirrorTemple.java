
/**
 * take image called temple and reflect the left side of the image so that the temple 
 * has a complete sides
 *
 * @author (Joshua)
 * @version (4/30/26)
 */
import java.awt.*; // brings color class
import java.util.*;
import java.util.List;

public class mirrorTemple
{
    public static void main(String [] args)
    {
        Picture Temple = new Picture("images\\Temple.jpg");
        Pixel [] pixels;
        Pixel [] Tpixels;
        
        Tpixels = Temple.getPixels();
        
        mirrorTemple(Temple);
        // Coordinates (0 , 0) starts at the top left corner 
    
    }
    /**
     * Constructor for objects of class Mirror_Temple
     */
    public static void mirrorTemple(Picture temple)
    {
        int width = temple.getWidth();
        int height = temple.getHeight();
    
        Pixel leftPixel = null;
        Pixel rightPixel = null; // getting error for pixel at home
        // possible due to library not being implemented, but cant find the option
    
        for (int y = 0; y < 100; y++) 
        {
            for (int x = 0; x < width / 2; x++) 
            {
                leftPixel = temple.getPixel(x, y);
                rightPixel = temple.getPixel(width - 1 - x, y);
    
                rightPixel.setColor(leftPixel.getColor());
            }
        }
        temple.explore();
    }
    }