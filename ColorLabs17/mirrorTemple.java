
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
    public void mirrorTemple(int [] [] pixels)
    {
        // initialise instance variables
        int height = pixels.length;
        int width = pixels[0].length;
        
    }
}
