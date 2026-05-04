
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
        Picture Temple = new Picture("images/temple.jpg");
        Pixel [] pixels;
        Pixel [] Tpixels;
        
        Tpixels = Temple.getPixels();
        
        Temple.explore();
        // Coordinates (0 , 0) starts at the top left corner 
    
    }
    /**
     * Constructor for objects of class Mirror_Temple
     */
    public static void mirrorTemple(Picture Temple)
    {
        // initialise instance variables
        int width = Temple.getWidth();
        int height = Temple.getHeight();
        Picture leftPixel = null;
        Picture rightPixel = null;
    
        for (int y = 0; y < Temple.getHeight(); y++) 
        {
            // Iterate only through the left half of the width
            for (int x = 0; x < width / 2; x++) 
            {
                leftPixel = Temple.getPixel(x,y);
                rightPixel = Temple.getPixel(width - 1 - x, y);
                rightPixel.getColor(leftPixel.setColor());
            }
            }
        }
    }